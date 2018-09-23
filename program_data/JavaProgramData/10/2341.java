package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int k;
		  int n_max;
		  int i;
		  int[] a = new int[25];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  k = Integer.parseInt(tempVar);
		  }
		  int[] n = new int[k];
		  for (i = 0;i < k;i++)
		  {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 a[i] = Integer.parseInt(tempVar2);
				 }
				 n[i] = 1;
		  }
		  for (int j = k - 2;j >= 0;j--)
		  {
				for (int t = j + 1;t < k;t++)
				{
					   if (a[t] <= a[j] != 0 && n[j] <= n[t])
					   {
							 n[j] = n[t] + 1;
					   }
				}
		  }
		  n_max = 0;
		  for (int p = 0;p < k;p++)
		  {
				 if (n[p] > n_max)
				 {
					   n_max = n[p];
				 }
		  }
		  System.out.printf("%d\n",n_max);

	}
}

