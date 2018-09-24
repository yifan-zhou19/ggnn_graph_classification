package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[10000]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int l0;
		int l1;
		int l2;
		int i;
		int j;
		int k;
		int counter;

		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();

		l0 = s.length();
		l1 = a.length();
		l2 = b.length();

		i = 0;
		if (s.charAt(i) == a.charAt(0))
		{
			counter = 0;
			for (j = i + 1;j < i + l1;j++)
			{
				if (s.charAt(j) != a.charAt(j - i))
				{
					counter++;
				}
			}
			if (s.charAt(i + l1) != ' ' && s.charAt(i + l1) != '\0')
			{
				counter++;
			}
			if (counter == 0)
			{
				if (l1 >= l2)
				{
					for (j = i;j < i + l2;j++)
					{
						s = tangible.StringFunctions.changeCharacter(s, j, b.charAt(j - i));
					}
					for (j = i + l1;j <= l0;j++)
					{
						s = tangible.StringFunctions.changeCharacter(s, j - (l1 - l2), s.charAt(j));
					}
				}
				if (l2 > l1)
				{
					for (j = l0;j >= i + l1;j--)
					{
						s = tangible.StringFunctions.changeCharacter(s, j - (l1 - l2), s.charAt(j));
					}
					for (j = i;j < i + l2;j++)
					{
						s = tangible.StringFunctions.changeCharacter(s, j, b.charAt(j - i));
					}
				}
			}
		}

			for (i = 1;i < l0;i++)
			{
				if (s.charAt(i) == a.charAt(0))
				{
					counter = 0;
					for (j = i + 1;j < i + l1;j++)
					{
						if (s.charAt(j) != a.charAt(j - i))
						{
							counter++;
						}
					}
					if (s.charAt(i + l1) != ' ' && s.charAt(i + l1) != '\0')
					{
						counter++;
					}
					if (s.charAt(i - 1) != ' ')
					{
						counter++;
					}
					if (counter == 0)
					{
						if (l1 >= l2)
						{
							for (j = i;j < i + l2;j++)
							{
								s = tangible.StringFunctions.changeCharacter(s, j, b.charAt(j - i));
							}
							for (j = i + l1;j <= l0;j++)
							{
								s = tangible.StringFunctions.changeCharacter(s, j - (l1 - l2), s.charAt(j));
							}
						}
						if (l2 > l1)
						{
							for (j = l0;j >= i + l1;j--)
							{
								s = tangible.StringFunctions.changeCharacter(s, j - (l1 - l2), s.charAt(j));
							}
							for (j = i;j < i + l2;j++)
							{
								s = tangible.StringFunctions.changeCharacter(s, j, b.charAt(j - i));
							}
						}
						l0 += l2 - l1;
					}
				}
			}
			System.out.print(s);
			System.out.print("\n");
	}
}

