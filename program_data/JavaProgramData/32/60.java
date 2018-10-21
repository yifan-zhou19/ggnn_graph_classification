package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int x;
		int y;
		int k;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		String d = new String(new char[101]);
		String e = new String(new char[101]);
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
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			x = a.length();
			y = b.length();
			for (j = x - 1,k = 0;j >= 0;j--,k++)
			{
				c = tangible.StringFunctions.changeCharacter(c, k, a.charAt(j));
			}
			for (j = y - 1,k = 0;j >= 0;k++,j--)
			{
				d = tangible.StringFunctions.changeCharacter(d, k, b.charAt(j));
			}
			for (j = 0;j < x;j++)
			{
				if (j < y)
				{
					if (c.charAt(j) < d.charAt(j))
					{
						e = tangible.StringFunctions.changeCharacter(e, j, c.charAt(j) + 58 - d.charAt(j));
						c = tangible.StringFunctions.changeCharacter(c, j + 1, c.charAt(j + 1) - 1);
					}
					else
					{
						e = tangible.StringFunctions.changeCharacter(e, j, c.charAt(j) - d.charAt(j) + 48);
					}
				}
				else
				{
					e = tangible.StringFunctions.changeCharacter(e, j, c.charAt(j));
				}
			}
			for (j = x - 1;j >= 0;j--)
			{
				System.out.printf("%c",e.charAt(j));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

