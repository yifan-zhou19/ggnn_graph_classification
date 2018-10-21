package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
	for (a = 1;a <= 3;a++)
	{
		for (b = 1;b <= 3;b++)
		{
			for (c = 1;c <= 3;c++)
			{
		if (((a < b) + (a == c) + a == (b < a) + (c < a) + b) && ((a < b) + (a == c) + a == (b < c) + (a < b) + c))
		{
		if ((a > b) && (b > c))
		{
			System.out.print("CBA");
			System.out.print("\n");
		}
		{
		if ((a > c) && (c > b))
		{
			System.out.print("BCA");
			System.out.print("\n");
		}
		{
		if ((b > a) && (a > c))
		{
			System.out.print("CAB");
			System.out.print("\n");
		}
		{
		if ((b > c) && (c > a))
		{
			System.out.print("ACB");
			System.out.print("\n");
		}
		{
		if ((c > a) && (a > b))
		{
			System.out.print("BAC");
			System.out.print("\n");
		}
	if ((c > b) && (b > a))
	{
		System.out.print("ABC");
		System.out.print("\n");
	}
}
}
}
}
		}
			}
		}
	}
	return 0;
	}
}
