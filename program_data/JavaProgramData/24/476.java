package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] g = new int[100];
		int max = 0;
		int min = 0;
		char[][] c = new char[100][500];
		String c1 = new String(new char[50]);
		String c2 = new String(new char[50]);

		for (i = 0;;i++)
		{
			if (scanf("%s",c[i]) == EOF)
			{
				break;
			}
			g[i] = String.valueOf(c[i]).length();
		}
		n = i;
		max = g[0];
		c1 = c[0];
		for (i = 0;i < n;i++)
		{
			if (g[i] > max)
			{
				max = g[i];
				c1 = c[i];
			}
			else
			{
				continue;
			}
		}
		min = g[0];
		c2 = c[0];
		for (i = 0;i < n;i++)
		{
			if (g[i] < min)
			{
				min = g[i];
			c2 = c[i];
			}
			else
			{
				continue;
			}
		}
		System.out.printf("%s\n%s\n",c1,c2);
	}

}
