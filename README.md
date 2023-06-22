# Sum of Digits

This Java program calculates the sum of digits in a given number using recursion.

## Usage

1. Ensure you have Java installed on your system.
2. Clone the repository or download the `SumOfDigits.java` file.
3. Compile the Java file using the command: `javac SumOfDigits.java`.
4. Run the program using the command: `java SumOfDigits`.
5. The program will calculate the sum of digits in the number and display the result.

## Code Explanation

The program consists of the following components:

- `SumofDigits` method: This method takes an integer `n` as a parameter and recursively calculates the sum of its digits. If `n` is 0, it returns 0 as the base case for the recursion. Otherwise, it calculates the remainder of `n` divided by 10 (`n % 10`), which gives the rightmost digit of the number. It then recursively calls `SumofDigits` with `n/10` to process the remaining digits. Finally, it returns the sum of the rightmost digit and the recursive sum.
- `main` method: This is the entry point of the program. It initializes a variable `num` with the input number. It calls the `SumofDigits` method with `num` and stores the result in the `result` variable. Finally, it prints the result using the `System.out.println` statement.

## Example

Let's say we have the number `12345`. The program will calculate the sum of its digits, which is `15`. The output will be:

