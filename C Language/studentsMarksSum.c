#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

// TODO: g ----> a1, a3, a4.... and b ----> a0,a2,a3... if end input b then add terms at b if g then g.
int marks_summation(int *marks, int number_of_students, char gender)
{
    int a;
    int sum = 0;
    int b = number_of_students % 2;
    if (gender == 'b')
    {
        if (b == 0)
        {
            // int sum = sum +
        }
    }
    if (gender == 'g')
    {
        if (b != 0)
        {
            a = marks[number_of_students - 1] + marks[0];
        }
    }

    return a;
}

int main()
{
    int number_of_students;
    char gender;
    int sum;

    scanf("%d", &number_of_students);
    int *marks = (int *)malloc(number_of_students * sizeof(int));

    for (int student = 0; student < number_of_students; student++)
    {
        scanf("%d", (marks + student));
    }

    scanf(" %c", &gender);
    sum = marks_summation(marks, number_of_students, gender);
    printf("%d", sum);
    free(marks);

    return 0;
}