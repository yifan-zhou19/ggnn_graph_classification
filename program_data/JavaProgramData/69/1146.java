package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[251]);
		String s2 = new String(new char[251]);
		String s3 = new String(new char[252]);
		char c;
		int i;
		int l1;
		int l2;
		int l3;
		int s;
		int temp = 0;
		s1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		s2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l1 = s1.length();
		l2 = s2.length();
		if (l1 < l2)
		{
			for (i = 0;i <= l2;i++)
			{
				c = s1.charAt(i);
				s1 = tangible.StringFunctions.changeCharacter(s1, i, s2.charAt(i));
				s2 = tangible.StringFunctions.changeCharacter(s2, i, c);
			}
			l3 = l1;
			l1 = l2;
			l2 = l3;
		}
		for (i = l2 - 1;i >= 0;i--)
		{
			s2 = tangible.StringFunctions.changeCharacter(s2, i + l1 - l2, s2.charAt(i));
		}
		for (i = 0;i < l1 - l2;i++)
		{
			s2 = tangible.StringFunctions.changeCharacter(s2, i, '0');
		}
		for (i = l1 - 1;i >= 0;i--)
		{
			s = s1.charAt(i) - '0' + s2.charAt(i) - '0' + temp;
			if (s > 9)
			{
				temp = 1;
				s3 = tangible.StringFunctions.changeCharacter(s3, i, s - 10 + '0');
			}
			else
			{
				temp = 0;
				s3 = tangible.StringFunctions.changeCharacter(s3, i, s + '0');
			}
		}
		s3 = tangible.StringFunctions.changeCharacter(s3, l1, '\0');

		if (temp != 0)
		{
			l3 = s3.length();
			for (i = l3;i >= 0;i--)
			{
				s3 = tangible.StringFunctions.changeCharacter(s3, i + 1, s3.charAt(i));
			}
			s3 = tangible.StringFunctions.changeCharacter(s3, 0, '1');
		}

		int counter = 0;
		l3 = s3.length();
		for (i = 0;i < l3;i++)
		{
			if (counter == 0)
			{
				if (s3.charAt(i) != '0')
				{
					System.out.print(s3.charAt(i));
					counter++;
				}
			}
			else
			{
				System.out.print(s3.charAt(i));
			}
		}
		if (counter == 0)
		{
			System.out.print("0");
		}
		System.out.print("\n");
		return 0;
	}
}

