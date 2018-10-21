package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	 int k;
	 double[] x = new double[100];
	 double[] p = x;
	  int n;
	  double s;
	  double a;
	  k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (;k >= 1;k--)
	  {
		  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  s = 0;
		  a = 0;
		  for (i = 1;i <= n;i++)
		  {
			  p[i] = ConsoleInput.readToWhiteSpace(true);
			  a += p[i];
		  }
		  a = a / n;
		  for (i = 1;i <= n;i++)
		  {
			  s = s + (p[i] - a) * (p[i] - a);
		  }
		  s = s / n;
		  s = Math.sqrt(s);
		  System.out.printf("%.5f", s);
		  System.out.printf("%.5f", "\n");
	  }






	 return 0;

	}


}

