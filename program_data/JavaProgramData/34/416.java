package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
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
			for (i = 0;;i++)
			{
				if (n % 2 == 0)
				{
					System.out.printf("%d/2=%d\n",n,n / 2);
					n /= 2;
				}
				else
				{
					System.out.printf("%d*3+1=%d\n",n,3 * n + 1);
					n = 3 * n + 1;
				}
				if (n == 1)
				{
					break;
				}
			}
				System.out.print("End\n");
		}


		return 0;
	}
}

