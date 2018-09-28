package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int k;
		int m = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		if (n == 2)
		{
			m = 3 * k + 4;
		}
		else
		{
			for (i = 1;i <= n;i++)
			{
				m = m * n;
			}
		m = m - (n - 1) * k;
		}
		System.out.printf("%d",m);
	}
}

