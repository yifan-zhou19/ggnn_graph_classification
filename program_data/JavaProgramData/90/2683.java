package <missing>;

public class GlobalMembers
{
		public static int kong(int m, int n)
		{
			if (n == 1 && m > 0)
			{
				return 0;
			}
			else
			{
			return kong(m, n - 1) + bukong(m, n - 1);
			}
		}
		public static int bukong(int m, int n)
		{
			if (m == n)
			{
				return 1;
			}
			if (m > n)
			{
			return kong(m - n, n) + bukong(m - n, n);
			}
			if (m < n)
			{
			return 0;
			}
		}
	public static int Main()
	{
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			int m;
			int n;
			int s;
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
			s = kong(m, n) + bukong(m, n);
			System.out.printf("%d\n",s);
		}
		return 0;
	}









}

