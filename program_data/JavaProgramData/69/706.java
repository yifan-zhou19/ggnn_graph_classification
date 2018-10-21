package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		String c = new String(new char[251]);
		int p = 0;
		int n;
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = c.length() - 1; i >= 0; i--) //??????????????a[i]
		{
			a = tangible.StringFunctions.changeCharacter(a, c.length() - 1 - i, c.charAt(i));
		}
		for (int i = c.length(); i < 251; i++) //???????0
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '0');
		}
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = c.length() - 1; i >= 0; i--) //??????????????b[i]
		{
			b = tangible.StringFunctions.changeCharacter(b, c.length() - 1 - i, c.charAt(i));
		}
		for (int i = c.length(); i < 251; i++) //???????0
		{
			b = tangible.StringFunctions.changeCharacter(b, i, '0');
		}
		for (int i = 0; i < 251; i++) //?a[i],b[i]????????
		{
			c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) + b.charAt(i) + p - 48);
			if (c.charAt(i) >= 58) //???
			{
				c.charAt(i) -= 10;
				p = 1;
			}
			else
			{
				p = 0; //???
			}
		}
		for (n = 250; n >= 0; n--) //?a[i],b[i]??c[i]??????????0??????
		{
			if (c.charAt(n) != '0')
			{
				break;
			}
		}
		if (n == -1)
		{
			System.out.print(0);
		}
		for (; n >= 0; n--)
		{
			System.out.print(c.charAt(n));
		}
		System.out.print("\n");
		return 0;
	}
}

