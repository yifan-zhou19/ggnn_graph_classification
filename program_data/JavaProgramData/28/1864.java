package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		int i;
		int j;
		int l;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();)
		{
			if (a.charAt(i) != ' ')
			{
				l = 0;
				for (j = 0;j < a.length();j++)
				{
					if (a.charAt(i + j) != ' ')
					{
						l++;
					}
					if ((a.charAt(i + j) == ' ') && ((i + j) != (a.length() - 1)))
					{
						System.out.printf("%d,",l);
						break;
					}
					if ((i + j) == (a.length() - 1))
					{
						System.out.printf("%d",l);
						break;
					}
				}
				i = i + l;
			}
			else
			{
				i++;
			}
		}
		return 0;
	}

}
