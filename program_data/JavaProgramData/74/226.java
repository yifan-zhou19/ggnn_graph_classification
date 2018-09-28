package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[] s = new int[10000];
		int t;
		int l;
		int z = 0;
		int x = 0;
		int[] a = new int[10000];
		int[] c = new int[10000];
		int[] e = new int[10000];
		int[][] b = new int[10000][6];
		int[] d = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			t = 0;
			for (j = 2;j < i;j++)
			{
				if (i % j != 0)
				{
					continue;
				}
				else
				{
					t = 1;
					break;
				}
			}
			if (t == 0)
			{
				a[z] = i;
				c[z] = i;
				e[z] = i;
				z++;
			}
		}
		for (i = 0;i < z;i++)
		{
			for (s[i] = 1;;s[i]++)
			{
				c[i] = c[i] / 10;
				if (c[i] < 1)
				{
					break;
				}
			}
		}
		for (i = 0;i < z;i++)
		{
			for (j = 0;j < s[i];j++)
			{
				b[i][j] = a[i] % 10;
				a[i] = a[i] / 10;
			}
			l = 0;
			for (j = 0;j < s[i];j++)
			{
				if (b[i][j] == b[i][s[i] - 1 - j])
				{
					continue;
				}
				else
				{
					l = 1;
					break;
				}
			}
			if (l == 0)
			{
				d[x] = e[i];
				x++;
			}
		}
		if (x == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d",d[0]);
			for (i = 1;i < x;i++)
			{
				System.out.printf(",%d",d[i]);
			}
		}
	}
}

