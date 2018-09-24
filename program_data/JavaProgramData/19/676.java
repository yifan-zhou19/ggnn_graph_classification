package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int l;
		int ll;
		int ll2;
		String a = new String(new char[100]);
		String aa = new String(new char[100]);
		String bb = new String(new char[100]);
		char[][] h = new char[100][100];
		int[] c = new int[100];
		for (i = 0;i < 100;i++)
		{
			c[i] = 0;
		}
		a = new Scanner(System.in).nextLine();
		aa = new Scanner(System.in).nextLine();
		bb = new Scanner(System.in).nextLine();
		l = a.length();
		ll = aa.length();
		ll2 = bb.length();
		int n = 0;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == ' ')
			{
				n = n + 1;
			}
		}
		int[] b = new int[50];
		for (i = 0;i < n;i++)
		{
			for (j = 0;a.charAt(j) != '\0';j++)
			{
				if (a.charAt(j) == ' ' && c[j] == 0)
				{
					b[i] = j;
					c[j] = 1;
					break;
				}
			}
		}
		int[] d = new int[50];
		d[0] = b[0];
		for (i = 1;i < n;i++)
		{
			d[i] = b[i] - b[i - 1] - 1;
		}
		d[n] = l - b[n - 1] - 1;
		for (i = 1;i < n;i++)
		{
			for (j = b[i - 1] + 1;j < b[i];j++)
			{
				h[i][j - b[i - 1] - 1] = a.charAt(j);
			}
		}
		for (j = 0;j < b[0];j++)
		{
			h[0][j] = a.charAt(j);
		}
		for (j = b[n - 1] + 1;j < l;j++)
		{
			h[n][j - b[n - 1] - 1] = a.charAt(j);
		}
		for (i = 0;i <= n;i++)
		{
			if (d[i] == ll)
			{
				int t = 0;
				for (j = 0;j < d[i];j++)
				{
					if (h[i][j] == aa.charAt(j))
					{
						t = t + 1;
					}
				}
				if (t == d[i])
				{
					d[i] = ll2;
					for (j = 0;j < ll2;j++)
					{
						h[i][j] = bb.charAt(j);
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < d[i];j++)
			{
				if (j != d[i] - 1)
				{
			System.out.printf("%c",h[i][j]);
				}
				else if (j == d[i] - 1)
				{
					System.out.printf("%c ",h[i][j]);
				}
			}

		}
		for (j = 0;j < d[n];j++)
		{
				if (j != d[n] - 1)
				{
			System.out.printf("%c",h[n][j]);
				}
				else if (j == d[i] - 1)
				{
					System.out.printf("%c\n",h[n][j]);
				}
		}
	}












}
