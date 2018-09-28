package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int n = 0;
		int l;
		String sen = new String(new char[101]);
		String nsen = new String(new char[101]);
		sen = new Scanner(System.in).nextLine();
		l = sen.length();
		for (i = 0;i <= l;i++)
		{
			if (sen.charAt(i) != ' ' || (n == 0 && sen.charAt(i) == ' ') || i == l)
			{
			  nsen = tangible.StringFunctions.changeCharacter(nsen, j, sen.charAt(i));
			  j++;
			}
			if (sen.charAt(i) == ' ')
			{
			   n++;
			}
			if (sen.charAt(i) != ' ')
			{
			   n = 0;
			}
		}
		System.out.println(nsen);
		return 0;
	}

}

