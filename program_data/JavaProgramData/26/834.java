package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i = 0;
		int n;
		int j = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		while (i < n)
		{
			b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
			if (a.charAt(i) != ' ')
			{
				j++;
			}
			else if (a.charAt(i) == ' ')
			{
				if (a.charAt(i + 1) != ' ' && a.charAt(i - 1) != ' ')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, ' ');
					j++;

				}
				 else if (a.charAt(i + 1) != ' ' && a.charAt(i - 1) == ' ')
				 {
					b = tangible.StringFunctions.changeCharacter(b, j, ' ');
					j++;

				 }
			}



			i++;
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}

		return 0;


	}
}

