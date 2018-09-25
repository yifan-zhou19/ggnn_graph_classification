package <missing>;

public class GlobalMembers
{
	public static int ap(int x,int y)
	{
		if (y == 1 || x == 1)
		{
			return 1;
		}
		else if (y == 2)
		{
			return 1 + x / 2;
		}
		else if (x <= y)
		{
			return (1 + ap(x, x - 1));
		}
		else
		{
			return (ap((x - y), y) + ap(x, (y - 1)));
		}
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a;
		int b;
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",ap(a, b));
		}
		return 0;
	}
}

