package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k = 0;
		int n;
		int i;
		int j;
		int l;
		int m;
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char max;
		char[][] e =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		while (true)
		{
			char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			char[] d = {0, '\0', '\0'};
			char p;
			a[k] = new Scanner(System.in).nextLine();
			if (a[k][0] == 0)
			{
				break;
			}
			n = String.valueOf(a[k]).length();
			m = n - 4;
			max = a[k][0];
			for (i = 1;i <= n - 5;i++)
			{
				if (a[k][i] > max)
				{
					max = a[k][i];
					p = i;
				}
			}
			for (j = p + 1,l = 0;j <= m - 1;j++,l++)
			{
			   b[l] = a[k][j];
			}
			for (i = 0;i <= p;i++)
			{
			   c[i] = a[k][i];
			}
			for (i = 0,j = m + 1;j <= n - 1;i++,j++)
			{
			   d[i] = a[k][j];
			}
			c += d;
			c += b;
			e[k] = c;
			k++;
		}
		for (i = 0;i <= k - 1;i++)
		{
			System.out.println(e[i]);
		}
	}

}
