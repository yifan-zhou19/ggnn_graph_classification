package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
		int m;
		int n;
		int i;
		int way = new int(int x,int y);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",way(m, n));
		}
	}
	public static int way(int x,int y)
	{
		int m;
		int n;
		m = x;
		n = y;
		if (x == 1 || y == 1 || x == 0)
		{
			return (1);
		}
		else if (x < y)
		{
			return (way(x, x));
		}
		else
		{
			return (way(x - y, y) + way(x, y - 1));
		}
	}




}

