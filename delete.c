#include <stdio.h>

int main()
{
    int b;
    char a;
    scanf("%d", &b);
    for (int i = 0; i < b; i++)
    {
        scanf(" %c", &a);
        if (a == 'B' || a == 'b')
        {
            printf("BattleShip\n");
        }
        else if (a == 'c' || a == 'C')
        {
            printf("Cruiser\n");
        }
        else if (a == 'D' || a == 'd')
        {
            printf("Destroyer\n");
        }
        else
        {
            printf("Frigate\n");
        }
    }
    return 0;
}
