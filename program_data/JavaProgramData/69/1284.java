package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		int[] c = new int[300];
		int j = 299;
		for (int i = 0;i <= 299;i++)
		{
			a = a.substring(0, i);
			b = b.substring(0, i);
			c[i] = 0;
		}
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int lena;
		int lenb;
		for (int i = 0;i < 300;i++)
		{
			if (a.charAt(i) == 0)
			{
				lena = i - 1;
			break;
			}
		}
		for (int i = 0;i < 300;i++)
		{
			if (b.charAt(i) == 0)
			{
				lenb = i - 1;
			break;
			}
		}
		for (int i = 0;i <= lena;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - ('1' - 1));

		}
		for (int i = 0;i <= lenb;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - ('1' - 1));
		}
		if (lena == lenb)
		{
			for (int i = lenb;i >= 0;i--)
			{
						c[i + 1] += b.charAt(i) + a.charAt(i);
						if (c[i + 1] >= 10)
						{
							c[i]++;
							c[i + 1] -= 10;
						}
			}
			if (c[0] == 1)
			{
				System.out.print('1');
			for (int i = 1;i <= lena + 1;i++)
			{
				System.out.print(c[i]);
			}
			}
			else
			{
				for (int i = 1;i <= lena + 1;i++)
				{
					if (c[i] != 0)
					{
						j = i;
						break;
					}
				}
				if (j == 299)
				{
					System.out.print(0);
					return 0;
				}
				for (int i = j;i <= lena + 1;i++)
				{
					System.out.print(c[i]);
				}
			}
		}
		if (lena < lenb)
		{
			for (int i = lenb;i >= lenb - lena;i--)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i - lenb + lena));
			}
			for (int i = 0;i < lenb - lena;i++)
			{
				a = a.substring(0, i);
			}
			for (int i = lenb;i >= 0;i--)
			{
				c[i + 1] += b.charAt(i) + a.charAt(i);
				if (c[i + 1] >= 10)
				{
					c[i]++;
					c[i + 1] -= 10;
				}
			}
			if (c[0] == 1)
			{
				System.out.print('1');
			for (int i = 1;i <= lenb + 1;i++)
			{
				System.out.print(c[i]);
			}
			}
			else
			{
				for (int i = 1;i <= lenb + 1;i++)
				{
					if (c[i] != 0)
					{
						j = i;
						break;
					}
				}
				if (j == 299)
				{
					System.out.print(0);
					return 0;
				}
				for (int i = j;i <= lenb + 1;i++)
				{
					System.out.print(c[i]);
				}
			}
			return 0;
		}
		if (lena > lenb)
		{
			for (int i = lena;i >= lena - lenb;i--)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i - lena + lenb));
			}
			for (int i = 0;i < lena - lenb;i++)
			{
				b = b.substring(0, i);
			}
			for (int i = lena;i >= 0;i--)
			{
				c[i + 1] += b.charAt(i) + a.charAt(i);
				if (c[i + 1] >= 10)
				{
					c[i]++;
					c[i + 1] -= 10;
				}
			}
			if (c[0] == 1)
			{
				System.out.print('1');
			for (int i = 1;i <= lena + 1;i++)
			{
				System.out.print(c[i]);
			}
			}
			else
			{
				for (int i = 1;i <= lena + 1;i++)
				{
					if (c[i] != 0)
					{
						j = i;
						break;
					}
				}
				if (j == 299)
				{
					System.out.print(0);
					return 0;
				}
				for (int i = j;i <= lena + 1;i++)
				{
					System.out.print(c[i]);
				}
			}
		}
		return 0;
	}

}

