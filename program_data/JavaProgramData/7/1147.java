package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[512]);
		String w = new String(new char[257]);
		String r = new String(new char[257]);
		int m;
		int n;
		int i;
		int j;
		int k;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			r = tempVar3.charAt(0);
		}
		m = s.length();
		n = w.length();
		for (i = 0;i <= m - n;i++)
		{
			t = 0;
			for (j = 0;j < n;j++)
			{
				if (w.charAt(j) != s.charAt(i + j))
				{
					t = 1;
				}
			}
			if (t == 0)
			{
				break;
			}
		}
		if (t == 0)
		{
			for (k = i;k <= i + n - 1;k++)
			{
				s = tangible.StringFunctions.changeCharacter(s, k, r.charAt(k - i));
			}
			System.out.printf("%s",s);
		}
		else
		{
			System.out.printf("%s",s);
		}
	}
}

