package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		int c = 0;
		String a = new String(new char[40]);
		String b = new String(new char[40]);
		char k;
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
			for (i = 0;i < m;i++)
			{
				for (j = 0;j <= i;j++)
				{
					if (a.charAt(j) > a.charAt(i))
					{
						k = a.charAt(j);
						a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(i));
						a = tangible.StringFunctions.changeCharacter(a, i, k);
					}
					if (b.charAt(j) > b.charAt(i))
					{
						k = b.charAt(j);
						b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(i));
						b = tangible.StringFunctions.changeCharacter(b, i, k);
					}
				}
			}
			for (i = 0;i < m;i++)
			{
				if (a.charAt(i) != b.charAt(i))
				{
					c = 1;
				break;
				}
			}
			if (c == 0)
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
	}
}

