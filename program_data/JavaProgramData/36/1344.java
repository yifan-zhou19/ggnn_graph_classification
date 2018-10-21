package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[101]);
		String str = new String(new char[101]);
		int i;
		int j;
		int k;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ch = tempVar.charAt(0);
		}
		m = ch.length();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		n = str.length();
		k = 0;
		if (m != n)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < m;j++)
				{
					if (ch.charAt(i) == str.charAt(j))
					{
						k = k + 1;
						str = tangible.StringFunctions.changeCharacter(str, j, ' ');
						break;
					}
				}
			}
			if (k == m)
			{
			System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
		return 0;
	}
}

