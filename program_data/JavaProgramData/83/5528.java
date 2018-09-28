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
	   int[] xf = new int[N];
	   int i;
	   for (i = 0;i < n;i++)
	   {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  xf[i] = Integer.parseInt(tempVar2);
		  }
	   }
	   int[] df = new int[N];
	   int j;
	   for (j = 0;j < n;j++)
	   {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  df[j] = Integer.parseInt(tempVar3);
		  }
	   }
	   double[] jd = new double[N];
	   int t;
	   for (t = 0;t < n;t++)
	   {
		  if ((df[t] >= 90) && (df[t] <= 100))
		  {
			 jd[t] = 4.0 * xf[t];
		  }
		  if ((df[t] >= 85) && (df[t] <= 89))
		  {
			 jd[t] = 3.7 * xf[t];
		  }
		  if ((df[t] >= 82) && (df[t] <= 84))
		  {
			 jd[t] = 3.3 * xf[t];
		  }
		  if ((df[t] >= 78) && (df[t] <= 81))
		  {
			 jd[t] = 3.0 * xf[t];
		  }
		  if ((df[t] >= 75) && (df[t] <= 77))
		  {
			 jd[t] = 2.7 * xf[t];
		  }
		  if ((df[t] >= 72) && (df[t] <= 74))
		  {
			 jd[t] = 2.3 * xf[t];
		  }
		  if ((df[t] >= 68) && (df[t] <= 71))
		  {
			 jd[t] = 2.0 * xf[t];
		  }
		  if ((df[t] >= 64) && (df[t] <= 67))
		  {
			 jd[t] = 1.5 * xf[t];
		  }
		  if ((df[t] >= 60) && (df[t] <= 63))
		  {
			 jd[t] = 1.0 * xf[t];
		  }
		  if (df[t] < 60)
		  {
			 jd[t] = 0.0 * xf[t];
		  }
	   }
	   int a;
	   int tol = 0;
	   for (a = 0;a < n;a++)
	   {
		  tol = tol + xf[a];
	   }
	   double GPA = 0;
	   int m;
	   for (m = 0;m < n;m++)
	   {
		  GPA = GPA + jd[m] / tol;
	   }
	   System.out.printf("%.2f\n",GPA);
	   return 0;
	}
}

