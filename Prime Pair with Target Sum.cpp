class Solution {
public:
    // Function to generate all prime numbers up to n using the Sieve of Eratosthenes
    std::vector<int> getPrime(int n) {
        std::vector<bool> primes(n + 1, true); // Boolean array to mark primes
        primes[0] = primes[1] = false; // 0 and 1 are not prime numbers
        
        // Mark non-prime numbers
        for (int i = 2; i * i <= n; ++i) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false; // Mark multiples of i as non-prime
                }
            }
        }
        
        // Extract prime numbers from the boolean array
        std::vector<int> ans;
        for (int i = 2; i <= n; ++i) {
            if (primes[i]) {
                ans.push_back(i); // Add prime numbers to the list
            }
        }
        
        return ans; // Return the list of prime numbers
    }

    // Function to find two prime numbers that sum up to n
    std::vector<int> getPrimes(int n) {
        std::vector<int> prime = getPrime(n); // Get all primes up to n
        int sz = prime.size();
        int low = 0, high = sz - 1;
        
        // Use two-pointer technique to find the prime pair
        while (low <= high) {
            int sum = prime[low] + prime[high];
            if (sum == n) {
                return {prime[low], prime[high]}; // Return the prime pair if sum is equal to n
            } else if (sum < n) {
                ++low; // Move the low pointer to the right if sum is less than n
            } else {
                --high; // Move the high pointer to the left if sum is greater than n
            }
        }
        
        return {-1, -1}; // Return {-1, -1} if no such pair is found
    }
};