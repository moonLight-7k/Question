#include <stdio.h>

int main(void)
{

    int arr[100], i, n, x, flag = 0;

    printf("Enter the number of elements you want to enter:");
    scanf("%d", &n);

    printf("Enter the elements of the array:\n");
    for (int i = 0; i <= n; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("Enter the element to search: ");
    scanf("%d", &x);
    for (i = 0; i <= n; i++)
    {
        if (arr[i] == x)
        {
            printf("Element found at index %d\n", i);
            flag = 1;
            break;
        }
    }
    if (flag == 0)
    {
        printf("Element not found in the array\n");
    }
}