package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		if (w == 7)
		{
			System.out.print("1\n");
			System.out.print("10\n");
		}
		if (w == 6)
		{
			System.out.print("5\n");
		}
		if (w == 2)
		{
			System.out.print("9\n");
			System.out.print("12\n");
		}
		if (w == 5)
		{
			System.out.print("8\n");
		}
		if (w == 4)
		{
			System.out.print("2\n");
			System.out.print("3\n");
			System.out.print("11\n");
		}
		if (w == 1)
		{
			System.out.print("4\n");
			System.out.print("7\n");
		}
		if (w == 3)
		{
			System.out.print("6\n");
		}

		return 0;
	}


}

