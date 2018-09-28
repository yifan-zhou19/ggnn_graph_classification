package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c = 0;
	String num1 = new String(new char[200]);
	String num2 = new String(new char[200]);
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	num1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < num1.length();i++)
	{
		if (num1.charAt(i) >= 'A' && num1.charAt(i) <= 'Z')
		{
			num1.charAt(i) += 32;
		}
	}
	for (int i = 0;i < num1.length();i++)
	{
		if (num1.charAt(i) >= 'a' && num1.charAt(i) <= 'z')
		{
			c += ((int)num1.charAt(i) - 87) * Math.pow((double)a,(double)(num1.length() - 1 - i));
		}
		else if (num1.charAt(i) >= '1' && num1.charAt(i) <= '9')
		{
			c += ((int)num1.charAt(i) - 48) * Math.pow((double)a,(double)(num1.length() - 1 - i));
		}
	}
	if (c == 0)
	{
		System.out.print(c);
		System.out.print("\n");
	}
	else
	{
		int j = 0;
	for (;;)
	{
		if (c == 0)
		{
			break;
		}
		if (c % b < 10)
		{
			num2 = tangible.StringFunctions.changeCharacter(num2, j, (char)(c % b + 48));
		}
		else
		{
			num2 = tangible.StringFunctions.changeCharacter(num2, j, (char)(c % b + 55));
		}
		c = c / b;
		j++;
	}
	for (int i = j - 1;i >= 0;i--)
	{
		System.out.print(num2.charAt(i));
	}
	System.out.print("\n");
	}
	return 0;
	}

}

