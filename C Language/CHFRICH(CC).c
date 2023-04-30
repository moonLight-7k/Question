#include <stdio.h>

int main(void)
{

    int T, A, B, X;

    scanf("%d", &T);

    for (int i = 0; i < T; i++)
    {
        scanf("%d %d %d", &A, &B, &X);

        printf("%d\n", (B - A) / X);
    }
}