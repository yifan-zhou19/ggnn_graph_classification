package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int i;
		int j;
		int k = 0;
		int[] sz = new int[num];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n;i++)
		{
		 for (j = 2;j <= i;j++)
		 {
		   if (i % j == 0 && i != j)
		   {
			 break;
		   }
			 else if (i == j)
			 {
			   sz[k] = i;
			   k++;
			 }
		 }
		}

			   for (i = 0;i < k - 1;i++)
			   {
				if (sz[i + 1] == sz[i] + 2)
				{
			   System.out.printf("%d %d\n",sz[i],sz[i + 1]);
			   a++;

				}
			   }
			   if (a == 0)
			   {
				 System.out.print("empty");
			   }

	  return 0;
	}

}

