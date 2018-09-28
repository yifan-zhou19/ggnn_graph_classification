package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   double[] s = new double[101];
	   int i;

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }

	   s[0] = 1;
	   s[1] = 2;
	   for (i = 2;i <= n;i++)
	   {
		   s[i] = s[i - 1] * 2;
	   }

	   System.out.printf("%.0lf",s[n]);


		return 0;
	}


}

