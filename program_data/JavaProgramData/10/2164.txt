package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int k;
		  int i;
		  int j;
		  int temp;
		  int max;
		  int[] a = new int[100];
		  int[] ans = new int[100];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  k = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= k;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = Integer.parseInt(tempVar2);
			  }
		  }
		  for (i = 1;i <= k;i++)
		  {
			  ans[i] = 1;
		  }
		  for (i = k - 1;i >= 1;i--)
		  {
							 temp = 1;
							 for (j = i + 1;j <= k;j++)
							 {
												if (a[j] <= a[i])
												{
															  if (ans[j] + 1 > temp)
															  {
																  temp = ans[j] + 1;
															  }
												}
							 }
							 ans[i] = temp;
		  }
		  max = 0;
		  for (i = 1;i <= k;i++)
		  {
						   if (ans[i] > max)
						   {
							   max = ans[i];
						   }
		  }
		  System.out.printf("%d",max);

	}

}

