package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a = new int(int x,int y);
		int x;
		int y;
		int z;
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
		z = a(x, y);
		System.out.printf("%d\n",z);
	}

	public static int a(int x,int y)
	{
		int m;
		if (x == y)
		{
			m = x;
		}
		else if (x < y)
		{
			m = a(x, y / 2);
		}
		else
		{
			m = a(x / 2, y);
		}
		return (m);
	}

}

