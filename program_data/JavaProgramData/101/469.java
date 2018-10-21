package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int j;
		int h;
		String m = new String(new char[3]);
		for (i = 1; i <= 3; i++)
		{
			for (j = 1;j <= 3;j++)
			{
				for (h = 1;h <= 3;h++)
				{
					a = ((j > i) + (h == i));
					b = ((i > j) + (i > h));
					c = ((h > j) + (j > i));
					if (a != b && b != c && c != a)
					{
						m = tangible.StringFunctions.changeCharacter(m, a, 'A');
						m = tangible.StringFunctions.changeCharacter(m, b, 'B');
						m = tangible.StringFunctions.changeCharacter(m, c, 'C');
						if (a + i == 3 && b + j == 3 && c + h == 3)
						{
						System.out.print(m.charAt(2));
						System.out.print(m.charAt(1));
						System.out.print(m.charAt(0));
						}
					}
				}
			}
		}
		return 0;
	}
}

