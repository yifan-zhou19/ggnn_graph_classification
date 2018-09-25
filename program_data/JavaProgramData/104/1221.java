package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
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
		while (x != y)
		{
			if (x < y)
			{
				z = x;
				x = y;
				y = z;
			}
			x /= 2;
			if (x == y)
			{
				break;
			}
		}
		System.out.printf("%d",x);
	}
}

