package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1005]);
		int i = 0;
		int j;
		int k = 1;
		s = new Scanner(System.in).nextLine();
		while (s.charAt(i) != '\0')
		{
			if (s.charAt(i) - 'a' >= 0 && s.charAt(i) - 'z' <= 0)
			{
			s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'a'+'A');
			}
			i++;
		}
		i = 0; //i??????????
		while (s.charAt(i) != '\0')
		{
			if ((s.charAt(i)) != (s.charAt(i + 1)))
			{
				System.out.printf("(%c,%d)",s.charAt(i),k);
				k = 1;
			}
			else
			{
				k++;
			}
			i++;
		}
	}
}

