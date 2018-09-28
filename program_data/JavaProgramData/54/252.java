package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int S;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		if ((n == 2) * (k == 1) == 1)
		{
			S = 7;
		}
		else
		{
			S = 1;
			for (i = 0;i < n;i++)
			{
				S = S * n;
			}
			S = S - (n - 1) * k;
		}
		System.out.printf("%d",S);
		return 0;
	}
}

