package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}

		while (i % 3 == 0 && i % 5 == 0 && i % 7 == 0)
		{
			System.out.print("3 5 7");
			break;
		}
		while (i % 3 == 0 && i % 5 == 0 && i % 7 != 0)
		{
			System.out.print("3 5");
			break;
		}
		while (i % 3 != 0 && i % 5 == 0 && i % 7 == 0)
		{
			System.out.print("5 7");
			break;
		}
		while (i % 3 == 0 && i % 5 != 0 && i % 7 == 0)
		{
			System.out.print("3 7");
			break;
		}
		while (i % 3 != 0 && i % 5 != 0 && i % 7 == 0)
		{
			System.out.print("7");
			break;
		}
		while (i % 3 != 0 && i % 5 == 0 && i % 7 != 0)
		{
			System.out.print("5");
			break;
		}
		while (i % 3 == 0 && i % 5 != 0 && i % 7 != 0)
		{
			System.out.print("3");
			break;
		}
		if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0)
		{
			System.out.print("n");
		}

	}

}

