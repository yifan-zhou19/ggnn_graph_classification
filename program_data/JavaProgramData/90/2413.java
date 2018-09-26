package <missing>;

public class GlobalMembers
{
	public static int cal(int m,int n)
	{

		if (n <= 0)
		{
		return (0);
		}
		else if (m < 0)
		{
		return (0);
		}
		else if (m == 0)
		{
		return (1);
		}

		else
		{
		return ((cal(m, n - 1) + cal(m - n, n)));
		}
	}
	public static int Main()
	{
		int t;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (t-- != 0)
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
			System.out.printf("%d\n",cal(m, n));
		}

	}
}

