package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		a = x / 100;
		b = (x - a * 100) / 10;
		c = x - a * 100 - b * 10;
		y = c * 100 + b * 10 + a;

		System.out.printf("%d\n",y);
		return 0;
	}
}

