package <missing>;

public class GlobalMembers
{
	public static int com(int x, int y)
	{
		int t;
		if (x == y)
		{
			t = x;
		}
		else
		{
			t = (x > y)?com(x / 2, y):com(x, y / 2);
		}
		return t;
	}
	public static void Main()
	{
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d\n",com(x, y));
	}


}

