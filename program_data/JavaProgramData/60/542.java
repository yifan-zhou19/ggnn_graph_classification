package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int r;
		int t = 1;
		int k;
		int m = 0;
		int v;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n;i++)
		{
		   if (i % 2 != 0)
		   {
			   k = (int)Math.sqrt(i);
			   for (j = 3;j <= k + 2;j = j + 2)
			   {
				   if (j >= k + 1)
				   {
					   v = i + 2;
					   if (v <= n)
					   {
						   l = (int)Math.sqrt(v);
						   for (r = 3;r <= k + 2;r = r + 2)
						   {
							   if (r >= l + 1)
							   {
								   System.out.printf("%d %d\n",i,v);
								   m++;
							   }
							   if (v % r == 0)
							   {
								   break;
							   }
						   }
					   }
				   }
				   if (i % j == 0)
				   {
					   break;
				   }
			   }
		   }
		}
		if (m == 0)
		{
			System.out.print("empty\n");
		}
	}
}

