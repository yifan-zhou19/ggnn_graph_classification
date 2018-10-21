package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String temp = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		int i;
		int j = 0;

		for (i = 0;i < s.length();i++)
		{
			if ((s.charAt(i) != ' ') || (s.charAt(i - 1) != ' ' && s.charAt(i) == ' '))
			{

				temp = tangible.StringFunctions.changeCharacter(temp, j, s.charAt(i));
				j++;
			}
		}
		temp = tangible.StringFunctions.changeCharacter(temp, j, '\0');
		System.out.println(temp);
		return 0;
	}



}

