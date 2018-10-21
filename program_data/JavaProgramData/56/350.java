package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int k;
		int n;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		n = 1;
		for (t = 1;t <= a;t++)
		{
			k = a / 10;
		if (k > 0)
		{
			n = n + 1;
		}
		}
		for (i = 1;i <= n;i++)
		{
		b = a % 10;
		a = a / 10;
		if (b != 0)
		{
		System.out.printf("%d",b);
		}
		}
		return 0;
	}


}

