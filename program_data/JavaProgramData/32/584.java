package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[101]);
		String d = new String(new char[101]);
		String e = new String(new char[101]);
		String f = new String(new char[101]);
		int a;
		int b;
		int h;
		int n;
		int i;
		int j;
		int m;
		int o;

		int tmp;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead("\n");
			if (tempVar3 != null)
			{
				d = tempVar3.charAt(0);
			}
			a = d.length();
			b = c.length();
			for (o = 0;o < a;o++)
			{
				f = tangible.StringFunctions.changeCharacter(f, o, d.charAt(a - o - 1));
			}
			for (j = 0;j < b;j++)
			{
				e = tangible.StringFunctions.changeCharacter(e, j, c.charAt(b - j - 1));
			}
			for (m = 0; m < a; m++)
			{
				if (e.charAt(m) < f.charAt(m))
				{
					e = tangible.StringFunctions.changeCharacter(e, m, e.charAt(m) + 10 - f.charAt(m) + '0');
					tmp = m;
					while (e.charAt(++tmp) < '1')
					{
						e = tangible.StringFunctions.changeCharacter(e, tmp, '9');
					}
					e.charAt(tmp)--;
				}
				else
				{
					e = tangible.StringFunctions.changeCharacter(e, m, e.charAt(m) - f.charAt(m) + '0');
				}
			}
			for (h = b - 1; h > 0; h--)
			{
				if (e.charAt(h) != '0')
				{
					break;
				}
			}
			for (; h >= 0; h--)
			{
				System.out.printf("%d",e.charAt(h) - '0');
			}

			System.out.print("\n");
		}
		return 0;
	}
}

