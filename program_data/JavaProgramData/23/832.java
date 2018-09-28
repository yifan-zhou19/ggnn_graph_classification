package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		char temp;

		s = new Scanner(System.in).nextLine();

		for (int i = 0, j = s.length() - 1; i < j; i++, j--)
		{
			temp = s.charAt(i);
			s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(j));
			s = tangible.StringFunctions.changeCharacter(s, j, temp);
		}

		int low = 0;
		int high = 0;
		for (int i = 0; i <= s.length(); i++)
		{
			if (s.charAt(i) == ' ' || s.charAt(i) == '\0')
			{
				low = high;
				high = i - 1;

				for (; low < high; low++, high--)
				{
					temp = s.charAt(low);
					s = tangible.StringFunctions.changeCharacter(s, low, s.charAt(high));
					s = tangible.StringFunctions.changeCharacter(s, high, temp);
				}
				high = i + 1;
			}
		}
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}

}

