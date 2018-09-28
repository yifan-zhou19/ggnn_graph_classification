package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		String ch = new String(new char[100]);
		int i;
		int l;
		int j;
		int k;
		int jin1;
		int jin2;
		int r;
		int sh;
		int sum;
		jin1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		jin2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = 0;
		l = 0;
		for (i = 0; i < 100; i++)
		{
			if (str.charAt(i) == '\0')
			{
				break;
			}
			else
			{
				l++;
			}
		}
		for (i = 0; i < l; i++)
		{
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				sum = sum * jin1 + (str.charAt(i) - 'a' + 10);
			}
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
			{
				sum = sum * jin1 + (str.charAt(i) - 'A' + 10);
			}
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				sum = sum * jin1 + (str.charAt(i) - '0');
			}
		}
		sh = sum;
		k = 0;
		if (sum == 0)
		{
			System.out.print('0');
			System.out.print("\n");
		}
		for (i = 0; sh != 0; i++)
		{
			r = sh % jin2;
			sh = sh / jin2;
			if (r < 10)
			{
				ch = tangible.StringFunctions.changeCharacter(ch, i, r + '0');
			}
			else
			{
				ch = tangible.StringFunctions.changeCharacter(ch, i, r + 'A' - 10);
			}
			k++;
		}
		for (j = k - 1; j >= 0; j--)
		{
			System.out.print(ch.charAt(j));
		}
		System.out.print("\n");
			 return 0;
	}
}

