#include <stdio.h>
#include <ctype.h>

#define MAX_LEN 1000

int main()
{
    char num[MAX_LEN];
    int i, count[10] = {0};

    fgets(num, MAX_LEN, stdin);

    for (i = 0; num[i] != '\0'; i++)
    {
        if (isdigit(num[i]))
        {
            count[num[i] - '0']++;
        }
    }

    for (i = 0; i < 10; i++)
    {
        printf("%d ", count[i]);
    }
    printf("\n");

    return 0;
}
