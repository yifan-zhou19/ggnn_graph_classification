package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int searchjoint = new int(int x,int y);
		int x;
		int y;
		int flag;
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
		if (x == y)
		{
			flag = x;
		}
		else if (x > y)
		{
			flag = searchjoint(y, x);
		}
		else
		{
			flag = searchjoint(x, y);
		}
		System.out.printf("%d",flag);
		return 0;
	}
	public static int searchjoint(int x,int y)
	{
		int i;
		int j;
		int t;
		int flag = 1;
		for (i = 0;i < 10 && x >= 1;i++)
		{
			for (j = 0, t = y;j < 10 && t >= 1;j++)
			{
				t = t / 2;
				if (x == t)
				{
					flag = x;
					break;
				}
			}
			if (flag != 1)
			{
				break;
			}
			x = x / 2;
		}
		return flag;
	}
}

