package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[1000]);
		String d = new String(new char[1000]);
		String e = new String(new char[1002]);
		String p = new String(new char[1000]);
		String q = new String(new char[1000]);
		int i;
		int length1;
		int length2;
		int length;
		int mark = 0;
		int sign = 0;
		c = new Scanner(System.in).nextLine();
		d = new Scanner(System.in).nextLine();
		length1 = c.length();
		length2 = d.length();
		for (i = 0;i < length1;i++)
		{
			p = tangible.StringFunctions.changeCharacter(p, i, c.charAt(length1 - 1 - i));
		}
		for (i = 0;i < length2;i++)
		{
			q = tangible.StringFunctions.changeCharacter(q, i, d.charAt(length2 - 1 - i));
		}
		for (i = length1;i < 999;i++)
		{
			p = tangible.StringFunctions.changeCharacter(p, i, '0');
		}
		for (i = length2;i < 999;i++)
		{
			q = tangible.StringFunctions.changeCharacter(q, i, '0');
		}
		if (length1 > length2)
		{
			length = length1;
		}
		else
		{
			length = length2;
		}
		for (i = 0;i < length + 1;i++)
		{
			if (i == 0)
			{
				if (p.charAt(i) - '0' + q.charAt(i) - '0' + mark == 0)
				{
					e = tangible.StringFunctions.changeCharacter(e, 0, '0');
					e = tangible.StringFunctions.changeCharacter(e, 1, '\0');
					System.out.print("0");
					break;
				}
			}
			if (i == length)
			{
				if (p.charAt(i) - '0' + q.charAt(i) - '0' + mark == 0)
				{
					e = tangible.StringFunctions.changeCharacter(e, i, '\0');
					break;
				}
			}
			if (p.charAt(i) - '0' + q.charAt(i) - '0' + mark > 9)
			{
				e = tangible.StringFunctions.changeCharacter(e, i, p.charAt(i) + q.charAt(i) + mark - '0' - 10);
				mark = 1;
			}
			else
			{
				e = tangible.StringFunctions.changeCharacter(e, i, p.charAt(i) + q.charAt(i) + mark - '0');
				mark = 0;
			}
		}
		e = tangible.StringFunctions.changeCharacter(e, length + 1, '\0');
		length = e.length();
		for (i = 0;i < length;i++)
		{
			if (e.charAt(length - 1 - i) == '0' && sign == 0)
			{
				continue;
			}
			else
			{
				sign = 1;
				System.out.printf("%c",e.charAt(length - 1 - i));
			}
		}
		System.out.print("\n");
	}
}

