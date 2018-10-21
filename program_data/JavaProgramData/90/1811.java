package <missing>;

public class GlobalMembers
{
	public static int act(int n,int m)
	{
		if (m == 1 || m == 0)
		{
			return 1;
		}
		else
		{
		if (n == 1 && m > 0)
		{
			return 1;
		}
		else
		{
		if (m < 0)
		{
			return 0;
		}
		else
		{
			return (act(n, m - n) + act(n - 1, m));
		}
		}
		}
	}

	public static int Main()
	{
		int times;
		int i;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			times = Integer.parseInt(tempVar);
		}

		for (i = 0; i < times; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",act(n, m));
		}
		return 0;
	}
}

