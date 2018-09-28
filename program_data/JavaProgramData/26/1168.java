package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String c = new String(new char[100]);
		int i;
		int k;
		int w;
		int j;

		s = new Scanner(System.in).nextLine();

		k = s.length();

		w = j = 0;

		for (i = 0;i < k;i++)
		{
			if (s.charAt(i) == ' ')
			{
				if (s.charAt(i + 1) == ' ')
				{
					w = 1;
				}

				else
				{
				  c = tangible.StringFunctions.changeCharacter(c, j, s.charAt(i));
				  j = j + 1;
				}

			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, j, s.charAt(i));
				j = j + 1;
			}


		}

		c = c.substring(0, j);

		System.out.println(c);

		return 0;

	}



}

