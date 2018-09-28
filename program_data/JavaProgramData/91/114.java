package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[210]);
		String qinpeng = new String(new char[210]);
		int i;
		int j;
		c = new Scanner(System.in).nextLine();
		for (i = 0;i < (c.length() - 1);i++)
		{
								qinpeng = tangible.StringFunctions.changeCharacter(qinpeng, i, c.charAt(i) + c.charAt(i + 1));
		}
		qinpeng = tangible.StringFunctions.changeCharacter(qinpeng, c.length() - 1, c.charAt(0) + c.charAt(c.length() - 1));
		qinpeng = tangible.StringFunctions.changeCharacter(qinpeng, c.length(), '\0');
		System.out.printf("%s\n",qinpeng);
		return 0;
	}
}

