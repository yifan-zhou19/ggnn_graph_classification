package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j = 0;
		int k;
		String s = new String(new char[101]);
		String a = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n;i++)
		{
			if (s.charAt(i) != ' ')
			{
				if (a.charAt(j) == ' ')
				{
					j++;
				 a = tangible.StringFunctions.changeCharacter(a, j, s.charAt(i));
				   j++;

				}
				else
				{
				 a = tangible.StringFunctions.changeCharacter(a, j, s.charAt(i));
				   j++;
				}

			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, j, ' ');

			}
		}
		for (i = 0;i < j;i++)
		{

			System.out.printf("%c",a.charAt(i));
		}
			return 0;
	}


}

