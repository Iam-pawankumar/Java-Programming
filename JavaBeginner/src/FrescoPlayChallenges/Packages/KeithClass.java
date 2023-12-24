package FrescoPlayChallenges.Packages;

public class KeithClass {
    public String getInput(String conversation) {
        ExtractString e = new ExtractString();
        return e.getInput(conversation);
    }
}

/*PROBLEM STATEMENT==================================================================

 * A: Hello, Priya 3 speaking. Is this Aditi? B: Yeah Priya! I am there 28. A: How are
you dear? B: I am fine 19. What about you Priya 75? A: Glad to hear that! Me too
fine! seven. Aditi how are your five holidays going? B: Great Priya! I am enjoying
well!
Sample Output:
287512
Explanation:
From the input data, the digits deciphered are 3, 28, 19, 75. Out of these, 28 and 75
are Keith composite numbers. The numbers in text form are seven and five, and the
sum of these numbers is 12. The concatenation of these numbers is 287512, which is
the secret code.
A Keith number is an n-digit integer N such that if a Fibonacci-like sequence (in
which each term in the sequence is the sum of the n previous terms) is formed with
the first n terms taken as the decimal digits of the number N, N itself occurs as a
term in the sequence. For example, 197 is a Keith number since it generates the
sequence 1, 9, 7,1+9+7=17, 9+7+17=33, 7+17+33=57, 17+33+57=107,
33+57+107=197, ... (Keith). Keith numbers are also called repfigit (repetitive
fibonacci-like digit) numbers.
A composite number is a positive integer that is not a prime number (contains
factors other than 1 and itself).
*
* 1, 4 == 1+4=5, 4+5=9 9+5=14
=======================================================================================
*/



