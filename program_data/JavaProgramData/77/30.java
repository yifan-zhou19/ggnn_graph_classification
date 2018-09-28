package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[200]);
		char m;
		char f;
		int i;
		int j;
		s = new Scanner(System.in).nextLine();
		m = s.charAt(0);
		for (i = 0;i < 200;i++)
		{
			if (s.charAt(i) != 0 && s.charAt(i) != m)
			{
				f = s.charAt(i);
				break;
			}
		}
		for (i = 0;i < 200;i++)
		{
			if (s.charAt(i) != 0)
			{
				if (s.charAt(i) == f)
				{
					for (j = i - 1;j >= 0;j--)
					{
						if (s.charAt(j) == m)
						{
							System.out.printf("%d %d\n",j,i);
							s = tangible.StringFunctions.changeCharacter(s, i, 'p');
							s = tangible.StringFunctions.changeCharacter(s, j, 'q');
							break;
						}
					}
				}
			}
			else
			{
				break;
			}
		}
		return 0;
	}
}

