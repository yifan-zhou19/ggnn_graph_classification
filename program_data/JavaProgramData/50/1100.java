package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		if ((w + 12) % 7 == 5)
		{
			System.out.print("1\n");
		}
		if ((w + 12 + 31) % 7 == 5)
		{
			System.out.print("2\n");
		}
		if ((w + 12 + 31 + 28) % 7 == 5)
		{
			System.out.print("3\n");
		}
		if ((w + 12 + 31 + 28 + 31) % 7 == 5)
		{
			System.out.print("4\n");
		}
		if ((w + 12 + 31 + 28 + 31 + 30) % 7 == 5)
		{
			System.out.print("5\n");
		}
		if ((w + 12 + 31 + 28 + 31 + 30 + 31) % 7 == 5)
		{
			System.out.print("6\n");
		}
		if ((w + 12 + 31 + 28 + 31 + 30 + 31 + 30) % 7 == 5)
		{
			System.out.print("7\n");
		}
		if ((w + 12 + 31 + 28 + 31 + 30 + 31 + 30 + 31) % 7 == 5)
		{
			System.out.print("8\n");
		}
		if ((w + 12 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31) % 7 == 5)
		{
			System.out.print("9\n");
		}
		if ((w + 12 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30) % 7 == 5)
		{
			System.out.print("10\n");
		}
		if ((w + 12 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31) % 7 == 5)
		{
			System.out.print("11\n");
		}
		if ((w + 12 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30) % 7 == 5)
		{
			System.out.print("12\n");
		}
		return 0;
	}
}

