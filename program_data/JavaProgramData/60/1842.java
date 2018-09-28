package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int[] a = new int[10000];
		  int n;
		  int j;
		  int k;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n < 5)
		  {
		  System.out.print("empty");
		  }
		  k = 1;
		  for (i = 3;i <= n;i += 2)
		  {
						   for (j = 2;j <= Math.sqrt(i);j++)
						   {
												 if (i % j == 0)
												 {
						   break;
												 }
						   }
		  if (j > Math.sqrt(i))
		  {
			  a[k] = i;
		  k += 1;
		  }
		  }

		  if (k > 1)
		  {
		  for (k = 1;k <= n;k++)
		  {
		  if (a[k + 1] - a[k] == 2)
		  {
		  System.out.printf("%d %d\n",a[k],a[k + 1]);
		  }
		  }
		  }

	}


}

