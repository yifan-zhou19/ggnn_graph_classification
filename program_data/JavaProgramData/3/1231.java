package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int k;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   k = Integer.parseInt(tempVar2);
	   }
	   int[] sz = new int[N];
	   int i;
	   int m = 0;
	   int p = 0;
	   for (i = 0;i < n;i++)
	   {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   sz[i] = Integer.parseInt(tempVar3);
		   }
	   }
	   int j;
	   for (i = 0;i < n - 1;i++)
	   {
		   for (j = i + 1;j < n;j++)
		   {
			   if (sz[i] + sz[j] == k)
			   {
				   System.out.print("yes");
				   p = 1;
				   break;
			   }
			   else
			   {
				   m++;
			   }
		   }
			   if (p == 1)
			   {
					 break;
			   }
	   }

	   if (p == 0)
	   {
				   System.out.print("no");
	   }
	 return 0;
	}


}

