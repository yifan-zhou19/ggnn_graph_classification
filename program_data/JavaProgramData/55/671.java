package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string1 = new String(new char[1000]);
		int b;
		int i;
		int c = 0;
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		string1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = string1.length();
		for (i = 0;i < b;i++)
		{
			if (string1.charAt(i) >= '0' && string1.charAt(i) <= '9')
			{
				c += (string1.charAt(i) - '0') * Math.pow(a,b - i - 1);
			}
			if (string1.charAt(i) >= 'a' && string1.charAt(i) <= 'z')
			{
				c += (string1.charAt(i) - 'a' + 10) * Math.pow(a,b - i - 1);
			}
			if (string1.charAt(i) >= 'A' && string1.charAt(i) <= 'Z')
			{
				c += (string1.charAt(i) - 'A' + 10) * Math.pow(a,b - i - 1);
			}
			//cout << c<<endl;
		}
		//cout << c<<endl;
		int index = 0;
		String string2 = new String(new char[1000]);
		int d;
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int e;
		if (c == 0)
		{
			System.out.print('0');
			System.out.print("\n");
		}
		while (c != 0)
		{
			e = c % d;
			c = c / d;
			if (e >= 10)
			{
				string2 = tangible.StringFunctions.changeCharacter(string2, index, 'A' + e - 10);
			}
			else
			{
				string2 = tangible.StringFunctions.changeCharacter(string2, index, '0' + e);
			}
			index++;
		}
		string2 = tangible.StringFunctions.changeCharacter(string2, index, '\0');
		for (i = index - 1;i >= 0;i--)
		{
			System.out.print(string2.charAt(i));
		}
		System.out.print("\n");

		//cout<<string2<<endl;
		//while(1);
		return 0;
	}
}

