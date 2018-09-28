package <missing>;

public class GlobalMembers
{
	public static int prime(int s)
	{
		int k;
		if (s % 2 == 0)
		{
			return 0;
		}
		for (k = 1;k <= Math.sqrt(s) / 2;k++)
		{
			if (s % (2 * k + 1) == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n / 2;i++)
		{
		   for (j = 3;j <= i;j++)
		   {
			 if ((prime(j) == 1) && (prime(2 * i - j) == 1))
			 {
				 System.out.printf("%d=%d+%d\n",2 * i,j,2 * i - j);
				 break;
			 }
		   }
		}


	}
}

