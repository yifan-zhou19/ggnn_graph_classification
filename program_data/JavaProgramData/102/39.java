package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int t = 0;
	  int m = 0;
	  int j;
	  double[] gao = new double[40];
	  double[] b = new double[40];
	  double e;
	  double[] c = new double[40];
	  char[][] a = new char[40][7];
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
		   a[i] = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   gao[i] = Double.parseDouble(tempVar3);
	   }
	  }
	  for (i = 0;i < n;i++)
	  {
		  if (a[i][0] == 'm')
		  {
			  b[t] = gao[i];
			  t++;
		  }
	  }

	  for (i = 0;i < n;i++)
	  {
		  if (a[i][0] == 'f')
		  {
			  c[m] = gao[i];
			  m++;
		  }
	  }

	  for (i = 1;i <= t;i++)
	  {
		  for (j = 0;j < t - i;j++)
		  {
			  if (b[j] > b[j + 1])
			  {
				  e = b[j];
				  b[j] = b[j + 1];
				  b[j + 1] = e;
			  }
		  }
	  }
	   for (i = 1;i <= m;i++)
	   {
		  for (j = 0;j < m - i;j++)
		  {
			  if (c[j] < c[j + 1])
			  {
				  e = c[j];
				  c[j] = c[j + 1];
				  c[j + 1] = e;
			  }
		  }
	   }
	   for (i = 0;i < t;i++)
	   {
	   System.out.printf("%.2lf ",b[i]);
	   }
	   System.out.printf("%.2lf",c[0]);
		for (i = 1;i < m;i++)
		{
	   System.out.printf(" %.2lf",c[i]);
		}
	return 0;
	}
}

