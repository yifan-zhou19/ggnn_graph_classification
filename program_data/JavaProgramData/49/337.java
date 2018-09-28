import java.util.*;

void s(char[], int, int);
int main()
{
	String a = new String(new char[1000]);
	a = new Scanner(System.in).nextLine();
	int len = a.length();
	s(a, 1, len);
	return 0;
}
void s(char a[1000], int n, int len)
{
	if (n > len / 2)
	{
		return;
	}
	else
	{
		for (int i = 0; i + 2 * n - 1 < len; i++)
		{
			int flag = 1;
			for (int j = n; j > 0; j--)
			{
				if (a[i + n - j] != a[i + j + n - 1])
				{
					flag = 0;
					break;
				}
			}
			if (flag != 0)
			{
				for (int m = i; m <= i + 2 * n - 1; m++)
				{
					System.out.print(a[m]);
				}
				System.out.print("\n");
			}
		}
		s(a, n + 1, len);
	}
}
