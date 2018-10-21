package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 1;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		if (n == 1)
		{
			System.out.print("End");
		}
		else
		{
			while (i != 0)
			{
				if (n % 2 != 0)
				{
					System.out.printf("%d*%d+%d=%d\n",n,3,1,n * 3 + 1);
					n = n * 3 + 1;
				}
				else
				{
					System.out.printf("%d/%d=%d\n",n,2,n / 2);
					n = n / 2;
					if (n == 1)
					{
						i = 0;
					}
				}
			}
			System.out.print("End");
		}
		return 0;
	}
}

