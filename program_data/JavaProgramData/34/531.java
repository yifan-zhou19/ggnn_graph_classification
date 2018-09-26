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
		if (n == 1)
		{
			System.out.print("End");
		}
		else
		{
			while (n != 1)
			{
				if (n % 2 != 0)
				{
					System.out.printf("%d",n);
					n = n * 3 + 1;
					System.out.printf("*3+1=%d\n",n);
				}
				if (n % 2 == 0)
				{
					System.out.printf("%d",n);
					n = n / 2;
					System.out.printf("/2=%d\n",n);
				}
			}
			if (n == 1)
			{
				System.out.print("End");
			}
		}

		return 0;
	}
}

