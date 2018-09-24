package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		for (a = 0;a <= 2;a++)
		{
			for (b = 0;b <= 2;b++)
			{
				for (c = 0;c <= 2;c++)
				{
					if ((a + (b > a) + (c == a) == 2) && (b + (a > b) + (a > c)) == 2 && (c + (c > b) + (b > a)) == 2)
					{
						if (a > b && a > c)
						{
							if (b > c)
							{
								System.out.print("CBA");
							}
							else
							{
								System.out.print("BCA");
							}
						}
						if (b > c && b > a)
						{
						   if (c > a)
						   {
							   System.out.print("ACB");
						   }
						   else
						   {
							   System.out.print("CAB");
						   }
						}
						if (c > b && c > a)
						{
							if (b > a)
							{
								System.out.print("ABC");
							}
							else
							{
								System.out.print("BAC");
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
