package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		d = 13 % 7 - 1 + k;
		if (d == 5 || d == 12)
		{
			System.out.print("1\n");
		}

		d = (31 + 13) % 7 - 1 + k;
		if (d == 5 || d == 12)
		{
			System.out.print("2\n");
		}

		d = (31 + 28 + 13) % 7 - 1 + k;
		if (d == 5 || d == 12)
		{
			System.out.print("3\n");
		}

		d = (31 + 28 + 31 + 13) % 7 - 1 + k;
		if (d == 5 || d == 12)
		{
			System.out.print("4\n");
		}

		d = (31 + 31 + 30 + 28 + 13) % 7 - 1 + k;
		if (d == 5 || d == 12)
		{
			System.out.print("5\n");
		}

		d = (31 + 28 + 31 + 30 + 31 + 13) % 7 - 1 + k;
		if (d == 5 || d == 12)
		{
			System.out.print("6\n");
		}

		d = (31 + 28 + 31 + 30 + 31 + 30 + 13) % 7 - 1 + k;
		if (d == 5 || d == 12)
		{
			System.out.print("7\n");
		}

		d = (31 + 28 + 31 + 30 + 31 + 30 + 31 + 13) % 7 - 1 + k;
		if (d == 5 || d == 12)
		{
			System.out.print("8\n");
		}

		d = (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 13) % 7 - 1 + k;
		if (d == 5 || d == 12)
		{
			System.out.print("9\n");
		}

		d = (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 13) % 7 - 1 + k;
		if (d == 5 || d == 12)
		{
			System.out.print("10\n");
		}

		d = (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 13) % 7 - 1 + k;
		if (d == 5 || d == 12)
		{
			System.out.print("11\n");
		}

		d = (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 13) % 7 - 1 + k;
		if (d == 5 || d == 12)
		{
			System.out.print("12\n");
		}

		return 0;
	}
}

