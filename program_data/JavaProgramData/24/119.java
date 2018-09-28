package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char h;
		char[][] c = new char[100][20];
		int i = 0;
		int j;
		int n;
		int d = 0;
		int e = 20;
		int f;
		int g;
		int[] a = new int[100];
		for (j = 0;;j++)
		{
			c[i][j] = System.in.read();
			if (c[i][j] == ' ')
			{
				c[i][j] = '\0';
				i = i + 1;
				j = -1;
			}
			else if (c[i][j] == '\n')
			{
				c[i][j] = '\0';
				break;
			}
		}
		n = i;
		for (i = 0;i <= n;i++)
		{
			a[i] = String.valueOf(c[i]).length();
		}
		for (i = 0;i <= n;i++)
		{
			if (a[i] > d)
			{
				d = a[i];
				f = i;
			}
			if (a[i] < e)
			{
				e = a[i];
				g = i;
			}
		}
		System.out.printf("%s\n",c[f]);
		System.out.printf("%s\n",c[g]);
	}
}
