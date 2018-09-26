package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int la;
		int lb;
		int lc;
		int aaa;
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		la = a.length();
		lb = b.length();
		lc = c.length();
		aaa = 0;
		for (i = 0;i <= la - 1;i++)
		{

			for (j = 0;(j <= lb - 1) && (i + j <= la - 1);j++)
			{
				if (a.charAt(i + j) == b.charAt(j))
				{
					if (j == lb - 1)
					{
						aaa = 1;
					}
				}
				else
				{
					break;
				}
			}
			if (aaa == 1)
			{
				break;
			}
		}
		if (aaa == 1)
		{
			for (j = 0;j <= lc - 1;j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i + j, c.charAt(j));
			}
		}
		System.out.println(a);
	}

}

