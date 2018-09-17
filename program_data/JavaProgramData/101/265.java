package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		for (a = 1; a <= 3; a++)
		{
			for (b = 1; b <= 3; b++)
			{
				for (c = 1; c <= 3; c++)
				{
					if ((c != b) && (c != a) && (b != a))
					{
						if (((a < b) + (c == a) == 3 - a) && ((a > b) + (a > c) == 3 - b) && ((c > b) + (b > a) == 3 - c))
						{
							;
						}
					}
				}
			}
		}
							if (a > b)
							{
								if (b > c)
								{
									System.out.print("ABC");
								}
								else if (c > a)
								{
									System.out.print("CAB");
								}
								else
								{
									System.out.print("ACB");
								}
							}
							else
							{
								if (a > c)
								{
									System.out.print("BAC");
								}
								else if (c > b)
								{
									System.out.print("CBA");
								}
								else
								{
									System.out.print("BCA");
								}
							}
		System.out.print("\n");

		return 0;
	}
}
