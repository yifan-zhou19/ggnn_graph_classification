package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[1002]);
	public static int l;
	public static int cc = 0;
	public static void tongji(int p)
	{
		int i;
		int q;
		if (p == l)
		{
		}
		else
		{
			cc = 1;
			for (i = p;i <= l;i++)
			{
				if (a.charAt(i) == a.charAt(i + 1))
				{
					cc++;
				}
				else
				{
					q = i;
					break;
				}
			}
			System.out.print("(");
			System.out.print(a.charAt(p));
			System.out.print(",");
			System.out.print(cc);
			System.out.print(")");
			tongji(q + 1);
		}
	}
	public static int Main()
	{
		int i;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) >= 'a')
			{
				a.charAt(i) -= 32;
			}
		}
		a = tangible.StringFunctions.changeCharacter(a, a.length(), '!');
		tongji(0);
		return 0;
	}

}

