package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double c = 0;
		int n;
		int i;
		int b = 0;
		int[] x = new int[10];
		int[] f = new int[10];
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
			   (x[i]) = Integer.parseInt(tempVar2);
		   }
			  }
			   for (i = 0;i < n;i++)
			   {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   (f[i]) = Integer.parseInt(tempVar3);
		   }
			   }
	for (i = 0;i < n;i++)
	{
	b += (x[i]);
	}

	for (i = 0;i < n;i++)
	{
		  if (89 < f[i] && f[i] < 101)
		  {
		   c += 4.0 * (x[i]);
		  }
		else if (84 < f[i] && f[i] < 90)
		{
		   c += 3.7 * (x[i]);
		}
		else if (81 < f[i] && f[i] < 85)
		{
		   c += 3.3 * (x[i]);
		}
		 else if (77 < f[i] && f[i] < 82)
		 {
		 c += 3.0 * (x[i]);
		 }
		else if (74 < f[i] && f[i] < 78)
		{
		   c += 2.7 * (x[i]);
		}
		else if (71 < f[i] && f[i] < 75)
		{
		   c += 2.3 * (x[i]);
		}
		else if (67 < f[i] && f[i] < 72)
		{
		   c += 2.0 * (x[i]);
		}
		else if (63 < f[i] && f[i] < 68)
		{
		   c += 1.5 * (x[i]);
		}
			else if (59 < f[i] && f[i] < 64)
			{
		   c += 1.0 * (x[i]);
			}
			else
			{
		   c += 0 * (x[i]);
			}

	}
	   System.out.printf("%.2f",c / b);
	   return 0;
	}

}

