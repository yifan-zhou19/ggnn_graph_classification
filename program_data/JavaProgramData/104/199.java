package <missing>;

public class GlobalMembers
{
	public static void find(int x,int y)
	{
		if (x == y)
		{
			System.out.printf("%d\n",x);
		}
		else if (x > y)
		{
			find(x / 2, y);
		}
		else
		{
			find(x, y / 2);
		}
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
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		find(x, y);
	}


}

