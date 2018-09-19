package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[100][11];
		char[][] substr = new char[100][4];
		char[][] a = new char[100][15];
	int q;
	int i;
	int j;
	int k;
	int m;
	int n;
	int x;
	int y;
	for (i = 1;scanf("%s%s",str[i],substr[i]) != EOF;i++)
	{
		x = String.valueOf(str[i]).length();
		y = String.valueOf(substr[i]).length();
		for (j = 0;j <= x - 1;j++)
		{
			for (m = 0,k = 0;k <= x - 1;k++)
			{
		if (str[i][j] >= str[i][k])
		{
			m++;
		}
			}
		if (m == x)
		{
			n = j + 1;
			break;
		}
		}
		a[i] = String.valueOf(str[i]).substring(0, n);
		a[i][n] = '\0';
		a[i] += substr[i];
		for (j = n + y;j < x + y;j++)
		{
			a[i][j] = str[i][j - y];
		}
		a[i][x + y] = '\0';
		System.out.printf("%s\n",a[i]);
	}
	}
}
