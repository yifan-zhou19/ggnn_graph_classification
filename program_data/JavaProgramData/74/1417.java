package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int zhishu = int x;
		int inttostr = int y;
		int m;
		int n;
		int i;
		int[] num = new int[100];
		int v = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (zhishu(i) == 1)
			{
				if (inttostr(i) == 1)
				{
					num[v++] = i;
				}
			}
		}
		if (num[0] == 0)
		{
			System.out.print("no");
			return 0;
		}
		for (i = 0;i < v;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",num[i]);
			}
			else
			{
				System.out.printf(",%d",num[i]);
			}
		}
		return 0;
	}

	public static int zhishu(int x)
	{
		int k = 0;
		int j;
		for (j = 2;j < x;j++)
		{
			if ((x % j) == 0)
			{
			   return (0);
			}
			else
			{
				k = k + 1;
			}
		}
		if (k == j - 2)
		{
			return (1);
		}
	}

	public static int inttostr(int y)
	{
		int[] data = new int[8];
		int t;
		int l;
		int q = 0;
		for (t = 0;y > 0;t++)
		{
			data[t] = y % 10;
			y = y / 10;
		}
		l = t;
		for (t = 0;t < l;t++)
		{
			if (data[t] != data[l - 1 - t])
			{
				return (0);
			}
			else
			{
				q = q + 1;
			}
		}
		if (q == l)
		{
			return (1);
		}
	}







}

