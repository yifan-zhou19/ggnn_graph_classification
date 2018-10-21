package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		int k = 0;
		int t = 0;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}

		m = a.length();
		n = b.length();

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (b.charAt(i) == a.charAt(j))
				{
					k = k + 1;
					a = tangible.StringFunctions.changeCharacter(a, j, '*');
					break;
				}
			}
		}

		if (k == n && m == n)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}
}

