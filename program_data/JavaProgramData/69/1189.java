package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int r;
		int j = 0;
		int A;
		int B;
		int C;
		int D;
		int counta = 0;
		int countb = 0;
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		String c = new String(new char[250]);
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i);i++)
		{
			counta++;
		}
		for (i = 0;b.charAt(i);i++)
		{
			countb++;
		}
		if (counta >= countb)
		{
			for (i = counta - 1;i >= (counta - countb);i--)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i - counta + countb));
			}
			for (i = 0;i < (counta - countb);i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '0');
			}
		}
		if (counta < countb)
		{
			for (i = countb - 1;i >= (countb - counta);i--)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i - countb + counta));
			}
			for (i = 0;i < (countb - counta);i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '0');
			}
			counta = countb;
		}
		for (i = 0;i <= counta;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, '0');
		}
		for (i = counta - 1;i >= 0;i--)
		{
			A = a.charAt(i) - '0';
			B = b.charAt(i) - '0';
			C = A + B;
			D = c.charAt(i + 1) - '0';
			if (C + D < 10)
			{
				c = tangible.StringFunctions.changeCharacter(c, i + 1, num[C + D]);
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i, '1');
				c = tangible.StringFunctions.changeCharacter(c, i + 1, num[C + D - 10]);
			}
		}
			for (i = 0;i <= counta;i++)
			{
				if (c.charAt(i) == '0')
				{
					j++;
				}
			}
			if (j == counta + 1)
			{
				System.out.print("0\n");
			}
			else
			{
				for (i = 0;i <= counta;i++)
				{
					if (c.charAt(i) != '0')
					{
						r = i;
						break;
					}
				}
				for (i = r;i <= counta;i++)
				{
					System.out.printf("%c",c.charAt(i));
				}
			}
			System.out.print("\n");
		return 0;
	}





}

