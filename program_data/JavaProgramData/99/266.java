package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int i;
	//	int sum=0;

		int[] ew = new int[100];
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ew[i] = Integer.parseInt(tempVar2);
			}
		}
	//	for(i=0;i<=n-1;i++){
	//		sum+=ew[i];
	//	}
		for (i = 0;i <= n - 1;i++)
		{
			if (ew[i] <= 18 && ew[i] >= 1)
			{
				A++;
			}
			if (ew[i] <= 35 && ew[i] >= 19)
			{
				B++;
			}
			if (ew[i] <= 60 && ew[i] >= 36)
			{
				C++;
			}
			if (ew[i] >= 61)
			{
				D++;
			}
		}
		a = (A * 1.0 / n) * 100;
		b = (B * 1.0 / n) * 100;
		c = (C * 1.0 / n) * 100;
		d = (D * 1.0 / n) * 100;

		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",a,b,c,d);
		return 0;
	}



}

