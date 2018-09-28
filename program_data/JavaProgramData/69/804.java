package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String A = new String(new char[250]);
		String B = new String(new char[250]);
		String C = new String(new char[250]);
		String D = new String(new char[250]);
		String E = new String(new char[250]);
		int i;
		int j;
		int a;
		int b;
		int c;
		A = new Scanner(System.in).nextLine();
		B = new Scanner(System.in).nextLine();
		a = A.length();
		b = B.length();
		for (i = a - 1,j = 0;i >= 0;i--,j++)
		{
			C = tangible.StringFunctions.changeCharacter(C, j, A.charAt(i));
		}
		C = C.substring(0, j);
		for (i = b - 1,j = 0;i >= 0;i--,j++)
		{
			D = tangible.StringFunctions.changeCharacter(D, j, B.charAt(i));
		}
		D = D.substring(0, j);
		if (a > b)
		{
			for (i = 0;i < b;i++)
			{
				if (E.charAt(i) == 1)
				{
				E = tangible.StringFunctions.changeCharacter(E, i, C.charAt(i) + D.charAt(i) - 47);
				}
				else
				{
				E = tangible.StringFunctions.changeCharacter(E, i, C.charAt(i) + D.charAt(i) - 48);
				}
				if (E.charAt(i) > 57)
				{
					E.charAt(i) -= 10;
					E = tangible.StringFunctions.changeCharacter(E, i + 1, 1);
				}
			}
			for (i = b;i < a;i++)
			{
				if (E.charAt(i) == 1)
				{
				E = tangible.StringFunctions.changeCharacter(E, i, C.charAt(i) + 1);
				}
				else
				{
				E = tangible.StringFunctions.changeCharacter(E, i, C.charAt(i));
				}
				if (E.charAt(i) > 57)
				{
					E.charAt(i) -= 10;
				E = tangible.StringFunctions.changeCharacter(E, i + 1, 1);
				}
			}
			if (E.charAt(i) == 1)
			{
				E = tangible.StringFunctions.changeCharacter(E, i, 49);
			E = E.substring(0, i + 1);
			}
			else
			{
				E = E.substring(0, i);
			}
			c = 0;
			for (i = E.length() - 1;i >= 0;i--)
			{
				if (E.charAt(i) != 48)
				{
				System.out.printf("%c",E.charAt(i));
				c = 1;
				}
				if (E.charAt(i) == 48 && c == 1)
				{
				System.out.printf("%c",E.charAt(i));
				}
			}
			if (c == 0)
			{
				System.out.print("0");
			}
			System.out.print("\n");
		}
		else
		{
			for (i = 0;i < a;i++)
			{
				if (E.charAt(i) == 1)
				{
				E = tangible.StringFunctions.changeCharacter(E, i, C.charAt(i) + D.charAt(i) - 47);
				}
				else
				{
				E = tangible.StringFunctions.changeCharacter(E, i, C.charAt(i) + D.charAt(i) - 48);
				}
				if (E.charAt(i) > 57)
				{
					E.charAt(i) -= 10;
					E = tangible.StringFunctions.changeCharacter(E, i + 1, 1);
				}
			}
			for (i = a;i < b;i++)
			{
				if (E.charAt(i) == 1)
				{
				E = tangible.StringFunctions.changeCharacter(E, i, D.charAt(i) + 1);
				}
				else
				{
				E = tangible.StringFunctions.changeCharacter(E, i, D.charAt(i));
				}
				if (E.charAt(i) > 57)
				{
					E.charAt(i) -= 10;
				E = tangible.StringFunctions.changeCharacter(E, i + 1, 1);
				}
			}
			if (E.charAt(i) == 1)
			{
				E = tangible.StringFunctions.changeCharacter(E, i, 49);
			E = E.substring(0, i + 1);
			}
			else
			{
				E = E.substring(0, i);
			}
			c = 0;
			for (i = E.length() - 1;i >= 0;i--)
			{
				if (E.charAt(i) != 48)
				{
				System.out.printf("%c",E.charAt(i));
				c = 1;
				}
				if (E.charAt(i) == 48 && c == 1)
				{
				System.out.printf("%c",E.charAt(i));
				}

			}
			if (c == 0)
			{
				System.out.print("0");
			}
			System.out.print("\n");
		}


		return 0;
	}



}

