package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch1 = new String(new char[300]);
		String ch2 = new String(new char[300]);
		String ch3 = new String(new char[300]);
		int l1 = 0;
		int l2 = 0;
		int min_l = 0;
		int max_l = 0;
		int jinwei = 0;
		int number = 0;

		ch1 = tangible.StringFunctions.changeCharacter(ch1, 0, '0');
		ch2 = tangible.StringFunctions.changeCharacter(ch2, 0, '0');
		int i = 0;
		int k = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ch1 = tangible.StringFunctions.changeCharacter(ch1, 1, tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			ch2 = tangible.StringFunctions.changeCharacter(ch2, 1, tempVar2);
		}
		l1 = ch1.length();
		l2 = ch2.length();

		min_l = l1 > l2 != 0?l2:l1;
		max_l = l1 > l2 != 0?l1:l2;
		if (l1 > l2)
		{
			ch3 = ch1;
		}
		else
		{
			ch3 = ch2;
		}

		for (i = 1;i <= min_l != 0 || jinwei == 1;i++)
		{
			if (jinwei == 0)
			{
				if (i > min_l)
				{
					break;
				}
				if ((number = ch1.charAt(l1 - i) + ch2.charAt(l2 - i) - '0'-'0') < 10)
				{
					ch3 = tangible.StringFunctions.changeCharacter(ch3, max_l - i, number + '0');
					jinwei = 0;
				}
				else
				{
					ch3 = tangible.StringFunctions.changeCharacter(ch3, max_l - i, number - 10 + '0');
					jinwei = 1;
				}
			}
			else
			{
				if (i > min_l)
				{
					if ((number = ch3.charAt(max_l - i) - '0' + 1) < 10)
					{
						ch3 = tangible.StringFunctions.changeCharacter(ch3, max_l - i, number + '0');
						jinwei = 0;
					}
					else
					{
						ch3 = tangible.StringFunctions.changeCharacter(ch3, max_l - i, number - 10 + '0');
						jinwei = 1;
					}
					continue;
				}
				if ((number = ch1.charAt(l1 - i) + ch2.charAt(l2 - i) - '0'-'0' + 1) < 10)
				{
					ch3 = tangible.StringFunctions.changeCharacter(ch3, max_l - i, number + '0');
					jinwei = 0;
				}
				else
				{
					ch3 = tangible.StringFunctions.changeCharacter(ch3, max_l - i, number - 10 + '0');
					jinwei = 1;
				}
			}
		}

		for (i = 0;i <= max_l;i++)
		{
			if (ch3.charAt(i) != '0')
			{
				break;
			}
		}

		if (!(i >= max_l))
		{
			for (k = i;k <= max_l;k++)
			{
				if (ch3.charAt(k) != '\0')
				{
					System.out.printf("%c",ch3.charAt(k));
				}
			}
		}
		else
		{
			System.out.print("0");
		}

		return 0;
	}
}

