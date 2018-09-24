package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		int l;
		int i;
		int r;
		str = new Scanner(System.in).nextLine();
		l = str.length();
		for (i = 0;i < l;i++)
		{
			if (str.charAt(i) <= 'z' && str.charAt(i) >= 'a')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 'a'+'A');
			}
		}

		r = 1;
		for (i = 0;i < l;i++)
		{
			if (str.charAt(i) == str.charAt(i + 1))
			{
				r++;
			}
			if (str.charAt(i) != str.charAt(i + 1))
			{
				System.out.printf("(%c,%d)",str.charAt(i),r);
				r = 1;
			}
		}
	}

}

