package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		int a;
		int b;
		int m;
		int n;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		m = str1.length();
		n = str2.length();
		if (m != n)
		{
			System.out.print("NO");
		}
		else
		{
			for (a = 0;a < m;a++)
			{
				for (c = 0;c < m - a;c++)
				{
					if (str1.charAt(c) < str1.charAt(c + 1))
					{
						e = str1.charAt(c);
						str1 = tangible.StringFunctions.changeCharacter(str1, c, str1.charAt(c + 1));
						str1 = tangible.StringFunctions.changeCharacter(str1, c + 1, e);
					}
				}
			}
				for (b = 0;b < n;b++)
				{
					for (d = 0;d < n - b;d++)
					{
						if (str2.charAt(d) < str2.charAt(d + 1))
						{
							f = str2.charAt(d);
							str2 = tangible.StringFunctions.changeCharacter(str2, d, str2.charAt(d + 1));
							str2 = tangible.StringFunctions.changeCharacter(str2, d + 1, f);
						}
					}
				}
			if (strcmp(str1,str2) == 0)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
	}

}

