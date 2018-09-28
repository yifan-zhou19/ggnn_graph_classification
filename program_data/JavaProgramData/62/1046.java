package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l;
		int k;
		String s = new String(new char[MAX + 1]);
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i < l;i++)
		{
			for (j = 0;j < l - 1;j++)
			{
				if ((s.charAt(j) == 32) && (s.charAt(j + 1) == 32))
				{
					for (k = (j + 1);k < l;k++)
					{
						s = tangible.StringFunctions.changeCharacter(s, k, s.charAt(k + 1));
					}
				}
			}
		}
		System.out.println(s);
		return 0;
	}
}

