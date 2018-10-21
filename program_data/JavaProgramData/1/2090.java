package <missing>;

public class GlobalMembers
{
	public static int s = 0;
	public static void f(int x,int y)
	{
		int i;
		int j;
		int k;
		if (x == 1)
		{
			s++;
		}
		else
		{
			for (;y <= x;y++)
			{
				if (x % y == 0)
				{
					f(x / y, y);
				}
			}
		}
	}
	public static int Main()
	{
		int n;
		int k;
		int q;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q = Integer.parseInt(tempVar);
		}
		for (j = 0;j < q;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			f(n, 2);
			System.out.printf("%d\n",s);
			s = 0;
		}
		return 0;
	}
}

