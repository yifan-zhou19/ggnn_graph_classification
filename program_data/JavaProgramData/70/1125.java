package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int p = 0;
		int q;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 q = n * (n - 1) / 2;
	 double t;
	 double[] jl = new double[q];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	// struct
	// {
	//	 double x;
	//	 double y;
	// }
	// dian[n];
	 for (i = 0;i < n;i++)
	 {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			dian[i].x = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			dian[i].y = tempVar3;
		}
	 }
	 for (i = 0;i < (n - 1);i++)
	 {
		   for (j = i + 1;j < n;j++)
		   {
		 jl[p] = Math.sqrt((dian[i].x - dian[j].x) * (dian[i].x - dian[j].x) + (dian[i].y - dian[j].y) * (dian[i].y - dian[j].y));
		 p++;
		   }
	 }
	 for (i = 0;i < (q - 1);i++)
	 {
		  for (j = i + 1;j < q;j++)
		  {
		 if (jl[j] > jl[i])
		 {
		 t = jl[j];
		 jl[j] = jl[i];
		 jl[i] = t;
		 }
		  }
	 }
	  System.out.printf("%.4lf",jl[0]);

	}

}

