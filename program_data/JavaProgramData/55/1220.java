package <missing>;

public class GlobalMembers
{
	public static int ab(char s)
	{
		int r = 100;

		if (s >= '0' && s <= '9')
		{
			r = s - 48;
		}
		else if (s >= 'a' && s <= 'z')
		{
			r = s - 87;
		}
		else if (s >= 'A' && s <= 'Z')
		{
			r = s - 55;
		}

		return r;
	}

	public static char ba(int k)
	{

		char r = '!';

		if (k >= 0 && k <= 9)
		{
			r = k + 48;
		}
		else if (k >= 10 && k <= 35)
		{
			r = k + 55;
		}

		return r;
	}

	public static int Main()
	{

		int a = 0;

		int b = 0;

		String str = new String(new char[3000]);

		String out = new String(new char[3000]);

		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int n = 0;
		int num = 0;
		int k = 1;

		while (ab(str.charAt(n)) != 100)
		{
			n++;
		}

		for (int i = n - 1;i >= 0;i--)
		{
			num += ab(str.charAt(i)) * k;
			k *= a;
		}

		int i = 0;


		while (num != 0)
		{
			out = tangible.StringFunctions.changeCharacter(out, i, ba(num % b));
			num /= b;
			i++;
		}

		if (i == 0)
		{
			System.out.print(0);
		}

		for (int j = i - 1;j >= 0;j--)
		{
			System.out.print(out.charAt(j));
		}


		return 0;

	}
}

