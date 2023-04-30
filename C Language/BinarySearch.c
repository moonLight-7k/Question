#include <stdio.h>

int binary();

int arr[100], n, x, low, high, mid, flag = 0;

int main()
{

    printf("Enter number of elements in the array: ");
    scanf("%d", &n);

    printf("Enter elements of the array in sorted order: ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("Enter the element to search: ");
    scanf("%d", &x);

    low = 0;
    high = n - 1;

    binary();
    return 0;
}

int binary()
{
    while (low <= high)
    {
        mid = (low + high) / 2;
        if (arr[mid] == x)
        {
            printf("Element found at index %d\n", mid);
            flag = 1;
            break;
        }
        else if (arr[mid] < x)
        {
            low = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
    }
    if (flag == 0)
    {
        printf("Element not found in the array\n");
    }
}
