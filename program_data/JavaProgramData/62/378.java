package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int l;
		int j;
		String s = new String(new char[200]);
		String c = new String(new char[200]);
		s = new Scanner(System.in).nextLine();
		j = 1;
		c = tangible.StringFunctions.changeCharacter(c, 0, s.charAt(0));
		for (k = 1;s.charAt(k) != '\0';k++)
		{
		if (s.charAt(k - 1) == 32)
		{
				if (s.charAt(k) != 32)
				{
					c = tangible.StringFunctions.changeCharacter(c, j, s.charAt(k));
					j++;
				}
		}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, j, s.charAt(k));
				j++;
			}
		}
		c = tangible.StringFunctions.changeCharacter(c, j, '\0');
		 System.out.println(c);
	return 0;
	}

}

