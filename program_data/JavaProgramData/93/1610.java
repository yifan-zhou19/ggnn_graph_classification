package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 3 == 0)
		{
			System.out.print("3");
			flag = 1;
		}
		if (n % 5 == 0)
		{
			if (flag != 0)
			{
				System.out.print(" ");
			}
			System.out.print("5");
			flag = 1;
		}
		if (n % 7 == 0)
		{
			if (flag != 0)
			{
				System.out.print(" ");
			}
			System.out.print("7");
			flag = 1;
		}
		if (flag == 0)
		{
			System.out.print("n");
		}
		return 0;
	}
}

