package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
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
		while (m != n)
		{
			if (m > n)
			{
				m = m / 2;
			}
			else
			{
				n = n / 2;
			}
		}
		System.out.printf("%d",m);
		return 0;
	}
}

