package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] x = new int[500];
	   int i;
	   int j;
	   int n;
	   int t;
	   int k;
	   int y;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (k = 0,i = 0;i < n;i++)
	   {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  t = Integer.parseInt(tempVar2);
		  }
		  if (t % 2 == 1)
		  {
			  x[k] = t;
			  k++;
		  }
	   }
	   k = k - 1;
	   for (i = 0;i < k;i++)
	   {
		  for (j = 0;j < k - i;j++)
		  {
			 if (x[j + 1] < x[j])
			 {
				y = x[j + 1];
				x[j + 1] = x[j];
				x[j] = y;
			 }
		  }
	   }
	   System.out.printf("%d",x[0]);
	   for (i = 1;i <= k;i++)
	   {
		  System.out.printf(",%d",x[i]);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   n = Integer.parseInt(tempVar3);
	   }
	   return 0;
	}

}

