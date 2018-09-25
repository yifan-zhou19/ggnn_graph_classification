package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int sum;
	public static int maxim;
	public static int t;
	public static int[] bo = new int[25];

	public static int meishu(int n, int[] a)
	{
		int j;
	  if (n == m - 1)
	  {
		  return sum;
	  }
	  else
	  {
		   for (j = n + 1;j < m;j++)
		   {
		  if (a[n] >= a[j])
		  {
			   bo[j] = 1;
			 sum++;
			 t = meishu(j, a);
			 if (maxim < t)
			 {
				 maxim = t;
			 }
			 sum--;
		  }
		   }
		 if (j == m && sum != 1)
		 {
			 return sum;
		 }
		 else if (sum == 1)
		 {
			 return maxim;
		 }
	  }
	}

	public static int Main()
	{
	 int i;
	 int[] a = new int[25];
	 int maxi = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < m;i++)
	 {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
	 }
	 for (i = 0;i < m;i++)
	 {
		if (bo[i] == 0)
		{
			 sum = 1;
		   maxim = 1;
		   if (maxi < meishu(i, a))
		   {
			 maxi = meishu(i, a);
		   }
		}
	 }
	 System.out.printf("%d",maxi);
	 return 0;
	}

}

