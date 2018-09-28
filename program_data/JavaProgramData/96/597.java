package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[102]);
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int a;
		int b;
		String x = new String(new char[102]);
		if (num.length() == 1)
		{
			System.out.print('0');
			System.out.print("\n");
			System.out.print(num.charAt(0));
			System.out.print("\n");
		}
		else if (num.length() == 2)
		{
			a = (num.charAt(0) - 48) * 10 + (num.charAt(1) - 48);
			System.out.print(a / 13);
			System.out.print("\n");
			System.out.print(a % 13);
			System.out.print("\n");
		}
		else
		{
		a = (num.charAt(0) - 48) * 10 + (num.charAt(1) - 48);
		b = a % 13;
		if (a >= 13)
		{
			x = tangible.StringFunctions.changeCharacter(x, 0, a / 13 + 48);
			for (i = 1; i <= num.length() - 2; i++)
			{
				a = (num.charAt(i + 1) - 48) + b * 10;
				b = a % 13;
				x = tangible.StringFunctions.changeCharacter(x, i, a / 13 + 48);
			}
			for (i = 0; i <= num.length() - 3; i++)
			{
				System.out.print(x.charAt(i));
			}
			System.out.print(x.charAt(num.length() - 2));
			System.out.print("\n");
			System.out.print(b);
			System.out.print("\n");
		}
		else
		{
			for (i = 2; i <= num.length() - 1; i++)
			{
				a = (num.charAt(i) - 48) + b * 10;
				b = a % 13;
				x = tangible.StringFunctions.changeCharacter(x, i, a / 13 + 48);
			}
			for (i = 2; i <= num.length() - 2; i++)
			{
				System.out.print(x.charAt(i));
			}
			System.out.print(x.charAt(num.length() - 1));
			System.out.print("\n");
			System.out.print(b);
			System.out.print("\n");
		}
		}
		return 0;
	}
}

