package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		int i;
		int k;
		s = new Scanner(System.in).nextLine();
		for (i = 1,k = 1;s.charAt(i) != '\0';i++,k++)
		{
			if (s.charAt(i) == ' ' && s.charAt(i - 1) == ' ')
			{
				k--;
			}
			else
			{
				s = tangible.StringFunctions.changeCharacter(s, k, s.charAt(i));
			}
		}
		s = tangible.StringFunctions.changeCharacter(s, k, '\0');
		System.out.printf("%s\n",s);
	}
}

