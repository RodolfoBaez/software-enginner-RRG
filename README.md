# software-enginner-RRG
We are currently going to create an API to solve a problem for Assignment 2. The task involves creating an API to solve the Collatz Sequence. Any positive integer X below 1 million can be subjected to the following operations until it reaches 1:

If X is even: X/2
If X is odd: 3X + 1
By repeatedly applying these operations, any number will eventually reach 1. The problem is considered solved when the output is 1.

Example: input is 17
17 is odd, so perform the operation 3 * 17 + 1 = 52
52 is even, so perform the operation 52 / 2 = 26
26 is even, so perform the operation 26 / 2 = 13
13 is odd, so perform the operation 3 * 13 + 1 = 40
40 is even, so perform the operation 40 / 2 = 20
20 is even, so perform the operation 20 / 2 = 10
10 is even, so perform the operation 10 / 2 = 5
5 is odd, so perform the operation 3 * 5 + 1 = 16
16 is even, so perform the operation 16 / 2 = 8
8 is even, so perform the operation 8 / 2 = 4
4 is even, so perform the operation 4 / 2 = 2
2 is even, so perform the operation 2 / 2 = 1

System Diagram
![Screenshot 2024-02-06 155718](https://github.com/RodolfoBaez/software-enginner-RRG/assets/47578524/0ebfad58-c34d-4652-8793-0477e63223b8)
