package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int a;
		   int b;
		   int num = 0;
		String c1 = new String(new char[100]);
		String c2 = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (c1.charAt(0) == '0')
		{
			System.out.print(0);
		}
		for (int i = 0 ; i < c1.length() ; i++)
		{
			if (c1.charAt(i) >= 'a' && c1.charAt(i) <= 'z')
			{
				c1 = tangible.StringFunctions.changeCharacter(c1, i, c1.charAt(i) - 'a' + 10);
			}
			else if (c1.charAt(i) >= 'A' && c1.charAt(i) <= 'Z')
			{
				c1 = tangible.StringFunctions.changeCharacter(c1, i, c1.charAt(i) - 'A' + 10);
			}
			else if (c1.charAt(i) >= '0' && c1.charAt(i) <= '9')
			{
				c1.charAt(i) -= '0';
			}
			num = a * num + c1.charAt(i);
		}
	//	cout<<num<<endl;
		int i = 0;
		while (num > 0)
		{
			c2 = tangible.StringFunctions.changeCharacter(c2, i, num % b);
			num = num / b;
			if (c2.charAt(i) <= 9)
			{
				c2.charAt(i) += '0';
			}
			else if (c2.charAt(i) >= 10)
			{
				c2.charAt(i) += 'A' - 10;
			}
			i++;
		}
		c2 = tangible.StringFunctions.changeCharacter(c2, i, '\0');
		for (int i = c2.length() - 1 ; i >= 0 ; i--)
		{
			System.out.print(c2.charAt(i));
		}
	}
}

