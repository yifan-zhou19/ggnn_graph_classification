package <missing>;

public class GlobalMembers
{
	//????
	public static int ji(int a, int b)
	{
		int i = 0;
		int ji = 1;
		for (i = 0;i < b;i++)
		{
			ji = ji * a;
		}
		return ji;
	}
	public static int Main()
	{
		int jinzhi1 = 0; //????1
		int jinzhi2 = 0; //????2
		int p = 0; //????
		int i = 0; //???
		int j = 0; //?????
		String n = new String(new char[100]); //?????????
		String m = new String(new char[100]); //?????????
		int s = 0; //?????????
		jinzhi1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		jinzhi2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = n.length();
		//???????????
		while (i < p)
		{
			(int) n.charAt(i);
			if (n.charAt(i) > 96) //??????????,???s?????
			{
				s = s + (n.charAt(i) - 87) * ji(jinzhi1, (p - i - 1));
			}
			else
			{
				if (n.charAt(i) > 64)
				{
					s = s + (n.charAt(i) - 55) * ji(jinzhi1, (p - i - 1));
				}
				else
				{
					s = s + (n.charAt(i) - '0') * ji(jinzhi1, (p - i - 1));
				}
			}
			i = i + 1;
		}


		i = 0; //?????
		if (s == 0)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else
		{
		while (s != 0) //????
		{
			m = tangible.StringFunctions.changeCharacter(m, i, s % jinzhi2);
			s = (s - m.charAt(i)) / jinzhi2;
			i += 1;
		}
		for (j = 0;j < i;j++) //?????????????
		{
			if (m.charAt(i - 1 - j) > 9)
			{
				m = tangible.StringFunctions.changeCharacter(m, i - 1 - j, m.charAt(i - 1 - j) + 55);
				System.out.print(m.charAt(i - 1 - j));
			}
			else
			{
				m = tangible.StringFunctions.changeCharacter(m, i - 1 - j, m.charAt(i - 1 - j) + 48);
				System.out.print(m.charAt(i - 1 - j));
			}
		}
		}
		return 0;
	}
}

