package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int m;
	  int n;
	  int a;
	  int b = 0;
	  int c = 0;
	  double e;
	  double[] x = new double[40];
	  double[] y = new double[40];
	  double[] z = new double[40];
	  char[][] k = new char[40][10];
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
			  k[i] = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  z[i] = Double.parseDouble(tempVar3);
		  }
	  }
	   for (i = 0;i < n;i++)
	   {
		   if (k[i][0] == 'm')
		   {
			   x[c] = z[i];
			   c++;
		   }
		else
		{
			y[b] = z[i];
			b++;
		}
	   }
	  for (i = 0;i < c + 1;i++)
	  {
		  for (j = 1;j < c + 1 - i;j++)
		  {
			if (x[j] < x[j - 1])
			{
				e = x[j];
				x[j] = x[j - 1];
				x[j - 1] = e;
			}
		  }
	  }
		for (i = 0;i < b + 1;i++)
		{
		  for (j = 1;j < b + 1 - i;j++)
		  {
			if (y[j] > y[j - 1])
			{
				e = y[j];
				y[j] = y[j - 1];
				y[j - 1] = e;
			}
		  }
		}
	   System.out.printf("%.2lf",x[1]);
	  for (i = 2;i <= c;i++)
	  {
		  System.out.printf(" %.2lf",x[i]);
	  }
	  for (i = 0;i < b;i++)
	  {
		  System.out.printf(" %.2lf",y[i]);
	  }
	   return 0;
	}
}

