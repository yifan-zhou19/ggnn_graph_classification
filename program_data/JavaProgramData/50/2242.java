package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int w1;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		if (w >= 1 && w <= 5)
		{
			w1 = 6 - w;
		}
		else
		{
			w1 = 13 - w;
		}
		if (w == 7)
		{
			System.out.print("1\n");
		}
		if ((13 + 31 - w1) % 7 == 0)
		{
			System.out.print("2\n");
		}
		if ((13 + 28 + 31 - w1) % 7 == 0)
		{
			System.out.print("3\n");
		}
		if ((13 + 31 + 28 + 31 - w1) % 7 == 0)
		{
			System.out.print("4\n");
		}
		if ((13 + 30 + 31 + 28 + 31 - w1) % 7 == 0)
		{
			System.out.print("5\n");
		}
		if ((13 + 31 + 30 + 31 + 28 + 31 - w1) % 7 == 0)
		{
			System.out.print("6\n");
		}
		if ((13 + 30 + 31 + 30 + 31 + 28 + 31 - w1) % 7 == 0)
		{
			System.out.print("7\n");
		}
		if ((13 + 31 + 30 + 31 + 30 + 31 + 28 + 31 - w1) % 7 == 0)
		{
			System.out.print("8\n");
		}
		if ((13 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 - w1) % 7 == 0)
		{
			System.out.print("9\n");
		}
		if ((13 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 - w1) % 7 == 0)
		{
			System.out.print("10\n");
		}
		if ((13 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 - w1) % 7 == 0)
		{
			System.out.print("11\n");
		}
		if ((13 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 - w1) % 7 == 0)
		{
			System.out.print("12\n");
		}


		return 0;
	}

}

