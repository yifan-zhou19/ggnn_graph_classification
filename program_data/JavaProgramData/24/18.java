package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String b = "";
		final String c = "";
		final String d = "";
		int i;
		int j;
		int k;
		int s;
		int l;
		int max = 1;
		int min = 1000;
		a = new Scanner(System.in).nextLine();
		s = a.length();
		b = tangible.StringFunctions.changeCharacter(b, 0, ' ');
		for (i = 1;i <= s;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i - 1));
		}
		b = tangible.StringFunctions.changeCharacter(b, s + 1, ' ');
		l = b.length();
		for (i = 0;i < l;i++)
		{
			if (b.charAt(i) == ' ')
			{
			for (j = i + 1;j < l;j++)
			{
				if (b.charAt(j) == ' ')
				{
					if (j - i - 1 > max)
					{
						max = j - i - 1;
						for (k = 0;k < max;k++)
						{
							c = tangible.StringFunctions.changeCharacter(c, k, b.charAt(k + i + 1));
						}
						if (max > min)
						{
							break;
						}
					}
					if (j - i - 1 < min)
					{
						min = j - i - 1;
						for (k = 0;k < 1000;k++)
						{
							d = tangible.StringFunctions.changeCharacter(d, k, '\0');
						}
						for (k = 0;k < min;k++)
						{
							d = tangible.StringFunctions.changeCharacter(d, k, b.charAt(k + i + 1));
						}
						break;
					}
					if (j - i - 1 <= max != 0 || j - i - 1 >= min)
					{
						break;
					}
				}
			}
			}
		}
		for (i = 0;i < max;i++)
		{
			System.out.printf("%c",c.charAt(i));
		}
		System.out.print("\n");
		for (i = 0;i < min;i++)
		{
			System.out.printf("%c",d.charAt(i));
		}
		return 0;
	}





}

