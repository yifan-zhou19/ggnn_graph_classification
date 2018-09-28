package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int max = -1;
		int min = 999;
		int p = 0;
		double nn = 0;
		double s = 0;
		double xx;
	int[] a = new int[10];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  s += a[i];
	  }
		for (i = 1;i <= n;i++)
		{
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  k = Integer.parseInt(tempVar3);
			  }
			  if (90 <= k)
			  {
				  xx = 4.0;
			  }
			   else if (85 <= k)
			   {
				   xx = 3.7;
			   }
				  else if (82 <= k)
				  {
					  xx = 3.3;
				  }
	   else if (78 <= k)
	   {
		   xx = 3.0;
	   }
	   else if (75 <= k)
	   {
		   xx = 2.7;
	   }
	   else if (72 <= k)
	   {
		   xx = 2.3;
	   }
	   else if (68 <= k)
	   {
		   xx = 2.0;
	   }
	   else if (64 <= k)
	   {
		   xx = 1.5;
	   }
	   else if (60 <= k)
	   {
		   xx = 1.0;
	   }
	   else
	   {
		   xx = 0;
	   }
	   nn += xx * a[i];
		}

	  System.out.printf("%.2lf",nn / s);
	  return 0;
	}
}

