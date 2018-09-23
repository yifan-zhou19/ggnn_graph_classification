package <missing>;

public class GlobalMembers
{
	public static int fun(int i,int j,int count)
	{
		int k;
		for (k = i;k <= Math.sqrt(j);k++)
		{
			if (j % k == 0)
			{
				count++;
				count = fun(k, j / k, count);
			}
		}
	  return count;
	}

	public static int Main()
	{
		int count;
		int k;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (j = 0;j < k;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			count = 1;
			for (i = 2;i < Math.sqrt(n);i++)
			{
			   if (n % i == 0)
			   {
				count++;
				count = fun(i, n / i, count);
			   }
			}

			 System.out.printf("%d\n",count);
		}
		return 0;
	}
}

