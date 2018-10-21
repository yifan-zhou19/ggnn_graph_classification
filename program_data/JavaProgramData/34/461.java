package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End");
			return 0;
		}
		else
		{
		while (true)
		{
			if (n % 2 == 0)
			{
				m = n;
				n = n / 2;
				System.out.printf("%d/2=%d",m,n);
				System.out.print("\n");
			}
			else
			{
				m = n;
				n = 3 * n + 1;
				System.out.printf("%d*3+1=%d",m,n);
				System.out.print("\n");
			}
			if (n == 1)
			{
				break;
			}
		}
		System.out.print("End");
		}
		return 0;
	}


}

