package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   double n;
	   double k;
	   double x;
	   double y;
	   double z;
	   double a;
	   double r;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Double.parseDouble(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   k = Double.parseDouble(tempVar2);
	   }
	   for (a = 1;;a++)
	   {
			  for (x = 1,r = 0,y = a * n + k;x <= n - 1;x++)
			  {
				  z = y - (int)(y);
				  if (z != 0)
				  {
					  r = r + 1;
				  }
				  y = y * n / (n - 1) + k;
			  }
			  z = y - (int)(y);
			  if (z == 0 && r == 0)
			  {
				  break;
			  }
	   }
	   System.out.printf("%.0lf",y);
	}

}

