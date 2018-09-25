package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[31]);
		String temp = new String(new char[31]);
		int j = 0;
		int c = 0;
		s = new Scanner(System.in).nextLine();
		while (s.charAt(j) != '\0')
		{
			if (s.charAt(j) >= '0' && s.charAt(j) <= '9')
			{
			temp = tangible.StringFunctions.changeCharacter(temp, c++, s.charAt(j));
			}
			else
			{
				temp = tangible.StringFunctions.changeCharacter(temp, c, '\0');
				c = 0;
				System.out.printf("%s\n",temp);
			}
			j++;
		}
		temp = tangible.StringFunctions.changeCharacter(temp, c, '\0');
		System.out.printf("%s",temp);
		return 0;
	}




}

