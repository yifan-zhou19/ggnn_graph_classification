package <missing>;

public class GlobalMembers
{
	public static String il = new String(new char[MAX]);
	public static String ol = new String(new char[MAX]);
	public static int i;
	public static int j = 1;
	public static int Main()
	{
		il = new Scanner(System.in).nextLine();
		ol = tangible.StringFunctions.changeCharacter(ol, 0, il.charAt(0));
		for (i = 1;il.charAt(i) != '\0';i++)
		{
			if (il.charAt(i - 1) != ' ' || il.charAt(i) != ' ')
			{
				ol = tangible.StringFunctions.changeCharacter(ol, j, il.charAt(i));
				j++;
			}
		}
		ol = tangible.StringFunctions.changeCharacter(ol, j, '\0');
		System.out.println(ol);
		return 0;
	}
}

