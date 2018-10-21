package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int a1;
		int b1;
		int c1;
		int k;
		String rank = new String(new char[3]);
		for (a = 0;a < 3;a++)
		{
			 for (b = 0;b < 3;b++)
			 {
				 for (c = 0;c < 3;c++)
				 {
					a1 = (b > a) + (c == a);
					b1 = (a > b) + (a > c);
					c1 = (c > b) + (b > a);
					if ((a + a1) == 2 && (b + b1) == 2 && (c + c1) == 2)
					{
						rank = tangible.StringFunctions.changeCharacter(rank, a, 'A');
					rank = tangible.StringFunctions.changeCharacter(rank, b, 'B');
					rank = tangible.StringFunctions.changeCharacter(rank, c, 'C');
					for (k = 0;k < 3;k++)
					{
					System.out.print(rank.charAt(k));
					}
					}
				 }
			 }
		}
		System.in.read();
		return 0;
	}
}

