package <missing>;

public class GlobalMembers
{
	public static int pd(int n)
	{
		int k;
		int i;
		int j;
	   k = Math.sqrt(n);
	   if (n == 1)
	   {
		   return 0;
	   }
	   else if (n == 2)
	   {
		   return 1;
	   }
	   else
	   {
	   for (i = 2;i <= k;i++)
	   {
		   if (n % i == 0)
		   {
			   break;
		   }
	   }
	   }
		   if (i > k)
		   {
			   return 1;
		   }
		   else
		   {
			   return 0;
		   }
	}
	public static void Main()
	{
		int n;
		int j;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i += 2)
		{
			for (j = 2;j < i;j++)
			{
				if (pd(j) == 1 && pd(i - j) == 1)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}
	}




}

