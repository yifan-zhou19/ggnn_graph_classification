package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int p;
		int[] a = new int[10];
		int[] b = new int[10];
		int i = 0;
		int j = 0;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		do
		{
		if (x > y)
		{
			x = x / 2;
		}
		else
		{
		if (y > x)
		{
			y = y / 2;
		}
		}
		if (x == y)
		{
				System.out.printf("%d",x);
		}
		} while (x != y);

		return 0;
	}
}

