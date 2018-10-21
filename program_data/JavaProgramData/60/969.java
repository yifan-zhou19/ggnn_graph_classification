package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int i;
	   int k;
	   int t = 0;
	   int[] sz = new int[10000];
	   for (i = 1;i < 10000;i++)
	   {
		   sz[i] = 1;
	   }
	   for (i = 3;i <= n - 2;i++)
	   {
		   for (k = 2;k <= i - 1;k++)
		   {
			   if (i % k == 0)
			   {
				   sz[i] = 0;
				   break;
			   }
			   else if ((i + 2) % (k + 2) == 0 || (i + 2) % (k + 1) == 0 || (i + 2) % k == 0)
			   {
				   sz[i] = 0;
				   break;
			   }
		   }

		   if (sz[i] == 1)
		   {
			   if (i == n - 2)
			   {
				   System.out.printf("%d %d",i,i + 2);
				   t = 1;
			   }
			   else
			   {
				   System.out.printf("%d %d\n",i,i + 2);
				   t = 1;
			   }
		   }
	   }
	   if (t == 0)
	   {
		   System.out.print("empty");
	   }
	   return 0;
	}
}

