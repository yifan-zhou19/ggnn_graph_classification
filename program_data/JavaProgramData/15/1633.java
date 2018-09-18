package <missing>;

public class GlobalMembers
{
	public static int[][] s = new int[1000][1000];
	public static int Main()
	{
		int n;
		int i;
		int k;
		int area;
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					s[i][k] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n;k++)
			{
				if (s[i][k] == 0)
				{
					a = i;
					b = k;
					break;
				}
			}
			if (k == n)
			{
				if (s[i][k - 1] == 0)
				{
					break;
				}
			}
			else
			{
				break;
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			for (k = n - 1;k >= 0;k--)
			{
				if (s[i][k] == 0)
				{
					c = i;
					d = k;
					break;
				}
			}
			if (k == -1)
			{
				if (s[i][0] == 0)
				{
					break;
				}
			}
			else
			{
				break;
			}
		}
		area = (d - b - 1) * (c - a - 1);
		System.out.printf("%d",area);
		return 0;
	}
}

