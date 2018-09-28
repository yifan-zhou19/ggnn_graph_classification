package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String d = new String(new char[100]);
		String e = new String(new char[100]);
		int n;
		int j;
		int p;
		int q;
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			p = a.length();
			for (i = 0;i < p;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, p - 1 - i, a.charAt(i));
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			q = b.length();
			for (i = 0;i < q;i++)
			{
				d = tangible.StringFunctions.changeCharacter(d, q - 1 - i, b.charAt(i));
			}
			for (i = q;i < p;i++)
			{
				d = tangible.StringFunctions.changeCharacter(d, i, '0');
			}
			for (i = 0;i < p;i++)
			{
				if (c.charAt(i) >= d.charAt(i))
				{
					e = tangible.StringFunctions.changeCharacter(e, i, c.charAt(i) - d.charAt(i) + 48);
				}
				else
				{
					e = tangible.StringFunctions.changeCharacter(e, i, 10 + c.charAt(i) - d.charAt(i) + 48);
					for (k = i + 1;k < p;k++)
					{
						if (k != 0)
						{
							c = tangible.StringFunctions.changeCharacter(c, k, c.charAt(k) - 1);
							break;
						}

					}
				}
			}
			for (i = p - 1;i >= 0;i--)
			{
				if (e.charAt(i) != '0')
				{
					break;
				}
			}
			for (k = i;k >= 0;k--)
			{
				System.out.printf("%c",e.charAt(k));
			}
			System.out.print("\n");
		}
		return 0;
	}

}

