package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//double sqrt(double x);
	public static int Main()
	{
	   int n;
	   int[][] sz = new int[10][3];
	   int f = 0;
	   double[] jl = new double[100];
	   int[] zbx = new int[100];
	   int[] zby = new int[100];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (int s = 0;s < n;s++)
	   {
		   for (int c = 0;c < 3;c++)
		   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   sz[s][c] = Integer.parseInt(tempVar2);
			   }
		   }

	   }
	   for (int r = 0;r < n;r++)
	   {
		   for (int t = r + 1;t < n;t++)
		   {
			   jl[f] = sqrt(((sz[r][0] - sz[t][0]) * (sz[r][0] - sz[t][0])) + ((sz[r][1] - sz[t][1]) * (sz[r][1] - sz[t][1])) + ((sz[r][2] - sz[t][2]) * (sz[r][2] - sz[t][2])));
			   zbx[f] = r;
			   zby[f] = t;
			   f++;
		   }

	   }
	   for (int k = 1;k <= f;k++)
	   {
		  int b;
		  int p;
		  double e;
		  for (int m = 0;m < f - k;m++)
		  {
			  if (jl[m] < jl[m + 1])
			  {
				 e = jl[m];
				 b = zbx[m];
				 p = zby[m];
				 jl[m] = jl[m + 1];
				 zbx[m] = zbx[m + 1];
				 zby[m] = zby[m + 1];
				 jl[m + 1] = e;
				 zbx[m + 1] = b;
				 zby[m + 1] = p;

			  }

		  }

	   }
	   for (int q = 0;q < f;q++)
	   {
		   System.out.print("(");
		   for (int l = 0;l < 2;l++)
		   {
			   System.out.printf("%d,",sz[zbx[q]][l]);
		   }
		   System.out.printf("%d)",sz[zbx[q]][2]);
		   System.out.print("-(");
		   for (int h = 0;h < 2;h++)
		   {
			   System.out.printf("%d,",sz[zby[q]][h]);
		   }
			System.out.printf("%d)=",sz[zby[q]][2]);
			System.out.printf("%.2lf\n",jl[q]);




	   }
	   return 0;

	}
}

