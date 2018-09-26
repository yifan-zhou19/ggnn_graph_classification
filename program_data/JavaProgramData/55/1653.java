package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //?????????????????
		int b;
		int l;
		int n = 0;
		String c = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = c.length();
		for (int i = 0;i <= l - 1;i++) //????
		{
			if (c.charAt(i) <= 'z' && c.charAt(i) >= 'a')
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 'a'+'A');
			}
		}
		for (int i = 0;i < l;i++) //??????
		{
			int m;
			if (c.charAt(i) <= 'Z' && c.charAt(i) >= 'A')
			{
				m = 10 + c.charAt(i) - 'A';
			}
			else
			{
				m = c.charAt(i) - '0';
			}
			n += m * Math.pow((double)a,l - i - 1);
		}
		for (int i = 0;;i++) //???????
		{
			int m;
			m = n % b;
			n = (n - m) / b;
			if (m < 10)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, m + '0');
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i, m - 10 + 'A');
			}
			if (n == 0)
			{
				l = i + 1;
				break;
			}
		}
		for (int i = l - 1;i >= 0;i--) //??
		{
			System.out.print(c.charAt(i));
		}
		return 0;
	}
}

