package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int prime = int n;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 6;i <= n;i = i + 2)
		{
						  for (j = 3;j <= n / 2;j = j + 2)
						  {
											 if (prime(j) == 1 && prime(i - j) == 1)
											 {
												   System.out.printf("%d=%d+%d\n", i, j, i - j);
												   break;
											 }
						  }
		}
		return 0;
	}





				public static int prime(int n)
				{
			int i;
			int flag = 0;
			for (i = 2;i <= Math.sqrt(n);i++)
			{
								   if (n % i == 0)
								   {
											 flag++;
											 break;
								   }
			}
			if (flag == 1)
			{
			return 0;
			}
			else
			{
			return 1;
			}
				}


}

