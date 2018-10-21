package <missing>;

public class GlobalMembers
{
	public static int choose(int x,int y)
	{
		if (x == y)
		{
			return x;
		}
		if (x > y)
		{
			return choose(x / 2, y);
		}
		else
		{
			return choose(x, y / 2);
		}
	}
	public static void Main()
	{
		int choose = new int(int x,int y);
		int m;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		k = choose(m, n);
		System.out.printf("%d\n",k);
	}

}

