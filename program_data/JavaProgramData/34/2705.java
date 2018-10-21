package <missing>;

public class GlobalMembers
{
	public static void gujiao(int x)
	{
		if (x % 2 != 0)
		{
			System.out.printf("%d*3+1=%d\n",x,x * 3 + 1);
			x = x * 3 + 1;
		}
		else
		{
			System.out.printf("%d/2=%d\n",x,x / 2);
			x = x / 2;
		}
		if (x == 1)
		{
			System.out.print("End");
		}
		else
		{
			gujiao(x);
		}
	}

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
			return 0;
		}
		else
		{
			gujiao(n);
		}
		return 0;
	}

}

