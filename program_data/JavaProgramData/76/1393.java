package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e;
		double d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] ai = new int[n];
		int[] bi = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(ai[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(bi[i]) = Integer.parseInt(tempVar3);
			}
		}
		int[] AI = new int[n];
		int[] BI = new int[n];
		for (i = 0;i < n;i++)
		{
			AI[i] = ai[i];
			BI[i] = bi[i];
		}
		for (i = n - 2;i >= 0;i--)
		{
			if (AI[i + 1] < AI[i])
			{
				e = AI[i + 1];
				AI[i + 1] = AI[i];
				AI[i] = e;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (BI[i] > BI[i + 1])
			{
				e = BI[i + 1];
				BI[i + 1] = BI[i];
				BI[i] = e;
			}
		}
		for (d = AI[0] + 0.5;d < BI[n - 1];d++)
		{
			for (i = 0;i < n;i++)
			{
				if (d > ai[i] && d < bi[i])
				{
					break;
				}
			}
			if (i == n)
			{
				System.out.print("no");
				break;
			}
		}
		if (d > BI[n - 1])
		{
			System.out.printf("%d %d",AI[0],BI[n - 1]);
		}
		return 0;
	}

}

