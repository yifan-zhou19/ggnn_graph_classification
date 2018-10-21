package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[500]);
	public static int length;
	public static int check(int start, int len)
	{
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		int i;
		for (i = 0;i < 500;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
			b = tangible.StringFunctions.changeCharacter(b, i, '\0');
		}
		for (i = 0;i < len;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, str.charAt(i + start));
			b = tangible.StringFunctions.changeCharacter(b, i, str.charAt(len - i + start - 1));
		}
		if (strcmp(a,b) == 0)
		{
			System.out.println(a);
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int ctr1;
	public static int ctr2;
	public static int ctr3;
	public static int Main()
	{
		str = new Scanner(System.in).nextLine();
		length = str.length();
		for (ctr1 = 2;ctr1 <= length;ctr1 += 2)
		{
			for (ctr2 = 0;ctr2 <= length - ctr1;ctr2++)
			{
				check(ctr2, ctr1);
			}
		}
		return 0;
	}

}

