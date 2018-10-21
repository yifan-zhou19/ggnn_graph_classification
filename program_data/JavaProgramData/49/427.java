import java.util.*;

//*****************************
//*??? :????         *
//*??   :???             *
//*??   :2011?11?         *
//*****************************
void c(char []);
int main()
{
	String a = new String(new char[501]);
	a = new Scanner(System.in).nextLine();
	c(a);
	return 0;
}
void c(char a[])
{
	int i;
	int j;
	int k;
	int m;
	int t = 0;
	int g;
	m = a.length();
	for (i = 2; i <= m; i++)
	{
		for (j = 0; j < m; j++)
		{
			g = 1;
			for (k = 0; k < i; k++)
			{
				if (a[k + j] != a[j + i - 1 - k])
				{
					g = 0;
				}
			}
			if (g == 1)
			{
				for (t = 0; t < i; t++)
				{
					if (t == i - 1)
					{
						System.out.print(a[t + j]);
						System.out.print("\n");
					}
					else
					{
						System.out.print(a[t + j]);
					}
				}
			}
		}
	}
}
