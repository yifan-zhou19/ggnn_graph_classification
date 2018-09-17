package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		for (a = 0;a <= 2;a++)
		{
			for (b = 0;b <= 2;b++)
			{
				for (c = 0;c <= 2;c++)
				{
					if ((a + (b > a) + (c == a) == 2) && (b + (a > b) + (a > c) == 2) && (c + (c > b) + (b > a) == 2))
					{
						if ((a > b) && (a > c)) //??a=b??????
						{
							if (b > c)
							{
								System.out.print("CBA");
							}
							if (b < c)
							{
								System.out.print("BCA");
							}
						}
						if ((b > c) && (b > a))
						{
							if (a > c)
							{
								System.out.print("CAB");
							}
							if (a < c)
							{
								System.out.print("ACB");
							}
						}
						if ((c > a) && (c > b))
						{
							if (a > b)
							{
								System.out.print("BAC");
							}
							if (a < b)
							{
								System.out.print("ABC");
							}
						}
					}
				}
			}
		}
	}
}
