package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int ra;
		int rb;
		int rc;
		String result = new String(new char[4]);
		for (a = 0;a < 3;a++)
		{
			for (b = 0;b < 3;b++)
			{
				for (c = 0;c < 3;c++)
				{
					ra = rb = rc = 0;

					ra = (b > a) + (c == a);
					rb = (a > b) + (a > c);
					rc = (c > b) + (b > a);

					if ((a > b && ra >= rb) || (a > c && ra >= rc) || (b > a && rb >= ra) || (b > c && rb >= rc) || (c > a && rc >= ra) || (c > b && rc >= rb) || (a == b && ra != rb) || (b == c && rb != rc) || (a == c && ra != rc)) //?????
					{
						continue;
					}
					if (a != b && b != c && a != c)
					{
						result = tangible.StringFunctions.changeCharacter(result, a, 'A');
						result = tangible.StringFunctions.changeCharacter(result, b, 'B');
						result = tangible.StringFunctions.changeCharacter(result, c, 'C');
						result = tangible.StringFunctions.changeCharacter(result, 3, '\0');
						System.out.print(result);
						System.out.print("\n");
					}
					else if (a == b)
					{
						if (c < a)
						{
							System.out.print("CAB");
							System.out.print("\n");
						}
						else
						{
							System.out.print("ABC");
							System.out.print("\n");
						}
					}
					else if (b == c)
					{
						if (a < b)
						{
							System.out.print("ABC");
							System.out.print("\n");
						}
						else
						{
							System.out.print("BCA");
							System.out.print("\n");
						}
					}
					else if (a == c)
					{
						if (b < a)
						{
							System.out.print("BAC");
							System.out.print("\n");
						}
						else
						{
							System.out.print("ACB");
							System.out.print("\n");
						}
					}
				}
			}
		}
		//while(1);
		return 0;
	}
}

