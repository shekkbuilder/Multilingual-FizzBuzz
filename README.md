Multilingual-FizzBuzz
=====================

Trying to write FizzBuzz in as many languages as I can whenever I'm bored.

## Solutions to FizzBuzz in Different Languages for Fun

> Write a program that prints the integers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".

### Solution
We loop from 1 to 100, and then each time whether the number is multiple of three or five or both or none. For example, to check whether 9 is multiple of 3 or not we divide 9 by 3 which gives us 3 with remainder 0. If the division results 0 remainder than the number is multiple of number divided by. Many programming languages provide a easier way to check the remainder in the form of modular division. For example, in Java 9 % 3 gives the remainder of the division 9 by 3. We can use this modular division to write our fizz buzz program.

### Check
Simply pipe the output of your program to diff and comapre it with expect_output.txt by

```bash
ujjwol@mycomputer:Fun/FizzBuzz$ ./Node.Js/FizzBuzz.js | diff expected_output.txt -
ujjwol@mycomputer:Fun/FizzBuzz$
```
No output in the shell means, there is no difference hence your FizzBuzz matches the expected output.

### Expected Output
```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
Fizz
22
23
Fizz
Buzz
26
Fizz
28
29
FizzBuzz
31
32
Fizz
34
Buzz
Fizz
37
38
Fizz
Buzz
41
Fizz
43
44
FizzBuzz
46
47
Fizz
49
Buzz
Fizz
52
53
Fizz
Buzz
56
Fizz
58
59
FizzBuzz
61
62
Fizz
64
Buzz
Fizz
67
68
Fizz
Buzz
71
Fizz
73
74
FizzBuzz
76
77
Fizz
79
Buzz
Fizz
82
83
Fizz
Buzz
86
Fizz
88
89
FizzBuzz
91
92
Fizz
94
Buzz
Fizz
97
98
Fizz
Buzz
```

Nothing outputted means, there is no difference hence, the FizzBuzz matches the expected output.
