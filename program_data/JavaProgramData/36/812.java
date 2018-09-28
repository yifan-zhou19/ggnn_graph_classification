package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
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
		n = a.length();
		m = b.length();
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (a.charAt(i) == b.charAt(j))
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '1');
					b = tangible.StringFunctions.changeCharacter(b, j, '2');
				}
			}
		}
		for (i = 0;i <= m;i++)
		{
			if (b.charAt(i) != '2')
			{
				break;
			}
		}
		for (j = 0;j <= n;j++)
		{
			if (a.charAt(j) != '1')
			{
				break;
			}
		}

			if (i == m && j == n)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}

	}









}

