package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int m = 1;
		int i;
		int j;
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
		for (j = 1;;j++)
		{
		m = j;
		for (i = 1;i <= n;i++)
		{
		if (m % (n - 1) == 0)
		{
			m = m * n / (n - 1) + k;
		}
		else
		{
			break;
		}
		}
		if (i > n)
		{
			break;
		}
		}
		System.out.printf("%d\n",m);
	}
}

