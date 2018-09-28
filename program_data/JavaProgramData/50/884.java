package <missing>;

public class GlobalMembers
{
	public static int start;
	public static final int[] thirteen = {13, 44, 72, 103, 133, 164, 194, 225, 256, 286, 317, 347};

	public static int conv(int a)
	{
		if (a == 1)
		{
			return 5;
		}
		if (a == 2)
		{
			return 4;
		}
		if (a == 3)
		{
			return 3;
		}
		if (a == 4)
		{
			return 2;
		}
		if (a == 5)
		{
			return 1;
		}
		if (a == 6)
		{
			return 7;
		}
		if (a == 7)
		{
			return 6;
		}
	}
	public static int Main()
	{
		start = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < 12;i++)
		{
			if ((thirteen[i] - conv(start)) % 7 == 0)
			{
				System.out.print(i + 1);
				System.out.print("\n");
			}
		};
		return 0;
	}



}

