package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz = new String(new char[101]);
		String sz2 = new String(new char[101]);
		int i;
		int k = 0;
		int m;
		sz = new Scanner(System.in).nextLine();
		 m = sz.length();
		for (i = 0;i <= m;i++)
		{
			if (!(sz.charAt(i) == ' ' && sz.charAt(i + 1) == ' '))
			{
				sz2 = tangible.StringFunctions.changeCharacter(sz2, k++, sz.charAt(i));
			}
		}
		sz2 = tangible.StringFunctions.changeCharacter(sz2, k, '\0');
		System.out.println(sz2);
		return 0;
	}


}

