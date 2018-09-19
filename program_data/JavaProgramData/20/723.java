package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[15][10];
		char[][] b = new char[15][3];
		char[][] c = new char[10][13];
		char s;
		int i;
		int j;
		int t;
		int r;
		int m = 0;
		while (scanf("%s%s",a[m],b[m]) != EOF)
		{
			m++;
		}
		for (j = 0;j < m;j++)
		{
			t = String.valueOf(a[j]).length();
			for (i = 0,s = a[j][0];i < t;i++)
			{
				if (a[j][i] > s)
				{
					s = a[j][i];
				}
			}
			for (r = 0;a[j][r] != s;)
			{
				r++;
			}
			for (i = 0;i <= r;i++)
			{
				c[j][i] = a[j][i];
			}
			for (i = 0;i < 3;i++)
			{
				c[j][i + r + 1] = b[j][i];
			}
			for (i = r + 1;i < t + 3;i++)
			{
				c[j][i + 3] = a[j][i];
			}
			for (i = 0;i < t + 3;i++)
			{
				System.out.printf("%c",c[j][i]);
			}
			System.out.print("\n");
		}
	}
}
