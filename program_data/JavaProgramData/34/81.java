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
		else if (n == 2)
		{
			System.out.print("2/2=1\nEnd");
		}
		else
		{
			while (n != 1)
			{
			if (n % 2 == 0)
			{
			System.out.printf("%d/2=%d\n",n,n / 2);
		if ((n % 2) % 2 == 0)
		{
			n = n / 2;
		}
		else
		{
			n = 3 * n / 2 + 1;
		}
			}
		else
		{
			System.out.printf("%d*3+1=%d\n",n,3 * n + 1);
		if ((3 * n + 1) % 2 == 0)
		{
			n = 3 * n + 1;
		}
		else
		{
			n = 3 * (3 * n + 1) + 1;
		}
		}
			}
		System.out.print("End");
		}
		return 0;
	}


}

