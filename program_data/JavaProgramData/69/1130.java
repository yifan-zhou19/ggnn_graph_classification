package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b)
	{
		int z;
		if (a >= b)
		{
		z = a;
		}
		else
		{
		z = b;
		}
		return (z);
	}
	public static int Main()
	{
		int max = new int(int a,int b);
		int i;
		int n;
		int x = 0;
		String str1 = new String(new char[252]);
		String str2 = new String(new char[252]);
		String str3 = new String(new char[252]);
		String str4 = new String(new char[252]);
		String s = new String(new char[252]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str3 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str4 = tempVar2.charAt(0);
		}
		for (i = 0;i < str3.length();i++)
		{
		str1 = tangible.StringFunctions.changeCharacter(str1, str3.length() - i - 1, str3.charAt(i));
		}
		for (i = str3.length();i < 251;i++)
		{
		str1 = tangible.StringFunctions.changeCharacter(str1, i, '0');
		}
		for (i = 0;i < str4.length();i++)
		{
		str2 = tangible.StringFunctions.changeCharacter(str2, str4.length() - i - 1, str4.charAt(i));
		}
		for (i = str4.length();i < 251;i++)
		{
		str2 = tangible.StringFunctions.changeCharacter(str2, i, '0');
		}
		for (i = 0;i < 251;i++)
		{
		s = tangible.StringFunctions.changeCharacter(s, i, '0');
		}
		for (i = 0;i <= max(str3.length(), str4.length());i++)
		{
			s = tangible.StringFunctions.changeCharacter(s, i, str1.charAt(i) + str2.charAt(i) + s.charAt(i) - '0'-'0');
			if (s.charAt(i) > '9')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 10);
				s = tangible.StringFunctions.changeCharacter(s, i + 1, '1');
			}
		}
		for (i = max(str3.length(), str4.length()) + 1;i >= 0;i--)
		{
			if (s.charAt(i) != '0')
			{
				for (i = i;i >= 0;i--)
				{
				System.out.printf("%c",s.charAt(i));
				}
				x++;
			}
		}
		if (x == 0)
		{
		System.out.printf("%d",x);
		}

		return 0;
	}
}

