package <missing>;

public class GlobalMembers
{
	public static int common(int a, int b)
	{
		if (a == b)
		{
			return a;
		}
		if (a > b)
		{
			return common(a / 2, b);
		}
		return common(a, b / 2);
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
		System.out.printf("%d",common(x, y));
	}
}

