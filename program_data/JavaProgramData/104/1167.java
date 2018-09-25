package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
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
		while (x != y)
		{
		if (x > y)
		{
			x /= 2;
		}
		else
		{
			y /= 2;
		}
		}
		System.out.printf("%d",x);

	}


}

