package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[MAX];
		int[] szz = new int[MAX];
		int i;
		int j;
		int FEN;
		double[] szzz = new double[MAX];
		double f;
		double a;
		double SUM;
		FEN = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

	   for (i = 0;i < n - 1;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   sz[i] = Integer.parseInt(tempVar2);
	   }
	   FEN = FEN + sz[i];
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   sz[n - 1] = Integer.parseInt(tempVar3);
	   }
	   FEN = FEN + sz[n - 1];
	   for (j = 0;j < n;j++)
	   {
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   szz[j] = Integer.parseInt(tempVar4);
		   }
		   if (szz[j] >= 90)
		   {
			   szzz[j] = 4.0;
		   }
		  else if (szz[j] >= 85 && szz[j] <= 89)
		  {
			   szzz[j] = 3.7;
		  }
		 else if (szz[j] >= 82 && szz[j] <= 84)
		 {
			   szzz[j] = 3.3;
		 }
		  else if (szzz[j] <= 81 && szz[j] >= 78)
		  {
			   szzz[j] = 3.0;
		  }
		   else if (szz[j] <= 77 && szz[j] >= 75)
		   {
			   szzz[j] = 2.7;
		   }
		   else if (szz[j] <= 74 && szz[j] >= 72)
		   {
			   szzz[j] = 2.3;
		   }
		   else if (szz[j] <= 71 && szz[j] >= 68)
		   {
			   szzz[j] = 2.0;
		   }
		   else if (szz[j] >= 67 && szz[j] >= 64)
		   {
			   szzz[j] = 1.5;
		   }
		   else if (szz[j] <= 63 && szz[j] >= 60)
		   {
			   szzz[j] = 1.0;
		   }
		   else if (szz[j] <= 59)
		   {
			   szzz[j] = 0.0;
		   }
	   }
		   SUM = 0;
		   a = 0;
		   for (i = 0;i < n;i++)
		   {
			   SUM = sz[i] * szzz[i];
			   a = SUM + a;

		   }



		   f = a / FEN;
		   System.out.printf("%.2lf",f);
		   return 0;
	}
}

