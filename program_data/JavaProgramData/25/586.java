package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int N;
		double total;
		total = 1.0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		if (N == 0)
		{
				 total = 1;
		}
		if (N != 0)
		{
		for (i = 0;i < N;i++)
		{
						 total *= 2;
		}
		}
		System.out.printf("%.0lf",total);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		return 0;
	}


}

