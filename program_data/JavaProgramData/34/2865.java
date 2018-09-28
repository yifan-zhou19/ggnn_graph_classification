package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		j = 1000;
		for (i = 0;i < j;i++)
		{
			if (n == 1)
			{
			System.out.print("End");
			break;
			}
			if (n != 1)
			{
	if (n % 2 == 0)
	{
			m = n / 2;
			System.out.printf("%d/2=%d\n",n,m);
			n = m;
			if (n == 1)
			{
				System.out.print("End");
			break;
			}
	}
		if (n % 2 == 1)
		{
				m = n * 3 + 1;
				System.out.printf("%d*3+1=%d\n",n,m);
				n = m;

		}
			}
		}
		return 0;
	}
}

