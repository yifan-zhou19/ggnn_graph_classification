package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		String s = new String(new char[101]);
		String d = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i - 1);i++)
		{
			if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ')
			{
				continue;
			}
			else
			{
			d = tangible.StringFunctions.changeCharacter(d, j, s.charAt(i));
			j++;
			}
		}
		System.out.println(d);
		return 0;
	}


}

