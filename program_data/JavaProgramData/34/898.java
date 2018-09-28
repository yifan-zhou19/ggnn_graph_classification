package <missing>;

public class GlobalMembers
{
	public static int gujiao(int x)
	{
		int x0 = x;
		if (x % 2 == 1)
		{
			x = 3 * x0 + 1;
			System.out.printf("%d*3+1=%d\n",x0,x);
		}
		else
		{
			x = x0 / 2;
			System.out.printf("%d/2=%d\n",x0,x);
		}
		return x;
	}
	public static int Main()
	{
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (x == 1)
		{
			System.out.print("End");
		}
		else
		{
			while (x != 1)
			{
				x = gujiao(x);
				if (x == 1)
				{
					System.out.print("End");
					break;
				}

			}
		}
		return 0;
	}
}

