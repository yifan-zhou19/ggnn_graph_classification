package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int s = 0;
		int y;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) > 96 && a.charAt(i) < 123)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32); //????????
			}
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) > 64 && a.charAt(i) < 91)
			{
				s = s * n + (int)a.charAt(i) - 55;
			}
			else
			{
				s = s * n + a.charAt(i) - 48; //?n?????????
			}
		}
		b = null;
		if (s == 0)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else
		{
			for (;s > 0;s = (s - y) / m)
			{
				y = s % m;
				for (j = 0;b.charAt(j) != 0;j++)
				{
					;
				}
				for (;j >= 0;j--)
				{
					b = tangible.StringFunctions.changeCharacter(b, j + 1, b.charAt(j));
				}
				if (y > 9)
				{
					b = tangible.StringFunctions.changeCharacter(b, 0, y + 55);
				}
				else
				{
					b = tangible.StringFunctions.changeCharacter(b, 0, y + 48); //???????m??
				}
			}
			System.out.print(b);
			System.out.print("\n");
		}
		return 0;
	}
}

