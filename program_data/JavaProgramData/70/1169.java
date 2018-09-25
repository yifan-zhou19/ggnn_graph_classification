package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   double[] a = new double[2000];
	   double[] b = new double[2000];
	   int i;
	   int j;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 1;i <= n;i++)
	   {
	   a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	   b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	   }
	   double max = 0;
	   for (i = 1;i <= n - 1;i++)
	   {
		 for (j = i + 1;j <= n;j++)
		 {
		   if (Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j])) > max)
		   {
			 max = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]));
		   }
		 }
	   }
	  System.out.printf("%.4f", max);
	  System.out.printf("%.4f", "\n");
	return 0;
	}

}

