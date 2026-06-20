# Repository Swap — Beginner
Objective: Code UserService against a UserRepository
interface and swap two implementations.

Setup: JDK 17
1. Define the UserRepository interface
2. Write JPA-style + in-memory implementations
3. Inject each via constructor into UserService
4. Run the same service logic against both

Validation: Identical behavior; in-memory test needs no DB.
