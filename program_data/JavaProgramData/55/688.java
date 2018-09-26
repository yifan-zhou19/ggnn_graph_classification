package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int a;
			String n = new String(new char[200]);
			int b;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int v = 0;
			int i = 0;
			for (i = 0; n.charAt(i); i++)
			{
					v *= a;
					n = tangible.StringFunctions.changeCharacter(n, i, Character.toLowerCase(n.charAt(i)));
					if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
					{
							v += n.charAt(i) - '0';
					}
					else if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
					{
							v += 10 + n.charAt(i) - 'A';
					}
					else if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
					{
							v += 10 + n.charAt(i) - 'a';
					}
			}
			if (v == 0)
			{
					System.out.print(0);
					System.out.print("\n");
			}
			else
			{
					String r = new String(new char[200]);
					i = 0;
					while (v != 0)
					{
							if (v % b < 10)
							{
									r = tangible.StringFunctions.changeCharacter(r, i++, v % b + '0');
							}
							else
							{
									r = tangible.StringFunctions.changeCharacter(r, i++, v % b + 'A' - 10);
							}
							v /= b;
					}
					while (i > 0)
					{
							System.out.print(r.charAt(--i));
					}
					System.out.print("\n");
			}

			return 0;


	}

}

