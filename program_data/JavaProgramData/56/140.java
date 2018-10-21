package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		do
		{
			y = x % 10;
			System.out.printf("%d",y);
			x /= 10;
		}while (x != 0);
		return 0;
	}

}

