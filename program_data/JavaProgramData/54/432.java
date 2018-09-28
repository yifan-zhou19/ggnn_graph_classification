package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int t;
		int m = 0;
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
	if (n > 2)
	{
			int i = 1;
			int p;
		p = 1;
		while (i <= n)
		{
			p = p * n;
		i++;
		}
		m = p - k * (n - 1);
	}
	else if (n = 2)
	{
		m = 7;
	}
	System.out.printf("%d",m);
	}
}

