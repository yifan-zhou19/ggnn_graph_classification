package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[100]); //??????num?????,????c
		char c;
		int s = 0; //???????s,
		int a;
		int i;
		int b = 0;
		cin.get(c);
		while (c != '\n')
		{
			num = tangible.StringFunctions.changeCharacter(num, s, c);
			s++;
			cin.get(c);
		}
		if (s < 4) //???????????3
		{
			if (s == 3)
			{
				System.out.print((num.charAt(0) * 100 + (num.charAt(1) - '0') * 10 + num.charAt(2) - '0') / 13);
				System.out.print('\n');
				System.out.print((num.charAt(0) * 100 + (num.charAt(1) - '0') * 10 + num.charAt(2) - '0') % 13);
			}
			else
			{
				if (s == 2)
				{
					System.out.print(((num.charAt(0) - '0') * 10 + num.charAt(1) - '0') / 13);
					System.out.print('\n');
					System.out.print(((num.charAt(0) - '0') * 10 + num.charAt(1) - '0') % 13);
				}
				else
				{
					System.out.print((num.charAt(0) - '0') / 13);
					System.out.print('\n');
					System.out.print((num.charAt(0) - '0') % 13);
				}
			}
		}
		else
		{
			a = num.charAt(0) - '0';
			for (i = 1;i < s - 2;i++) //???
			{
							if (b != 0 || (a * 10 + num.charAt(i) - '0') / 13 != 0) //??????0,???
							{
								b++;
								System.out.print((a * 10 + num.charAt(i) - '0') / 13);
							}
				a = (a * 10 + num.charAt(i) - '0') % 13;

			}
			if ((a * 100 + (num.charAt(s - 2) - '0') * 10 + num.charAt(s - 1) - '0') / 13 < 10)
			{
				System.out.print(0);
			}
			System.out.print((a * 100 + (num.charAt(s - 2) - '0') * 10 + num.charAt(s - 1) - '0') / 13);
			System.out.print("\n");
			System.out.print((a * 100 + (num.charAt(s - 2) - '0') * 10 + num.charAt(s - 1) - '0') % 13);
		}
		return 0;
	}
}

