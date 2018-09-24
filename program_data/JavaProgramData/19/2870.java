package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[105]);
	public static String h = new String(new char[105]);
	public static String b = new String(new char[105]);
	public static String c = new String(new char[105]);
	public static String d = new String(new char[105]);
	public static int k;
	public static int p;
	public static int Main()
	{
		int i;
		int j;
		int t;
		a = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		for (i = 0,j = 0;i <= a.length();i++)
		{
			d = tangible.StringFunctions.changeCharacter(d, k++, a.charAt(i));
			h = tangible.StringFunctions.changeCharacter(h, p++, a.charAt(i));
			if (a.charAt(i) == ' ' || a.charAt(i) == '\0')
			{
				d = tangible.StringFunctions.changeCharacter(d, --k, '\0');
				if (strcmp(d,b) == 0)
				{
					p -= d.length() + 1;
					for (t = 0;t < c.length();t++)
					{
						h = tangible.StringFunctions.changeCharacter(h, p++, c.charAt(t));
					}
					if (a.charAt(i) == ' ')
					{
					h = tangible.StringFunctions.changeCharacter(h, p++, ' ');
					}
				}
				j = k + 1;
				k = 0;
			}
		}
		for (i = 0;i < h.length();i++)
		{
			System.out.print(h.charAt(i));
		}
		return 0;
	}
}

