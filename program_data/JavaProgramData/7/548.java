package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int x;
		int n;
		int m;
		int d;
		int k;
		int y;
		int v = 0;
		String s = new String(new char[256]);
		String b = new String(new char[256]);
		String t = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			t = tempVar3.charAt(0);
		}
		n = s.length();
		m = b.length();
		for (i = 0;i <= n - m;i++)
		{
			if (s.charAt(i) == b.charAt(0))
			{
				k = i;
				for (j = 0,x = i;j < m;j++,x++)
				{
					if (s.charAt(x) != b.charAt(j))
					{
						break;
					}
				}
				if (j >= m)
				{
					for (d = k,y = 0;d < k + m;d++,y++)
					{
						s = tangible.StringFunctions.changeCharacter(s, d, t.charAt(y));
						v = 1;
					}
				}
			}
				if (v == 1)
				{
				break;
				}
		}
			for (i = 0;i < n;i++)
			{
				System.out.printf("%c",s.charAt(i));
			}
			return 0;
	}
}

