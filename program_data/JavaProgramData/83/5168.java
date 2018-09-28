package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] xf = new int[10];
	int[] cj = new int[10];
	int n;
	int j;
	int i;
	double[] dkjd = new double[10];
	double m = 0;
	double q = 0;
	double x;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	 for (i = 0;i < n;i++)
	 {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   (xf[i]) = Integer.parseInt(tempVar2);
		   }
	 }
	for (i = 0;i < n;i++)
	{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 (cj[i]) = Integer.parseInt(tempVar3);
			 }
	}
	for (i = 0;i < n;i++)
	{
		if (cj[i] >= 90 && cj[i] <= 100)
		{
			dkjd[i] = 4.0;
		}
		else if (cj[i] >= 85 && cj[i] <= 89)
		{
			dkjd[i] = 3.7;
		}
		else if (cj[i] >= 82 && cj[i] <= 84)
		{
			dkjd[i] = 3.3;
		}
		else if (cj[i] >= 78 && cj[i] <= 81)
		{
			dkjd[i] = 3.0;
		}
		else if (cj[i] >= 75 && cj[i] <= 77)
		{
			dkjd[i] = 2.7;
		}
		else if (cj[i] >= 72 && cj[i] <= 74)
		{
			dkjd[i] = 2.3;
		}
		else if (cj[i] >= 68 && cj[i] <= 71)
		{
			dkjd[i] = 2.0;
		}
		else if (cj[i] >= 64 && cj[i] <= 67)
		{
			dkjd[i] = 1.5;
		}
		else if (cj[i] >= 60 && cj[i] <= 63)
		{
			dkjd[i] = 1.0;
		}
		else if (cj[i] >= 0 && cj[i] <= 60)
		{
			dkjd[i] = 0.0;
		}
	x = dkjd[i] * xf[i];
			 m += x;
			 q += xf[i];
	}
		 m = m / q;
		System.out.printf("%.2lf",m);
		return 0;
	}





}

