/*
If 1<=n<=9, then print the lowercase English word corresponding to the number (e.g., one for 1, two for 2, etc.); otherwise, print Greater than 9 instead.
*/

#include <stdio.h>

int main(void)
{
    int n;
    scanf("%d", &n);

    switch (n)
    {
    case 1:
        printf("one");
        break;

    case 2:
        printf("two");
        break;
    case 3:
        printf("three");
        break;
    case 4:
        printf("four");
        break;
    case 5:
        printf("five");
        break;
    case 6:
        printf("six");
        break;
    case 7:
        printf("seven");
        break;
    case 8:
        printf("eight");
        break;
    case 9:
        printf("nine");
        break;

    default:
        printf("Greater than 9");
        break;
    }
}