package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k = 0;
		String a = new String(new char[100]);
		final String b = "";
		a = new Scanner(System.in).nextLine();
		b = tangible.StringFunctions.changeCharacter(b, 0, a.charAt(0));
		for (i = 1;a.charAt(i) != '\0';i++)
		{
			if ((a.charAt(i) == ' ') && (a.charAt(i - 1) == ' '))
			{
				;
			}
			else
			{
				k++;
			}
			b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i));
		}
		System.out.println(b);
		return 0;
	}
}

