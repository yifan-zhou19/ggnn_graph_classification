package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int y1;
		int y2;
		int y3;
		int y4;
		int y5;
		int y6;
		int y7;
		int y8;
		int y9;
		int y10;
		int y11;
		int y12;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}

		y1 = (a + 12) % 7;
		y2 = (a + 31 + 12) % 7;
		y3 = (a + 31 + 28 + 12) % 7;
		y4 = (a + 31 + 28 + 31 + 12) % 7;
		y5 = (a + 31 + 28 + 31 + 30 + 12) % 7;
		y6 = (a + 31 + 28 + 31 + 30 + 31 + 12) % 7;
		y7 = (a + 31 + 28 + 31 + 30 + 31 + 30 + 12) % 7;
		y8 = (a + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 12) % 7;
		y9 = (a + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 12) % 7;
		y10 = (a + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 12) % 7;
		y11 = (a + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 12) % 7;
		y12 = (a + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 12) % 7;

		if (y1 == 5)
		{
			System.out.print("1\n");
		}
		if (y2 == 5)
		{
			System.out.print("2\n");
		}
		if (y3 == 5)
		{
			System.out.print("3\n");
		}
		if (y4 == 5)
		{
			System.out.print("4\n");
		}
		if (y5 == 5)
		{
			System.out.print("5\n");
		}
		if (y6 == 5)
		{
			System.out.print("6\n");
		}
		if (y7 == 5)
		{
			System.out.print("7\n");
		}
		if (y8 == 5)
		{
			System.out.print("8\n");
		}
		if (y9 == 5)
		{
			System.out.print("9\n");
		}
		if (y10 == 5)
		{
			System.out.print("10\n");
		}
		if (y11 == 5)
		{
			System.out.print("11\n");
		}
		if (y12 == 5)
		{
			System.out.print("12\n");
		}
		return 0;
	}
}

