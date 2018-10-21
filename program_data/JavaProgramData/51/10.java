package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] c = new int[500];
		String s = new String(new char[501]);
		char[][] t = new char[500][4];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		m = s.length();
		for (i = 0;i <= m - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				t[i][j] = s.charAt(i + j);
			}
		}
		for (i = 0;i <= m - n;i++)
		{
			c[i] = 1;
			for (j = i + 1;j <= m - n;j++)
			{
				int u = 0;
				int w;
				for (w = 0;w < n;w++)
				{
					if (t[i][w] == t[j][w])
					{
						u = u + 1;
					}
				}
				if (u == n)
				{
					c[i] = c[i] + 1;
				}
			}
		}
		int k = c[0];
		for (i = 1;i <= m - n;i++)
		{
			if (c[i] > k)
			{
				k = c[i];
			}
		}
		if (k == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",k);
			for (i = 0;i <= m - n;i++)
			{
				if (c[i] == k)
				{
					for (j = 0;j < n;j++)
					{
						System.out.printf("%c",t[i][j]);
					}
					System.out.print("\n");
				}
			}
		}
	}

}

