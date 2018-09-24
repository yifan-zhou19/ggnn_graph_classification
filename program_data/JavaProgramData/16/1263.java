package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int i;
		int result = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}

		if (x == 0)
		{
			System.out.print("0");
		}
		while (x != 0)
		{
			System.out.printf("%d",x % 10);
			x = x / 10;
		}
		System.out.printf("\n",result);
		return 0;
	}
}

