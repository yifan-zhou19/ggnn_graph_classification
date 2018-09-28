package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sum = n;
		if (n == 1)
		{
		System.out.print("End");
		}
		while (n != 1)
		{
			if (n % 2 == 0)
			{
				sum /= 2;
				System.out.printf("%d/2=%d\n",n,sum);
				n = sum;
			}
			else
			{
				sum = 3 * n + 1;
				System.out.printf("%d*3+1=%d\n",n,sum);
				n = sum;
			}
			if (sum == 1)
			{
				System.out.print("End");
				break;
			}
		}
		return 0;
	}
}

