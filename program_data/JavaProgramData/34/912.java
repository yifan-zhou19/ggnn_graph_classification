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
		if (n != 1)
		{
			while (true)
			{
				if (n % 2 != 0 && n != 1)
				{
					n = n * 3 + 1;
					System.out.printf("%d*3+1=%d\n",(n - 1) / 3,n);
				}
				else if (n % 2 == 0 && n != 1)
				{
					n = n / 2;
					System.out.printf("%d/2=%d\n",2 * n,n);
				}
				else if (n == 1)
				{
					System.out.print("End");
					break;
				}
			}
		}
		else if (n == 1)
		{
			System.out.print("End");
		}
		return 0;
	}


}

