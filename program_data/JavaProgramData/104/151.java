package <missing>;

public class GlobalMembers
{
	public static int zheng(int x,int i)
	{
		int j;
		if (i != 1)
		{
			for (j = 1;j < i;j++)
			{
				x = x / 2;
			}
		}
		return (x);
	}
	public static void Main()
	{
		int zheng = new int(int x,int i);
		int x;
		int y;
		int i;
		int j;
		int temp = 0;
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
			System.out.printf("%d",x);
		}
		else
		{
			for (i = 1;i <= 10;i++)
			{
				if (temp != 0)
				{
				   break;
				}
				for (j = 1;j <= 10;j++)
				{
					if (zheng(x, i) == zheng(y, j))
					{
						temp = zheng(y, j);
						break;
					}
				}
			}
			 System.out.printf("%d",temp);
		}
	}
}

