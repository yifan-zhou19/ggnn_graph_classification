package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		i = 0;
		j = 1;
		String a = new String(new char[1001]);
		a = new Scanner(System.in).nextLine();
		do
		{
			if (a.charAt(i) > 'Z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - ('a'-'A'));
			}
			i = i + 1;
		} while (a.charAt(i) != '\0');
		i = 0;
		do
		{
			if (a.charAt(i) == a.charAt(i + 1))
			{
				j = j + 1;
			}
			else
			{
				System.out.printf("(%c,%d)",a.charAt(i),j);
				j = 1;
			}
			i = i + 1;
		} while (i < 1001 && a.charAt(i) != '\0');
		return 0;
	}

}

