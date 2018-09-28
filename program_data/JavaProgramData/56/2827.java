package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void f(int x);
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		f(x);
		return 0;
	}
	public static void f(int x)
	{
		if (x >= 10)
		{
			System.out.printf("%d",x % 10);
			int y;
			y = (x - x % 10) / 10;
			f(y);
		}
		else
		{
			System.out.printf("%d\n",x);
		}
	}
}

