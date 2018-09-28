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
		if ((12 % 7 + w) % 7 == 5)
		{
			System.out.print("1\n");
		}
		if ((43 % 7 + w) % 7 == 5)
		{
			System.out.print("2\n");
		}
		if (((43 + 28) % 7 + w) % 7 == 5)
		{
			System.out.print("3\n");
		}
		if (((43 + 28 + 31) % 7 + w) % 7 == 5)
		{
			System.out.print("4\n");
		}

		if (((43 + 28 + 31 + 30) % 7 + w) % 7 == 5)
		{
			System.out.print("5\n");
		}
		if (((43 + 28 + 31 + 30 + 31) % 7 + w) % 7 == 5)
		{
			System.out.print("6\n");
		}
		if (((43 + 28 + 31 + 30 + 31 + 30) % 7 + w) % 7 == 5)
		{
			System.out.print("7\n");
		}
		if (((43 + 28 + 31 + 30 + 31 + 30 + 31) % 7 + w) % 7 == 5)
		{
			System.out.print("8\n");
		}

		if (((43 + 28 + 31 + 30 + 31 + 30 + 62) % 7 + w) % 7 == 5)
		{
			System.out.print("9\n");
		}
		if (((43 + 28 + 31 + 30 + 31 + 30 + 62 + 30) % 7 + w) % 7 == 5)
		{
			System.out.print("10\n");
		}
		if (((43 + 28 + 31 + 30 + 31 + 30 + 62 + 61) % 7 + w) % 7 == 5)
		{
			System.out.print("11\n");
		}
		if (((43 + 28 + 31 + 30 + 31 + 30 + 62 + 61 + 30) % 7 + w) % 7 == 5)
		{
			System.out.print("12\n");
		}
		return 0;
	}
}

