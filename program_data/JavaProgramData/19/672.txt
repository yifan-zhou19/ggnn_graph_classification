package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int ls;
		int la;
		int p;
		int f;
		String s = new String(new char[201]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);

		s = new Scanner(System.in).nextLine();
		ls = s.length();
		a = new Scanner(System.in).nextLine();
		la = a.length();
		b = new Scanner(System.in).nextLine();

		s = tangible.StringFunctions.changeCharacter(s, ls, ' ');
		s = tangible.StringFunctions.changeCharacter(s, ls + 1, '\0');

		i = -1;
		while (i < ls)
		{
			i++;
			p = i;
			while (s.charAt(i) != ' ')
			{
				i++;
			}
			if (i - p != la)
			{
				for (j = p;j < i;j++)
				{
					System.out.printf("%c",s.charAt(j));
				}
				if (i != ls)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("\n");
					break;
				}
			}
			else
			{
				f = 1;
				for (j = 0;j < la;j++)
				{
					if (s.charAt(p + j) != a.charAt(j))
					{
						f = 0;
						break;
					}
				}
					if (f == 1)
					{
						System.out.printf("%s",b);
						if (i != ls)
						{
							System.out.print(" ");
						}
					   else
					   {
					System.out.print("\n");
					break;
					   }
					}

				else
				{
				for (j = p;j < i;j++)
				{
					System.out.printf("%c",s.charAt(j));
				}
				if (i != ls)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("\n");
					break;
				}
				}
			}
		};

		return 0;
	}
}

