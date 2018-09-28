package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		String s = new String(new char[100]);
		String t = new String(new char[100]);
		String p = new String(new char[100]);
		String q = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			t = tempVar2.charAt(0);
		}
		m = s.length();
		n = t.length();
		if (m != n)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				p = tangible.StringFunctions.changeCharacter(p, i, 1);
			}
			for (j = 0;j < m;)
			{
				for (k = 0;k < n;)
				{
					if (s.charAt(j) == t.charAt(k) && p.charAt(k) == 1)
					{
						p = p.substring(0, k);
						break;
					}
					else
					{
						k++;
					}
				}
				if (k == n)
				{
					System.out.print("NO");
					break;
				}
				else
				{
					j++;
				}
			}
			if (j == m)
			{
				System.out.print("YES");
			}
		}
	}

}

