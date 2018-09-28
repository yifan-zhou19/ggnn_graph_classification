package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[5]);
		String b = new String(new char[5]);
		int i;
		int j;
		a = new Scanner(System.in).nextLine();
		int length = (int)a.length();
		for (i = length - 1,j = 0;i >= 0;i--,j++)
		{
			b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
		}
		b = tangible.StringFunctions.changeCharacter(b, j, '\0');
		System.out.println(b);
		return 0;
	}

}

