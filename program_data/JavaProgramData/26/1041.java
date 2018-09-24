package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i);i++)
		{
			if (!(a.charAt(i) == ' ' && a.charAt(i + 1) == ' '))
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j++;
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, j, '\0');
		System.out.println(b);
	}
}

