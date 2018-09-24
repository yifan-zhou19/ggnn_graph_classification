package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[50]);
		for (i = 0;i <= n;i++)
		{
			s = new Scanner(System.in).nextLine();
			m = s.length();
			for (j = m - 1;m >= 0;m--)
			{
				if (s.charAt(m - 1) == 'r' || s.charAt(m - 1) == 'y')
				{
					s = tangible.StringFunctions.changeCharacter(s, m - 2, '\0');
					break;
				}
				else if (s.charAt(m - 1) == 'g')
				{
					s = tangible.StringFunctions.changeCharacter(s, m - 3, '\0');
					break;
				}
			}
						System.out.print("\n");
						System.out.printf("%s",s);
		}



	}
}

