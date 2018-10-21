package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i = 0;
		int j;
		String p;
		String str = new String(new char[1000]);
		String str1 = new String(new char[1000]);
		p = str;

		str = new Scanner(System.in).nextLine();
		j = str.length();
		while (i < j - 1)
		{
		str1 = tangible.StringFunctions.changeCharacter(str1, i, *(p.Substring(i)) + *(p.Substring(i) + 1));
			i++;
		}
		str1 = tangible.StringFunctions.changeCharacter(str1, j - 1, *(p.Substring(j) - 1) + p);
		for (i = 0;i < j;i++)
		{
			System.out.printf("%c",str1.charAt(i));
		}
		return 0;
	}


}

