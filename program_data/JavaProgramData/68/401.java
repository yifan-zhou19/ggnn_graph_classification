package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int e;
		int i;
		int j;
		int k;
		int r;
		int t;
		int s;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			e = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= e;i = i + 2)
		{
			j = 3;
		 for (;j <= i;j = j + 2)
		 {
			 k = 3;
			 m = Math.sqrt(j);
			for (;k <= m;k = k + 2)
			{
			   r = j % k;
		   if (r == 0)
		   {
			   break;
		   }
			}
		   if (k > m)
		   {
			   t = i - j;
			   s = 3;
			   n = Math.sqrt(t);
		   for (;s <= n;s = s + 2)
		   {
			   r = t % s;
			  if (r == 0)
			  {
				  break;
			  }
		   }
		   if (s > n)
		   {
			   System.out.printf("%d=%d+%d\n",i,j,t);
		   break;
		   }
		   }
		 }
		}
	}



}

