package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char cha;
		int i;
		int j;
		int m;
		int n;
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
		if (m != n)
		{
		System.out.print("NO\n");
		}
		else
		{
			for (i = 1;i < m;i++)
			{
			for (j = 0;j < m - i;j++)
			{
				if (a.charAt(j) > a.charAt(j + 1))
				{
					cha = a.charAt(j);
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
					a = tangible.StringFunctions.changeCharacter(a, j + 1, cha);
				}
			}
			}
			for (i = 1;i < n;i++)
			{
			for (j = 0;j < n - i;j++)
			{
				if (b.charAt(j) > b.charAt(j + 1))
				{
					cha = b.charAt(j);
					b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
					b = tangible.StringFunctions.changeCharacter(b, j + 1, cha);
				}
			}
			}
			if (strcmp(a,b) != 0)
			{
			System.out.print("NO\n");
			}
			else
			{
			System.out.print("YES\n");
			}
		}

		return 0;
	}

}

