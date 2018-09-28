package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int count = 0;
	int prime = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] su = new int[10000];
	for (i = 1;i <= n;i++)
	{
	   for (j = 1;j < i;j++)
	   {
		  if (i % j == 0)
		  {
			 count += 1;
		  }
	   }
	   if (count == 1)
	   {
		 su[prime] = i;
		 prime += 1;
	   }
		 count = 0;
	}
		 count = 0;
	for (i = 0;i < prime;i++)
	{
		if (su[i + 1] - su[i] == 2)
		{
		  System.out.printf("%d %d\n",su[i],su[i + 1]);
		  count += 1;
		}
	}
	if (count == 0)
	{
	System.out.print("empty");
	}
	return 0;
	}



}

