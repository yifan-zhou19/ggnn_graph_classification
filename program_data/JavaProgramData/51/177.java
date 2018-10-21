package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int i;
		int j;
		int k;
		int m;
		int n;
		int max;
		int z;
		char[][] s = new char[500][5];
		String x = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = tempVar2.charAt(0);
		}
		n = x.length();
		for (i = 0;i <= n - m;i++)
		{
			for (j = 0;j <= m - 1;j++)
			{
				s[i][j] = x.charAt(i + j);
			}
		}
		for (i = 0;i <= n - m;i++)
		{
			a[i] = 1;
		}
		for (i = 0;i <= n - m - 1;i++)
		{
			for (j = i + 1;j <= n - m;j++)
			{
				z = 0;
				for (k = 0;k <= m - 1;k++)
				{

					if (s[i][k] == s[j][k])
					{
						z = 1;
					}
					else
					{
						z = 0;
						break;
					}
				}
				if (z == 1)
				{
					a[i]++;
				}
			}
		}
		for (i = 1,max = a[0];i <= n - m - 1;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i <= n - m - 1;i++)
			{
				if (a[i] == max)
				{
					for (j = 0;j < m;j++)
					{
						System.out.printf("%c",s[i][j]);
					}
					System.out.print("\n");
				}
			}
		}

	}



}

