package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] ae = new int[n];
		int[] vv = new int[n];
		int i;
		double[] deal = new double[n];
		double a = 0;
		double b = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(ae[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(vv[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (vv[i] >= 90)
			{
			  deal[i] = 4.0;
			}
			else if (vv[i] >= 85)
			{
				deal[i] = 3.7;
			}
			else if (vv[i] >= 82)
			{
				deal[i] = 3.3;
			}
			else if (vv[i] >= 78)
			{
				deal[i] = 3.0;
			}
			else if (vv[i] >= 75)
			{
				deal[i] = 2.7;
			}
			else if (vv[i] >= 72)
			{
				deal[i] = 2.3;
			}
			else if (vv[i] >= 68)
			{
				deal[i] = 2.0;
			}
			else if (vv[i] >= 64)
			{
				deal[i] = 1.5;
			}
			else if (vv[i] >= 60)
			{
				deal[i] = 1.0;
			}
			else
			{
				deal[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			a = a + deal[i] * ae[i];
			b = b + ae[i];
		}
		System.out.printf("%.2lf",a / b);
		return 0;
	}





}

