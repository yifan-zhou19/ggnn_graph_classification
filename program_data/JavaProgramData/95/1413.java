package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[81]);
		String b = new String(new char[81]);
		int i;
		a = new Scanner(System.in).nextLine(),gets(b);
		for (i = 0;i < 80;i = i + 1)
		{
			if (a.charAt(i) > 64 && a.charAt(i) < 91)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
			if (b.charAt(i) > 64 && b.charAt(i) < 91)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}
		}
		for (i = 0;i < 80;i = i + 1)
		{
			if (a.charAt(i) - b.charAt(i) == 0)
			{
				if (a.charAt(i) != '\0')
				{
					continue;
				}
				else
				{
					System.out.print('=');
					System.out.print("\n");
					break;
				}
			}
			else if (a.charAt(i) > b.charAt(i))
			{
				System.out.print('>');
				System.out.print("\n");
				break;
			}
			else
			{
				System.out.print('<');
				System.out.print("\n");
				break;
			}

		}
		return 0;
	}


}

