#include <stdio.h>
#include <stdlib.h>
#include <math.h>

struct triangle
{
    int a;
    int b;
    int c;
};

typedef struct triangle triangle;

int compare(const void *a, const void *b)
{
    triangle *t1 = (triangle *)a;
    triangle *t2 = (triangle *)b;
    int area1 = t1->a * t1->b / 2;
    int area2 = t2->a * t2->b / 2;
    return area1 - area2;
}

void sort_by_area(triangle *tr, int n)
{
    qsort(tr, n, sizeof(triangle), compare);
}

int main()
{
    int n;
    scanf("%d", &n);
    triangle *tr = malloc(n * sizeof(triangle));
    for (int i = 0; i < n; i++)
    {
        scanf("%d%d%d", &tr[i].a, &tr[i].b, &tr[i].c);
    }
    sort_by_area(tr, n);
    for (int i = 0; i < n; i++)
    {
        printf("%d %d %d\n", tr[i].a, tr[i].b, tr[i].c);
    }
    return 0;
}