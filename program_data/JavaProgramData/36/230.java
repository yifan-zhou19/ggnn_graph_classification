package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		String ar = new String(new char[1000]);
		String br = new String(new char[1000]);
		int i;
		int j;
		int k;
		int l;
		int ll;
		int w;
		int t;
		char ch;
		int[] c = new int[1000];
		int[] d = new int[1000];
		int[] cr = new int[1000];
		int[] dr = new int[1000];
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
		k = 0;
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (c[i] == 1)
			{
				continue;
			}
			for (j = i;j < l;j++)
			{
				if (c[j] == 1)
				{
					continue;
				}
				if (a.charAt(j) == a.charAt(i))
				{
					cr[k]++;
					ar = tangible.StringFunctions.changeCharacter(ar, k, a.charAt(j));
					k++;
				}
			}
			if (cr[k] != 0)
			{
				k++;
			}
		}
		k = 0;
		l = b.length();
		for (i = 0;i < l;i++)
		{
			if (d[i] == 1)
			{
				continue;
			}
			for (j = i;j < l;j++)
			{
				if (d[j] == 1)
				{
					continue;
				}
				if (a.charAt(j) == a.charAt(i))
				{
					dr[k]++;
					br = tangible.StringFunctions.changeCharacter(br, k, b.charAt(j));
					k++;
				}
			}
			if (dr[k] != 0)
			{
				k++;
			}
		}
		for (j = 0;j < l - 1;j++)
		{
			for (i = 0;i < l - 1 - j;i++)
			{
				if (ar.charAt(i) < ar.charAt(i + 1))
				{
					ch = ar.charAt(i);
					ar = tangible.StringFunctions.changeCharacter(ar, i, ar.charAt(i + 1));
					ar = tangible.StringFunctions.changeCharacter(ar, i + 1, ch);
					t = cr[i];
					cr[i] = cr[i + 1];
					cr[i + 1] = t;
				}
			}
		}
		ll = a.length();
		for (j = 0;j < ll - 1;j++)
		{
			for (i = 0;i < ll - 1 - j;i++)
			{
				if (br.charAt(i) < br.charAt(i + 1))
				{
					ch = br.charAt(i);
					br = tangible.StringFunctions.changeCharacter(br, i, br.charAt(i + 1));
					br = tangible.StringFunctions.changeCharacter(br, i + 1, ch);
					t = dr[i];
					dr[i] = dr[i + 1];
					dr[i + 1] = t;
				}
			}
		}
		if (l != ll)
		{
			w = 0;
		}
		else
		{
			for (i = 0;i < l;i++)
			{
				if (ar.charAt(i) == br.charAt(i) && cr[i] == dr[i])
				{
					w = 1;
				}
				else
				{
					w = 0;
					break;
				}
			}
		}
		if (w != 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
	}
}

