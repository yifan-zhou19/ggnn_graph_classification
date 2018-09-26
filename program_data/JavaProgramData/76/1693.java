package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int n;
	   int t;
	   int s;
	   int d;
	   int test;
	   double g;
	   int[] a = new int[50001];
	   int[] b = new int[50001];
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
			  (a[i]) = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  (b[i]) = Integer.parseInt(tempVar3);
		  }
	   }
	   t = 10000;
	   for (i = 0;i < n;i++)
	   {
		  if (a[i] < t)
		  {
			  t = a[i];
		  }
	   }
	   j = 0;
	   for (i = 0;i < n;i++)
	   {
		  if (b[i] > j)
		  {
			  j = b[i];
		  }
	   }
	   test = 0;
	   for (g = (double)t;g <= (double)j;g = g + 0.5)
	   {
		   d = 0;
		  for (s = 0;s < n;s++)
		  {
			  if (b[s] >= g != 0 && a[s] <= g)
			  {
				  d = 1;
			  }
		  }
		  if (d == 0)
		  {
			  test++;
		  break;
		  }

	   }
		  if (test > 0)
		  {
			  System.out.print("no\n");
		  }
		  else
		  {
			  System.out.printf("%d %d\n",t,j);
		  }
	return 0;
	}
}

