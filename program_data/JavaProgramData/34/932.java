package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 1)
		{
			if (n % 2 != 0)
			{
				sum = n * 3 + 1;
				System.out.printf("%d*3+1=%d\n",n,sum);
				n = sum;
				sum = 0;
			}
			if (n % 2 == 0)
			{
				sum = n / 2;
				System.out.printf("%d/2=%d\n",n,sum);
				n = sum;
				sum = 0;
			}
		}
		System.out.print("End");
		return 0;

	}
}

