package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int x,int y);
		int t;
		int m;
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
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
			k = f(m, n);
			System.out.printf("%d\n",k);
		}
		return 0;
	}

	public static int f(int x,int y) //x?????y????
	{
		int k;
		if (x <= 0 || y == 0)
		{
			k = 0;
		}
		else
		{
		if (x == 1 || y == 1)
		{
			k = 1;
		}
		else
		{
			if (x == y)
			{
				k = f(x, y - 1) + f(x - y, y) + 1;
			}
		else
		{
			k = f(x, y - 1) + f(x - y, y);
		}
		}
		}
		return k;
	}


}

