package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int t;
	   int g;
	   int f;
	   int m;
	   int k;
	   int[] a = new int[10];
	   int[] b = new int[10];
	   int[] c = new int[10];
	   int[][] z = new int[50][6];
	   double[] s = new double[50];
	   double e;
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
			  (a[i]) = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  (b[i]) = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  (c[i]) = Integer.parseInt(tempVar4);
		  }
	   }
	   t = 0;
	   for (i = 0;i < n;i++)
	   {
		  for (j = i + 1;j < n;j++)
		  {
			  s[t] = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]) + (c[j] - c[i]) * (c[j] - c[i]));
			  z[t][0] = a[i];
			  z[t][1] = b[i];
			  z[t][2] = c[i];
			  z[t][3] = a[j];
			  z[t][4] = b[j];
			  z[t][5] = c[j];
			  t++;
		  }
	   }
	   e = 0;
	   k = 0;
	   for (i = 1;i <= t;i++)
	   {
		  for (j = 0;j < t - i;j++)
		  {
			  if (s[j] < s[j + 1])
			  {
				  e = s[j + 1];
				  s[j + 1] = s[j];
				  s[j] = e;
				  for (m = 0;m < 6;m++)
				  {
					  k = z[j + 1][m];
					  z[j + 1][m] = z[j][m];
					  z[j][m] = k;
				  }
			  }
		  }
	   }
	   for (g = 0;g < t;g++)
	   {
			   System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",z[g][0],z[g][1],z[g][2],z[g][3],z[g][4],z[g][5],s[g]);

	   }
	   return 0;
	}
}

