package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] sz = new int[10000];
		int j = 0;
		int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 2;i <= n;i++)
	{
	   for (k = 2;k < i;k++)
	   {
		 if (i % k == 0)
		 {
		   break;
		 }
		 else if (k == i - 1)
		 {
			sz[j] = i;
			 j++;
		 }
	   }
	   if (i == n)
	   {
		  m = j;
	   }
	}
	if (m == 1)
	{
		System.out.print("empty");
	}
	else
	{
	  int p = 1;
	  for (j = 0;j < m - 1;j++)
	  {
	   if (sz[j + 1] - sz[j] == 2)
	   {
		   System.out.printf("%d %d\n",sz[j],sz[j + 1]);
		   p = 0;
	   }
	  }
	  if (p != 0)
	  {
		  System.out.print("empty");
	  }
	}
	return 0;
	}
}

