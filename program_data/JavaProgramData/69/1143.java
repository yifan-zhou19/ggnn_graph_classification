package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[252]);
		String b = new String(new char[252]);

		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int la = a.length();
		int lb = b.length();

		int flag = 0;

		if (la < lb)
		{
			int i = 0;
			int x;
			String temp = new String(new char[252]);
			for (i = 0 ;a.charAt(i) != '\0'; i++)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, i, a.charAt(i));
			}
			temp = tangible.StringFunctions.changeCharacter(temp, i, '\0');

			for (i = 0 ;b.charAt(i) != '\0'; i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, b.charAt(i));
			}
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
			for (i = 0 ;temp.charAt(i) != '\0'; i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, temp.charAt(i));
			}
			b = tangible.StringFunctions.changeCharacter(b, i, '\0');
			x = la;
			la = lb;
			lb = x;
		} //la>=lb

		int j;
		int k = la - 1;
		for (j = lb - 1; j >= 0 ;j--)
		{
			a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k) + b.charAt(j) - 48);
			if (a.charAt(k) > '9' && k != 0)
			{
				a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k) - 10);
				a.charAt(k - 1)++;
			}
			if (a.charAt(k) > '9' && k == 0)
			{
				a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k) - 10);
				flag = 1;
			}
			k--;
		}
		for (int i = la - 1;i >= 0;i--)
		{
			if (a.charAt(i) > '9' && i != 0)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 10);
				a.charAt(i - 1)++;
			}
			if (a.charAt(i) > '9' && i == 0)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 10);
				flag = 1;
			}
		}
		int i = 0;
		if (flag == 1)
		{
			System.out.print(1);
		}
		if (flag == 0)
		{
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				if (a.charAt(i) != '0')
				{
					break;
				}
			}
		}

		System.out.print(a.Substring(i));

		if (Integer.parseInt(a) == 0 && Integer.parseInt(b) == 0)
		{
			System.out.print(0);
		}



		return 0;
	}


}

