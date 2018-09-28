package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int flag = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}

		if (x % 3 == 0)
		{
			System.out.print("3");
			flag = 1;
		}
		if (x % 5 == 0)
		{
			if (flag == 1)
			{
				System.out.print(" ");
			}
			flag = 1;
			System.out.print("5");

		}
		if (x % 7 == 0)
		{
			if (flag == 1)
			{
				System.out.print(" ");
			}
			flag = 1;
			System.out.print("7");
		}
		if (x % 3 != 0 && x % 5 != 0 && x % 7 != 0)
		{
			System.out.print("n");
		}

		return 0;
	}
}

