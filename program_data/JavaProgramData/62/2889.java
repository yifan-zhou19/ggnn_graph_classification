package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		int i;
		int k;
		int f;
		a = new Scanner(System.in).nextLine();
		f = 1;
		k = 0;
		for (i = 0; a.charAt(i) != '\0'; i++)
		{
			if (a.charAt(i) == ' ')
			{
				if (f == 1)
				{
					b = tangible.StringFunctions.changeCharacter(b, k++, a.charAt(i));
					f = 0;
				}
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, k++, a.charAt(i));
				f = 1;
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, k, '\0');
		for (i = 0; b.charAt(i) != '\0'; i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, b.charAt(i));
		}
		a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		System.out.println(a);
		return 0;
	}
}

