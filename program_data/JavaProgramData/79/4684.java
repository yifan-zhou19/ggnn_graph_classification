package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 1;
		int k = 0;
		int n;
		int m;
		int count = 0;
		int[] sz = new int[N];
		while (true)
		{
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   m = Integer.parseInt(tempVar2);
		   }
		   if (m == 0 && n == 0)
		   {
			   break;
		   }
		   else
		   {
			   if (n == 1)
			   {
				   j = 1;
			   }
			   else
			   {
				   j = 1;
				   for (i = 2;i <= n;i++)
				   {
					  j = (j + m - 1) % i + 1;
				   }
			   }
			  count++;
			  sz[k] = j;
			  k++;
		   }
		}
		for (k = 0;k < count;k++)
		{
			System.out.printf("%d\n",sz[k]);
		}

		return 0;
	}
}

