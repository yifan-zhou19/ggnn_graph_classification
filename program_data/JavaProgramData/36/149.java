package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int z = 0;
		int x;
		int y;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		m = a.length();
		n = b.length();
		if (m == n)
		{
			for (i = 0;i < m - 1;i++)
			{
				for (j = 0;j < m - i;j++)
				{
					if (a.charAt(j) > a.charAt(j + 1))
					{
						x = a.charAt(j + 1);
						a = tangible.StringFunctions.changeCharacter(a, j + 1, a.charAt(j));
						a = tangible.StringFunctions.changeCharacter(a, j, x);
					}
					if (b.charAt(j) > b.charAt(j + 1))
					{
						y = b.charAt(j + 1);
						b = tangible.StringFunctions.changeCharacter(b, j + 1, b.charAt(j));
						b = tangible.StringFunctions.changeCharacter(b, j, y);
					}
				}
			}
			for (i = 0;i < m;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					z = z + 1;
				}
			}
			if (z == m)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
		if (m != n)
		{
			System.out.print("NO");
		}
	}

}

