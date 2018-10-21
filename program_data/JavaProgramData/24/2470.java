package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		int lest = 0;
		int sest = 100;
		int l = 0;
		int i;
		int pl;
		int ps;
		a = new Scanner(System.in).nextLine();
		a = tangible.StringFunctions.changeCharacter(a, a.length(), ' ');
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) != ' ')
			{
				l++;
			}
			else
			{
				if (l > lest)
				{
					lest = l;
					pl = i - l;
				}
				if (l < sest)
				{
					sest = l;
					ps = i - l;
				}
				l = 0;
			}
		}
		for (i = pl;i < pl + lest;i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
		System.out.print("\n");
		for (i = ps;i < ps + sest;i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
		return 0;
	}
}

