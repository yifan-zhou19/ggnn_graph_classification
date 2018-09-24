package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int k1;
		int k2;
		int l;
		int l0;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = a.length();
		l0 = b.length();
		if (l == l0)
		{
		k1 = k2 = l;
		for (i = 0;i < l;i++)
		{
			for (j = 0;j < l;j++)
			{
				if (a.charAt(i) == b.charAt(j))
				{
					k2--;
					b = tangible.StringFunctions.changeCharacter(b, j, '0');
					break;
				}
			}
			k1--;
		}
		if (k1 == 0 && k2 == 0)
		{
		System.out.print("YES");
		}
		else
		{
		System.out.print("NO");
		}
		}
		else
		{
		System.out.print("NO");
		}

		return 0;
	}

}

