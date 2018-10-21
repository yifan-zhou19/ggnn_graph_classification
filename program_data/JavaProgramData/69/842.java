package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int x;
		int y;
		int z;
		int[] c = new int[252];
		int r = 0;
		int s = 0;
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		String d = new String(new char[251]);
		String e = new String(new char[251]);
		d = ConsoleInput.readToWhiteSpace(true).charAt(0);
		e = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;i < 251;i++)
		{
			c[i] = 0;
		}
		x = d.length();
		y = e.length();
		for (i = 0;i < x;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, d.charAt(x - 1 - i));
		}
		for (i = 0;i < y;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, e.charAt(y - 1 - i));
		}
		for (i = 0;i < x;i++)
		{
			if (a.charAt(i) != '0')
			{
				r = 1;
				break;
			}
		}
		for (i = 0;i < y;i++)
		{
			if (b.charAt(i) != '0')
			{
				s = 1;
				break;
			}
		}
		if (r == 0 && s == 0)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		else
		{
			if (x > y)
			{
				for (i = y;i < x;i++)
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '0');
				}
				for (i = 0;i < x;i++)
				{
					c[i] += (int)a.charAt(i) - 48 + (int)b.charAt(i) - 48;
					if (c[i] >= 10)
					{
						c[i] += -10;
						c[i + 1]++;
					}
				}
				for (i = x + 1;;i--)
				{
					if (c[i] != 0)
					{
						z = i;
						break;
					}
				}
				System.out.print(c[z]);
				for (i = 0;i < z;i++)
				{
					System.out.print(c[z - 1 - i]);
				}
				System.out.print("\n");
			}
			else
			{
				for (i = x;i < y;i++)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '0');
				}
				for (i = 0;i < y;i++)
				{
					c[i] += (int)a.charAt(i) - 48 + (int)b.charAt(i) - 48;
					if (c[i] >= 10)
					{
						c[i] += -10;
						c[i + 1]++;
					}
				}
				for (i = y + 1;;i--)
				{
					if (c[i] != 0)
					{
						z = i;
						break;
					}
				}
				System.out.print(c[z]);
				for (i = 0;i < z;i++)
				{
					System.out.print(c[z - 1 - i]);
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}

