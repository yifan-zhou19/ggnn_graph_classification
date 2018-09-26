package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		int t;
		int i;
		int j;
		int k;
		int s;
		int q;
		String a = new String(new char[26]);
		String c = new String(new char[100]);
		int[] b = new int[26];
		String p = new String(new char[100001]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			t = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = tempVar2.charAt(0);
			}
			a = tangible.StringFunctions.changeCharacter(a, 0, *p);
			b[0] = 1;
			t++;
			l = p.length();
			for (j = 1;j < l;j++)
			{
				q = 0;
				for (k = 0;k < t;k++)
				{
					s = (p.Substring(j)) - *(a.Substring(k));
					if (s == 0)
					{
						b[k]++;
						q = 1;
						break;
					}
				}
				if (q == 0)
				{
					a = tangible.StringFunctions.changeCharacter(a, t, *(p.Substring(j)));
					b[t] = 1;
					t++;
				}
			}
			q = 0;
			for (j = 0;j < t;j++)
			{
			if (b[j] == 1)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(j));
				q++;
				break;
			}
			}
			if (q == 0)
			{
			c = tangible.StringFunctions.changeCharacter(c, i, 'A');
			}
		}
		for (i = 0;i < n;i++)
		{
		if (c.charAt(i) == 'A')
		{
		System.out.print("no\n");
		}
		else
		{
		System.out.printf("%c\n",c.charAt(i));
		}
		}
		return 0;
	}
}

