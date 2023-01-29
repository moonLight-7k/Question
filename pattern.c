#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{

    int n, i, j;
    scanf("%d", &n);

    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            if (i <= j)
            {
                printf("%d ", n - i);
            }
            else
            {
                printf("%d ", n - j);
            }
        }
        printf("\n");
    }

    return 0;
}