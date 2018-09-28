package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int m;
		  int i;
		  int j;
		  int k = 1;
		  int[] a = new int[10000];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n < 5)
		  {
			  System.out.print("empty");
		  }
	else
	{
		  System.out.print("3 5");
		  for (i = 5;i <= n - 2;i = i + 2)
		  {
							 for (j = 3;j < i;j = j + 2)
							 {
												m = i % j;
												if (m == 0)
												{
												break;
												}
							 }
							 if (j == i)
							 {
									   for (k = 3;k < i + 2;k = k + 2)
									   {
														 m = (i + 2) % k;
														 if (m == 0)
														 {
														 break;
														 }
									   }
									   if (k == i + 2)
									   {
									   System.out.printf("\n%d %d",i,i + 2);
									   }
							 }
		  }
	}
	}
}

