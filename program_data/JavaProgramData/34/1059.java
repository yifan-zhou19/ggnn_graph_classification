package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
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
			for (i = 0;i >= 0;i++)
			{
				if (n == 1)
				{
					break;
				}
				else if (n % 2 == 1)
				{
				k = n * 3 + 1;
				System.out.printf("%d*3+1=%d\n",n,k);
				n = k;
				}
				else if (n % 2 == 0)
				{
					k = n / 2;
					System.out.printf("%d/2=%d\n",n,k);
					n = k;
				}
				else if (n / 2 == 1)
				{
					System.out.printf("%d/2=1\n",n);
					k = n;
				}

			}
			System.out.print("End");
		}



		return 0;
	}
}

