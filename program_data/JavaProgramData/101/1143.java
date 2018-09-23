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
		String res = new String(new char[4]);

		for (a = 0; a < 3; a++)
		{
			for (b = 0; b < 3; b++)
			{
				if (b == a)
				{
					continue;
				}
				for (c = 0; c < 3; c++)
				{
					if (c == a || c == b)
					{
						continue;
					}
					ra = rb = rc = 0;

					ra = (b > a) + (c == a);
					rb = (a > b) + (a > c);
					rc = (c > b) + (b > a);

					if ((a > b && ra > rb) || (a > c && ra > rc) || (b > c && rb > rc))
					{
						continue;
					}

					res = tangible.StringFunctions.changeCharacter(res, a, 'A');
					res = tangible.StringFunctions.changeCharacter(res, b, 'B');
					res = tangible.StringFunctions.changeCharacter(res, c, 'C');
					res = tangible.StringFunctions.changeCharacter(res, 3, '\0');
				}
			}
		}
		System.out.print(res);
		System.out.print("\n");
		return 0;
	}
}

