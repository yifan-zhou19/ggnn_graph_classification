package <missing>;

public class GlobalMembers
{
	public static void tree(int a,int b)
	{
		if (a == b)
		{
			System.out.printf("%d",a);
		}
		else
		{
		if (a > b)
		{
			if (a >= 2 * b)
			{
				tree(a / 2, b);
			}
			else
			{
				tree(a / 2, b / 2);
			}
		}
		else
		{
			tree(b, a);
		}
		}
	}

	public static int Main()
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
		tree(x, y);
		return 0;
	}

}

