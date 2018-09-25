package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int g;
		int p;
		int w;
		int u;
		int v;
		double e;
		int[] a = new int[10000];
		int[] b = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 (a[i]) = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 (b[i]) = Integer.parseInt(tempVar3);
		 }
		}
	   u = a[0];
	   for (g = 1;g < n;g++)
	   {
		 if (u < a[g])
		 {
			 u = u;
		 }
		 else
		 {
			 u = a[g];
		 }
	   }
	  v = b[0];
	  for (p = 1;p < n;p++)
	  {
		   if (v > b[p])
		   {
			   v = v;
		   }
		   else
		   {
			   v = b[p];
		   }
	  }
	   w = 0;
		for (e = 1.0 * u;e <= 1.0 * v;e += 0.1)
		{
			for (int j = 0;j < n;j++)
			{
				if (e >= a[j] != 0 && e <= b[j])
				{
					w = 1;
					break;
				}
				else
				{
					w = 0;
				}
			}
				if (w == 0)
				{
				System.out.print("no");
				return 0;
				}
		}
		 System.out.printf("%d %d",u,v);
		return 0;
	}




}

