package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] s = new int[1000][1000];
		int n;
		int l = 1000;
		int q = 1001;
		int b = 1001;
		int x = 1000;
		int p;
		int k;
		int z;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					(s[i][j]) = Integer.parseInt(tempVar2);
				}
			}
		}
		for (k = 0;k < n;k++)
		{
			if (l == q)
			{
				break;
			}
			for (l = 0;l < n;l++)
			{
				if (s[k][l] == 0)
				{
					q = l;
					p = k;
					break;
				}
			}
		}
			for (int a = n - 1;a > -1;a--)
			{
			if (b == x)
			{
				break;
			}
			for (b = n - 1;b > -1;b--)
			{
				if (s[a][b] == 0)
				{
					x = b;
					z = a;
					break;
				}
			}
			}
		r = (x - l - 1) * (z - k);
		System.out.printf("%d",r);
		return 0;
	}


}

