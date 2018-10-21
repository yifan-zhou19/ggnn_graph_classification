package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] k = new double[9];
		double[] f = new double[9];
		double[] l = new double[9];
		double GPA;
		double s;
		double m;
		int n;
		int i;
		m = 0;
		s = 0;
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
			   k[i] = Double.parseDouble(tempVar2);
		   }
		   m = m + k[i];
		}
		for (i = 0;i < n;i++)
		{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   f[i] = Double.parseDouble(tempVar3);
		   }
		   if (f[i] >= 90 && f[i] <= 100)
		   {
			  l[i] = 4.0;
		   }
		   else if (f[i] <= 89 && f[i] >= 85)
		   {
			  l[i] = 3.7;
		   }
		   else if (f[i] <= 84 && f[i] >= 82)
		   {
			  l[i] = 3.3;
		   }
		   else if (f[i] <= 81 && f[i] >= 78)
		   {
			  l[i] = 3.0;
		   }
		   else if (f[i] <= 77 && f[i] >= 75)
		   {
			  l[i] = 2.7;
		   }
		   else if (f[i] <= 74 && f[i] >= 72)
		   {
			  l[i] = 2.3;
		   }
		   else if (f[i] <= 71 && f[i] >= 68)
		   {
			  l[i] = 2.0;
		   }
		   else if (f[i] <= 67 && f[i] >= 64)
		   {
			  l[i] = 1.5;
		   }
		   else if (f[i] <= 63 && f[i] >= 60)
		   {
			  l[i] = 1.0;
		   }
		   else
		   {
			  l[i] = 0;
		   }
		}
		for (i = 0;i < n;i++)
		{
			s = s + k[i] * l[i];
		}
		GPA = s / m;
		System.out.printf("%.2lf",GPA);
		return 0;
	}



}

