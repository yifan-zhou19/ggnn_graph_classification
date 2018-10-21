package <missing>;

public class GlobalMembers
{
	public static int zh(char a)
	{
		int b;
		if ((a >= 'A') && (a <= 'Z'))
		{
			b = (int)(a) - 55;
			return b;
		}
		else
		{
			b = (int)(a) - 48;
			return b;
		}
	}
	public static char fzh(int a)
	{
		char b;
		if (a > 9)
		{
			b = (char)(a - 10 + 48);
			return b;
		}
		else
		{
			b = (char)(a + 48);
			return b;
		}
	}


	public static int Main()
	{
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
		String a1 = new String(new char[10000]);
		String b1 = new String(new char[10000]);
		String c = new String(new char[10000]);
		int n;
		int i;
		int j;
		int k;
		int sum = 0;
		int l1;
		int l2;
		int jinwei;
		for (i = 0;i < 9999;i++)
		{
			a1 = tangible.StringFunctions.changeCharacter(a1, i, '0');
			b1 = tangible.StringFunctions.changeCharacter(b1, i, '0');
		}
		a1 = tangible.StringFunctions.changeCharacter(a1, 9999, '\0');
		b1 = tangible.StringFunctions.changeCharacter(b1, 9999, '\0');



		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		l1 = a.length();
		l2 = b.length();

		for (i = 0;i < l1;i++)
		{
			a1 = tangible.StringFunctions.changeCharacter(a1, l1 - 1 - i, a.charAt(i));
		}
		for (i = 0;i < l2;i++)
		{
			b1 = tangible.StringFunctions.changeCharacter(b1, l2 - 1 - i, b.charAt(i));
		}


		for (i = 0;i < 9999;i++)
		{

			if (i == 0)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, fzh(zh(a1.charAt(i)) + zh(b1.charAt(i))));
				if ((zh(a1.charAt(i)) + zh(b1.charAt(i))) > 9)
				{
					jinwei = 1;
				}
				else
				{
					jinwei = 0;
				}
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i, fzh((zh(a1.charAt(i)) + zh(b1.charAt(i))) + jinwei));
				if ((zh(a1.charAt(i)) + zh(b1.charAt(i)) + jinwei) > 9)
				{
					jinwei = 1;
				}
				else
				{
					jinwei = 0;
				}
			}
		}

		for (i = 9998;i >= 0;i--)
		{
			if (sum == 0)
			{
				if (c.charAt(i) != '0')
				{
					System.out.printf("%c",c.charAt(i));
					sum++;

				}
			}
			else
			{
				System.out.printf("%c",c.charAt(i));
			}
		}
		if (sum == 0)
		{
			System.out.print("0");
		}
		return 0;
	}



}

