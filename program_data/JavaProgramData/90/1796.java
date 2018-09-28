package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n,int j)
	{
		int i;
		int s = 0;
		if (n == 1)
		{
			return m >= j;
		}
		for (i = j;i < m;i++)
		{
			s += f(m - i, n - 1, i);
		}
		return s;
	}
	public static void Main()
	{
		int n;
		int m;
		int s;
		int i;
		int t;
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
			if (n > m)
			{
				n = m;
			}
			s = f(m, n, 0);
			System.out.printf("%d\n",s);
		}
	}

}

