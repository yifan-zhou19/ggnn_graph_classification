package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if ((7 + n) % 7 == 0)
		{
			System.out.print("1\n10\n");
		}
		else if ((31 + n) % 7 == 0)
		{
			System.out.print("2\n3\n11\n");

		}
		else if ((2 * 31 + n) % 7 == 0)
		{
			System.out.print("4\n7\n");
		}
		else if ((2 * 31 + 30 + n) % 7 == 0)
		{
			System.out.print("5");
		}
		else if ((30 + 3 * 31 + n) % 7 == 0)
		{
			System.out.print("6");
		}
		else if ((4 * 31 + 2 * 30 + n) % 7 == 0)
		{
			System.out.print("8");
		}
		else if ((5 * 31 + 2 * 30 + n) % 7 == 0)
		{
			System.out.print("9\n12\n");

		}

	return 0;
	}

}

