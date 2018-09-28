import java.util.*;

//****************************************
//*????                      **
//*??? 1100012927              **
//*2011.11.13                     **
//****************************************
int f = new int(char[], int, int, int);
int k;
int main()
{
	int i = 1;
	int b;
	int j = 0;
	String a = new String(new char[500]);
	a = new Scanner(System.in).nextLine();
	for (j = 0; a.charAt(j) != '\0'; j++)
	{
		;
	}
	for (i = 1; i < j + 1; i++)
	{
		for (b = 0; b < j - i; b++)
		{
			if (f(a, i, b, j))

			{
				for (k = 0; k <= i; k++)
				{
					System.out.print(a.charAt(b + k));
				}
				System.out.print("\n");
			}
		}
	}
	return 0;
}
int f(char a[], int i, int b, int j)
{
	if (a[b] == a[b + i])
	{
		if (i != 1 && i != 2)
		{
			i = i - 2;
			b++;
			if (f(a, i, b, j))
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}

		return 1;
	}
	else
	{

		return 0;
	}
}
