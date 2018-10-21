package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		String t;
		t = tangible.StringFunctions.strStr(a,b);
		if (t == null)
		{
			System.out.printf("%s",a);
			return 0;
		}
		else
		{
			char f = t - a;
			int d = a.length();
			int e = c.length();
			int i = f;
			int j;
			for (j = 0;j < e;j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, c.charAt(j));
				i++;
				if (i == t - a.Substring(e))
				{
					break;
				}
			}
		}
		System.out.printf("%s",a);
	}
}

