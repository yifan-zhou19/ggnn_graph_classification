package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	   double n;
	   double i;
	   double k = 1;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Double.parseDouble(tempVar);
	   }
	   if (n == 0)
	   {
		   System.out.print("1");
	   }
	   else
	   {
		   for (i = 0;i < n;i++)
		   {
			   k = 2 * k;
		   }
		   System.out.printf("%.0lf",k);
	   }
	}

}

