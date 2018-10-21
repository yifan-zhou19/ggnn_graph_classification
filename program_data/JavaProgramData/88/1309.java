package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int len;
		String s = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < len;i++)
		{
			if ((s.charAt(i) >= '0') && (s.charAt(i) <= '9'))
			{
				for (j = i;;j++)
				{
					if ((s.charAt(j) >= '0') && (s.charAt(j) <= '9'))
					{
						System.out.print(s.charAt(j));
						s = tangible.StringFunctions.changeCharacter(s, j, '*');
					}
					else
					{
						break;
					}
				}
				System.out.print("\n");
			}
		}
		System.out.print("\n");
		return 0;
	}

}

