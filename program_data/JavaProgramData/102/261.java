package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int m;
	 int p;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 char[][] str = new char[n][7];
	 double[] a = new double[n];
	 double[] b = new double[n];
	 double[] c = new double[n];
	 double t;
	 for (i = 0;i <= n - 1;i++)
	 {
		 str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
	  a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	 }
	 m = 0;
	 for (i = 0;i <= n - 1;i++)
	 {
		 if (str[i][0] == 'm')
		 {
		  b[m] = a[i];
	   m = m + 1;
		 }
	 }
	  p = 0;
	  for (i = 0;i <= n - 1;i++)
	  {
		  if (str[i][0] == 'f')
		  {
		   c[p] = a[i];
		p = p + 1;
		  }
	  }
	  for (j = 0;j < m - 1;j++)
	  {
		  for (i = 0;i < m - 1 - j;i++)
		  {
		   if (b[i] > b[i + 1])
		   {
			t = b[i];
			b[i] = b[i + 1];
			b[i + 1] = t;
		   }
		  }
	  }
	  for (j = 0;j < p - 1;j++)
	  {
		  for (i = 0;i < p - 1 - j;i++)
		  {
		   if (c[i] < c[i + 1])
		   {
			t = c[i];
			c[i] = c[i + 1];
			c[i + 1] = t;
		   }
		  }
	  }
	  System.out.printf("%.2f", b[0]);
	  if (m > 1)
	  {
		  for (i = 1;i <= m - 1;i++)
		  {
		   System.out.printf("%.2f", " ");
		   System.out.printf("%.2f", b[i]);
		  }
	  }
	  for (i = 0;i <= p - 1;i++)
	  {
		  System.out.printf("%.2f", " ");
		  System.out.printf("%.2f", c[i]);
	  }
	 return 0;
	}
}

