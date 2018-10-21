package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[90000]);
		String b = new String(new char[90000]);
		int n;
		int i;
		int j;
		int m;
		int x;
		int y;
		int s;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = 0;
		m = 0;
		j = a.length();
		for (i = 0;i < j;i++)
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
				m = a.charAt(i) - '0';
			}
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				m = a.charAt(i) - 'A' + 10;
			}
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				m = a.charAt(i) - 'a' + 10;
			}
			n = n * x + m;
		}
		j = 0;
		s = 0;
		if (n == 0)
		{
			System.out.print(0);
		}
		while (n > 0)
		{
			j = n % y;
			if (j >= 10)
			{
				b = tangible.StringFunctions.changeCharacter(b, s, j - 10 + 'A');
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, s, j + '0');
			}
			s++;
			n = n / y;
		}
		for (i = s - 1;i >= 0;i--)
		{
		System.out.print(b.charAt(i));
		}
		return 0;
	}

}

