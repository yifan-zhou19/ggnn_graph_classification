package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	for (a = 0;a < 3;a++)
	{
		for (b = 0;b < 3;b++)
		{
			for (c = 0;c < 3;c++)
			{
				if ((a != b) && (b != c) && (b != c))
				{
					if (((b > a) + (c == a) + a == 2) && ((a > b) + (a > c) + b == 2) && ((c > b) + (b > a) + c == 2))
					{
						if ((a > c) && (c > b))
						{
							System.out.print("BCA");
						}
					}
				}
			}
		}
	}
	return 0;
	}
}
