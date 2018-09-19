package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String c = new String(new char[200]);
		String s = new String(new char[200]);

		while (gets(c))
		{
		int[] a = new int[200];
		int tt = 0;
		System.out.println(c);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(s, 0, (Character.SIZE / Byte.SIZE));
		for (int i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == '(')
			{
				a[++tt] = i;
			}
			else if (c.charAt(i) == ')')
			{
				if (tt == 0)
				{
					s = tangible.StringFunctions.changeCharacter(s, i, '?');
				}
				else
				{
					s = tangible.StringFunctions.changeCharacter(s, a[tt--], s[i] = ' ');
				}
			}
			else
			{
				s = tangible.StringFunctions.changeCharacter(s, i, ' ');
			}
		}
		for (int i = 1; i <= tt; i++)
		{
			s = tangible.StringFunctions.changeCharacter(s, a[i], '$');
		}
		System.out.println(s);
		}

		return 0;
	}


}

