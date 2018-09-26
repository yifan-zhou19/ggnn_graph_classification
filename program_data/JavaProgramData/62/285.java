package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l;
		String s = new String(new char[210]);
		s = new Scanner(System.in).nextLine();
		l = s.length();
		j = 0;
		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) == ' ')
			{
				if (j == 0)
				{
					System.out.printf("%c",s.charAt(i));
					j++;
				}
			}
			else
			{
				System.out.printf("%c",s.charAt(i));
				j = 0;
			}
		}
		return 0;
	}

}
