package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String xulie = new String(new char[10000]);
		int l = 0;
		int i;
		int len;
		int x;
		int y;
		x = 0;
		y = 0;
		xulie = new Scanner(System.in).nextLine();
		len = xulie.length();
		xulie = tangible.StringFunctions.changeCharacter(xulie, len, ' ');
		for (i = 0;i <= len;i++)
		{
			if (xulie.charAt(i) != ' ')
			{
				l++;
			}
			else if (xulie.charAt(i) == ' ' && xulie.charAt(i - 1) != ' ')
			{
				System.out.printf("%d",l);
				l = 0;
				break;
			}
		}
		i++;
		while (i <= len)
		{
			if (xulie.charAt(i) != ' ')
			{
				l++;
			}
			else if (xulie.charAt(i) == ' ' && xulie.charAt(i - 1) != ' ')
			{
				System.out.printf(",%d",l);
				l = 0;
			}
			i++;
		}
		return 0;
	}
}

