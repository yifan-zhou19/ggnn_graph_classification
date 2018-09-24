package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int i;
		int j = 1;
		a = new Scanner(System.in).nextLine();
		b = tangible.StringFunctions.changeCharacter(b, 0, a.charAt(0));
		for (i = 1;a.charAt(i) != 0;i++)
		{
		b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
		if ((b.charAt(j) != b.charAt(j - 1)) || (b.charAt(j) != 32))
		{
		b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
		j++;
		}
		b = b.substring(0, j);
		}
		System.out.println(b);
		return 0;
	}
}

