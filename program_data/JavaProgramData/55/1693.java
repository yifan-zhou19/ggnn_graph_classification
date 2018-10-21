package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int la;
		int lb;
		int decimal;
		int number = 0;
		int t;
		String str1 = new String(new char[1000]);
		final String str2 = "";
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		cin.getline(str1,1000,' ');
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		la = str1.length();
		for (i = 0;i < la;i++)
		{

		  if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9')
		  {
				 decimal = str1.charAt(i) - '0';
		  }
		  else if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
		  {
				  decimal = str1.charAt(i) - 'A' + 10;
		  }
		  else
		  {
			  decimal = str1.charAt(i) - 'a' + 10;
		  }
		  number = number * a + decimal;
		}
		i = 0;
		do
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, i, number % b);
			if (str2.charAt(i) > 9)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) - 10 + 'A');
			}
			else
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + '0');
			}
			number = number / b;
			i++;
		} while (number != 0);
		t = i;
		for (j = t - 1;j >= 0;j--)
		{
			System.out.print(str2.charAt(j));
		}

		return 0;
	}
}

