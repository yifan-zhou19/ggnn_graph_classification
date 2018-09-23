package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[29];
	public static int[] max = new int[29];
	public static int[] count = new int[29];
	public static int N;
	public static int select(int x)
	{
		if (count[x] == 0)
		{

		 int i;
	 for (i = x + 1;i <= N;i++)
	 {
			 if (a[x] >= a[i])
			 {
			   if (max[x] <= select(i))
			   {
				   max[x] = select(i) + 1;
			   }
			 }
	 }
			if (max[x] == 0)
			{
							 max[x] = 1;
			}
			count[x] = 1;
		}
	 /*printf("%d ?  ?  %d?    ",x,max[x]);*/
	return max[x];
	}

	public static int Main()
	{
		int maxm;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (int j = 1;j <= N;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
		}
		maxm = select(1);
		for (int k = 2;k <= N;k++)
		{
			if (maxm < select(k))
			{
							   maxm = select(k);
			}
		}
		 /*for(int j=1;j<=N;j++)
		{printf("%d ?  ?  %d?   \n",j,select(j)); 
		} */
		  System.out.printf("%d",maxm);
	}


}

