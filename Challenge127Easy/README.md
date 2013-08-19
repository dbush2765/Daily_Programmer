[1]: http://www.reddit.com/r/dailyprogrammer/comments/1f7qp5/052813_challenge_127_easy_mccarthy_91_function/
[2]: http://en.wikipedia.org/wiki/McCarthy_91_function

###[Challenge 127 [Easy] McCarthy 91 Function][1]

*Last Update: 8/19/2013*

The [McCarthy 91 Function][2] is a recursive function which, given an integer N, returns the integer 91 if N is equal to or smaller than 100, or simply N-10 if N is greater than 100. Sounds simple, but look at the function definition in the linked Wikipedia article! How could such a function work to always return a constant (for N <= 100) that isn't in the function body? Well, that's your task: write out each step that McCarthy's function does for a given integer N.

You must output what the function does on each recursion: first you must print the function the expression that is being computed, and then print which condition it took. Simply put, you must print each recursion event in the following string format: "<Expression being executed> since <is greater than | is equal to or less than> 100". Note that for the first line you do not need to print the "since" string (see example below). You should also print the final expression, which is the result.

#####Known Issues
-	The second to last output line is printing incorrectly. For example, rather than printing "91 since 101 is…", it's printing "M(91) since 101 is…". Currently working on finding a fix for this.