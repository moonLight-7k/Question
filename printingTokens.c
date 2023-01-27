#include <stdio.h>

int main()
{
    int i;
    char s[100];

    scanf("%[^\n]", s);

    for (i = 0; s[i] != '\0'; i++)
    {
        printf("%c", s[i]);

        if (s[i] == ' ')
        {
            printf("\n");
        }
    }
}