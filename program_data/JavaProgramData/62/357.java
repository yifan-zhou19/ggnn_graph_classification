package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String old = new String(new char[200]);
		String wri = new String(new char[200]);
		int a;
		int b;
		old = new Scanner(System.in).nextLine();
		b = 0;
		for (a = 0;old.charAt(a) != '\0';a++)
		{
			if (old.charAt(a) != ' ')
			{
				wri = tangible.StringFunctions.changeCharacter(wri, b, old.charAt(a));
				b++;
			}
			else
			{
				if (old.charAt(a + 1) != ' ')
				{
					wri = tangible.StringFunctions.changeCharacter(wri, b, old.charAt(a));
					wri = tangible.StringFunctions.changeCharacter(wri, b + 1, old.charAt(a + 1));
					b = b + 2;
					a++;
				}
				else
				{
					continue;
				}
			}
		}
		wri = tangible.StringFunctions.changeCharacter(wri, b, '\0');
		System.out.println(wri);
		return 0;
	}

}

