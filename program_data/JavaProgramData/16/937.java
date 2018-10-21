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
		if (n >= 0,n < 10)
		{
			System.out.printf("%d\n",n);
		}
		else
		{
			if (n >= 10,n < 100)
			{
			System.out.printf("%d%d\n",n % 10,n / 10);
			}
			else
			{
				if (n >= 100,n < 1000)
				{
					System.out.printf("%d%d%d\n",n % 10,n % 100 / 10,n / 100);
				}
				else
				{
					if (n >= 1000,n < 10000)
					{
					System.out.printf("%d%d%d%d\n",n % 10,n % 100 / 10,n / 100 % 10,n / 1000);
					}
				else
				{
					System.out.print("00001\n");
				}
				}
			}
		}
		return 0;
	}


}

