package <missing>;

public class GlobalMembers
{
	public static int pow(int a,int b)
	{
		int c;
		if (b == 0)
		{
			c = 1;
		}
		if (b > 0)
		{
			c = pow(a, b - 1) * a;
		}
		return c;
	}

	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		String form = new String(new char[1000]);
		String late = new String(new char[1000]);
		int ten = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		form = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < form.length();i++)
		{
			if (form.charAt(i) >= 97 && form.charAt(i) <= 122)
			{
				form.charAt(i) -= 32;
			}
		}
		for (i = form.length() - 1,j = 0;i >= 0;i--,j++)
		{
			if (form.charAt(i) >= 48 && form.charAt(i) <= 57)
			{
				form.charAt(i) -= 48;
				ten += form.charAt(i) * pow(a, j);
			}
			if (form.charAt(i) >= 65 && form.charAt(i) <= 90)
			{
				form.charAt(i) -= 55;
				ten += form.charAt(i) * pow(a, j);
			}
		}
		if (ten == 0)
		{
			System.out.print(ten);
			System.out.print("\n");
			return 0;
		}
		for (i = 0;i <= 1000;i++)
		{
			if (ten % b < 10)
			{
				late = tangible.StringFunctions.changeCharacter(late, i, ten % b + 48);
			}
			if (ten % b >= 10)
			{
				late = tangible.StringFunctions.changeCharacter(late, i, ten % b + 55);
			}
			if (ten / b == 0 && ten % b == 0)
			{
				late = tangible.StringFunctions.changeCharacter(late, i, '\0');
			}
			ten = ten / b;
		}
		for (i = late.length() - 1;i >= 0;i--)
		{
			if (i != 0)
			{
				System.out.print(late.charAt(i));
			}
			else
			{
				System.out.print(late.charAt(i));
				System.out.print("\n");
			}
		}
		return 0;
	}

}

