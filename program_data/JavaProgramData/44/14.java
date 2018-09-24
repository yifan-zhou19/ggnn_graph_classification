package <missing>;

public class GlobalMembers
{
	public static String b = new String(new char[100]);
	public static void Main()
	{
		void rev(char a[]);
		String a = new String(new char[100]);
		String c = new String(new char[100]);
		int i;
		int k;
		int j;
		int z;
		for (z = 0;z < 6;z++)
		{
			j = 0;
			a = new Scanner(System.in).nextLine();
			k = a.length();
			if (a.charAt(0) == '-' && a.charAt(k - 1) == '0')
			{
			for (i = k - 1;i > 0;i--)
			{
				if (a.charAt(i) == '0')
				{
					j = j + 1;
				}
				else
				{
					break;
				}
			}
			for (i = 0;i < k - j - 1;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i + 1));
			}
			c = tangible.StringFunctions.changeCharacter(c, k - j - 1, '\0');
			rev(c);
			System.out.print("-");
			System.out.println(b);
			}

		else if (a.charAt(0) == '-' && a.charAt(k - 1) != 0)
		{
			for (i = 0;i < k - 1;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i + 1));
			}
			c = tangible.StringFunctions.changeCharacter(c, k - 1, '\0');
			rev(c);
			System.out.print("-");
			System.out.println(b);
		}
		else if (a.charAt(k - 1) == '0' && a.charAt(0) != '-')
		{
			for (i = k - 1;i > 0;i--)
			{
				if (a.charAt(i) == '0')
				{
					j = j + 1;
				}
				else
				{
					break;
				}
			}
			for (i = 0;i < k - j;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i));
			}
			c = tangible.StringFunctions.changeCharacter(c, k - j, '\0');
			rev(c);
			System.out.println(b);
		}

		else
		{
			rev(a);
			System.out.println(b);
		}
		}
	}
	public static void rev(String a)
	{
		int i;
		int k;
		k = a.length();
		for (i = 0;i < k;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, k - 1 - i, a[i]);
		}
		b = tangible.StringFunctions.changeCharacter(b, k, '\0');
	}
}

