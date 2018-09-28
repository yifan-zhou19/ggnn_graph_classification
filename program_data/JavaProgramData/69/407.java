package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[252]);
		String str2 = new String(new char[252]);
		String str3 = new String(new char[253]);
		char c;
		int s;
		int i;
		int a;
		int b;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		a = str1.length();
		b = str2.length();
		for (i = 0;i <= a / 2 - 1;i++)
		{
		   c = str1.charAt(i);
		   str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(a - 1 - i));
		   str1 = tangible.StringFunctions.changeCharacter(str1, a - 1 - i, c);
		}
		for (i = 0;i <= b / 2 - 1;i++)
		{
		   c = str2.charAt(i);
		   str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(b - 1 - i));
		   str2 = tangible.StringFunctions.changeCharacter(str2, b - 1 - i, c);
		}
		if (a > b)
		{
		   for (i = b;i < a;i++)
		   {
		   str2 = tangible.StringFunctions.changeCharacter(str2, i, '0');
		   }
		   str2 = tangible.StringFunctions.changeCharacter(str2, i, '\0');
		}
		if (a < b)
		{
		   for (i = a;i < b;i++)
		   {
		   str1 = tangible.StringFunctions.changeCharacter(str1, i, '0');
		   }
		   str1 = tangible.StringFunctions.changeCharacter(str1, i, '\0');
		}
		for (i = 0;str1.charAt(i) != '\0';i++)
		{
		   s = str1.charAt(i) - '0' + str2.charAt(i) - '0';
		   if (s >= 10)
		   {
			  str3 = tangible.StringFunctions.changeCharacter(str3, i, s - 10 + '0');
			  str2 = tangible.StringFunctions.changeCharacter(str2, i + 1, str2.charAt(i + 1) + 1);
		   }
		   else
		   {
			  str3 = tangible.StringFunctions.changeCharacter(str3, i, s + '0');
		   }
		}
		if (str2.charAt(i) == 1)
		{
		   str3 = tangible.StringFunctions.changeCharacter(str3, i, '1');
		   str3 = tangible.StringFunctions.changeCharacter(str3, i + 1, '\0');
		}
		else
		{
			str3 = tangible.StringFunctions.changeCharacter(str3, i, '\0');
		}
		for (i = str3.length() - 1;str3.charAt(i) == '0' && i > 0;i--)
		{
		   str3 = tangible.StringFunctions.changeCharacter(str3, i, '\0');
		}
		for (i = str3.length() - 1;i >= 0;i--)
		{
		   System.out.printf("%c",str3.charAt(i));
		}
	}

}

