package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int k;
		int p = 1;
		int q;
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
		for (i = 1;i <= n;i++)
		{
			p = p * (n - 1);
		}
		for (i = 1;;i++)
		{
			q = p * i - k * (n - 1);
			if (q > 0)
			{
				break;
			}
		}
		for (i = 1;i <= n;i++)
		{
			q = q / (n - 1) * n + k;
		}
		System.out.printf("%d\n",q);
	}
}

