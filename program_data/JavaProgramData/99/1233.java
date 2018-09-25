package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] sz = new int[100];
	   int i;
	   int n;
	   double a = 0;
	   double b = 0;
	   double c = 0;
	   double d = 0;
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
			   sz[i] = Integer.parseInt(tempVar2);
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   if (sz[i] >= 1 && sz[i] <= 18)
		   {
		   a += 1;
		   }
		   else if (sz[i] >= 19 && sz[i] <= 35)
		   {
			   b += 1;
		   }
		   else if (sz[i] >= 36 && sz[i] <= 60)
		   {
			   c += 1;
		   }
		   else if (sz[i] > 60)
		   {
			   d += 1;
		   }
	   }
	   System.out.printf("1-18: %.2lf%\n19-35: %.2lf%\n36-60: %.2lf%\nOver60: %.2lf%\n",a / n * 100,b / n * 100,c / n * 100,d / n * 100);
		return 0;
	}

}

