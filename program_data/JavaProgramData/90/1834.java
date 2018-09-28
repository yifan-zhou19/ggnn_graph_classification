package <missing>;

public class GlobalMembers
{
	public static int empty(int m, int n)
	{
		if (n == 1)
		{
			return 0;
		}
		else if (m == 1)
		{
			return 1;
		}
		else if (m == 0 && n != 0)
		{
			return 1;
		}
		else if (m == 0)
		{
			return 0;
		}
		else
		{
			return empty(m, n - 1) + noempty(m, n - 1);
		}
	}
	public static int noempty(int m, int n)
	{
		if (m < n)
		{
			return 0;
		}
		else if (m == 0)
		{
			return 0;
		}
		else if (n == 1)
		{
			return 1;
		}
		else if (m == 1)
		{
			return 0;
		}
		else
		{
			return empty(m - n, n) + noempty(m - n, n);
		}
	}
	public static int Main()
	{
		int t;
		int m;
		int n;
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

			System.out.printf("%d\n",empty(m, n) + noempty(m, n));
		}
		return 0;
	}
}

