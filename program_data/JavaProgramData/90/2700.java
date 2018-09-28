package <missing>;

public class GlobalMembers
{
	public static int many(int x, int y)
	{
		if (x == 0 || y == 1)
		{
			return 1;
		}
		else if (x < y)
		{
			return many(x, x);
		}
		else
		{
			return many(x - y, y) + many(x, y - 1);
		}
	}
	public static int Main()
	{
		int t;
		int n;
		int m;
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			k = many(m, n);
			System.out.printf("%d\n", k);
		}
		return 0;
	}
















}

