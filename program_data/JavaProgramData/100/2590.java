package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] cs = new int[1000];
		int[] cs2 = new int[300];
		int n;
		int i;
		int t1 = 0;
		int t2 = 0;
		int t;
		int tp;
		int l;
		int m;
		String c = new String(new char[300]);
		String d = new String(new char[300]);
		String x = new String(new char[300]);
		c = new Scanner(System.in).nextLine();
		n = c.length();
		for (i = 0;i <= 300;i++)
		{
			cs[i] = 0;
			cs2[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
			{
				d = tangible.StringFunctions.changeCharacter(d, t1, c.charAt(i));
				t1 += 1;
			}
			if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
			{
				x = tangible.StringFunctions.changeCharacter(x, t2, c.charAt(i));
				t2 += 1;
			}
		}
		for (l = 0;l <= t1 - 1;l++)
		{
			for (m = 0;m <= t1 - 1;m++)
			{
				if (d.charAt(m) == d.charAt(l))
				{
					cs[l] += 1;
				}
			}
		}
		for (i = 0;i < t1 - 1;i++)
		{
			for (l = t1 - 1;l > i;l--)
			{
				if (d.charAt(l) < d.charAt(l - 1))
				{
					t = d.charAt(l);
					d = tangible.StringFunctions.changeCharacter(d, l, d.charAt(l - 1));
					d = tangible.StringFunctions.changeCharacter(d, l - 1, t);
					tp = cs[l];
					cs[l] = cs[l - 1];
					cs[l - 1] = tp;
				}
			}
		}
		for (i = 0;i < t1;i++)
		{
			for (l = i + 1;l < t1;l++)
			{
				if (d.charAt(l) == d.charAt(i))
				{
					cs[l] = 0;
				}
			}
		}
		for (i = 0;i < t1;i++)
		{
			if (cs[i] != 0)
			{
				System.out.printf("%c=%d\n",d.charAt(i),cs[i]);
			}
		}
		for (l = 0;l <= t2 - 1;l++)
		{
			for (m = 0;m <= t2 - 1;m++)
			{
				if (x.charAt(m) == x.charAt(l))
				{
					cs2[l] += 1;
				}
			}
		}
		for (i = 0;i < t2 - 1;i++)
		{
			for (l = t2 - 1;l > i;l--)
			{
				if (x.charAt(l) < x.charAt(l - 1))
				{
					t = x.charAt(l);
					x = tangible.StringFunctions.changeCharacter(x, l, x.charAt(l - 1));
					x = tangible.StringFunctions.changeCharacter(x, l - 1, t);
					tp = cs2[l];
					cs2[l] = cs2[l - 1];
					cs2[l - 1] = tp;
				}
			}
		}

		for (i = 0;i < t2;i++)
		{
			for (l = i + 1;l < t2;l++)
			{
				if (x.charAt(l) == x.charAt(i))
				{
					cs2[l] = 0;
				}
			}
		}
		for (i = 0;i < t2;i++)
		{
			if (cs2[i] != 0)
			{
				System.out.printf("%c=%d\n",x.charAt(i),cs2[i]);
			}

		}
		if (cs[0] == 0 && cs2[0] == 0)
		{
			System.out.print("No");
		}
		return 0;
	}




}

