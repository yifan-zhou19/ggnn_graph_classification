package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a1 = new String(new char[251]);
		String b1 = new String(new char[251]);
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		String str = new String(new char[252]);
		int i;
		int prime = 0;
		a1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,'\0',(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,'\0',(Character.SIZE / Byte.SIZE));
		int l;
		int l1 = a1.length();
		int l2 = b1.length();
		if (l1 == 1 && a1.charAt(0) == '0' && l2 == 1 && b1.charAt(0) == '0')
		{
			System.out.print(0);
		}
		for (i = 0;i < l1;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, l1 - i - 1, a1.charAt(i));
		}
		for (i = 0;i < l2;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, l2 - i - 1, b1.charAt(i));
		}
		for (i = a.length() - 1;;i--)
		{
			if (a.charAt(i) != '0')
			{
				break;
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '\0');
				l1--;
			}
		}
		for (i = b.length() - 1;;i--)
		{
			if (b.charAt(i) != '0')
			{
				break;
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '\0');
				l2--;
			}
		}
		if (l1 > l2)
		{
			l = l1;
		}
			else
			{
				l = l2;
			}
		for (i = l1;i < l;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '0');
		}
		for (i = l2;i < l;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, '0');
		}
		for (i = 0;i < l;i++)
		{
			int t = (int)(a.charAt(i) - '0') + (int)(b.charAt(i) - '0') + prime;
			if (t > 9)
			{
				t = t - 10;
				prime = 1;
			}
			else
			{
				prime = 0;
			}
			str = tangible.StringFunctions.changeCharacter(str, i, (char)(t + '0'));
		}
		if (prime != 0)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, '1');
			l++;
		}
		for (i = l - 1;i >= 0;i--)
		{
			System.out.print(str.charAt(i));
		}
		return 0;
	}






}

