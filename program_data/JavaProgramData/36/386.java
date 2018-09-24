package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]); //temp?????????
		String b = new String(new char[100]);
		char t;
		int n; //n,m???????,i,j?????????
		int m;
		int i;
		int j;
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
		n = a.length();
		m = b.length();
		if (n == m)
		{
			for (j = 0;j < n;j++)
			{
				for (i = 0;i < n - j;i++)
				{
				if (a.charAt(i) > a.charAt(i + 1))
				{
					t = a.charAt(i);
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i + 1));
					a = tangible.StringFunctions.changeCharacter(a, i + 1, t);
				}
				}
			}
			for (j = 0;j < m;j++)
			{
				for (i = 0;i < m - j;i++)
				{
				if (b.charAt(i) > b.charAt(i + 1))
				{
					t = b.charAt(i);
					b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i + 1));
					b = tangible.StringFunctions.changeCharacter(b, i + 1, t); //???????????????
				}
				}
			}
			for (i = 0,j = 0;i < n;i++)
			{
				j = j + 1;
				if (a.charAt(i) != b.charAt(i))
				{
					break;
				}
			}
			if (j >= n)
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
		return 0;
	}
}

