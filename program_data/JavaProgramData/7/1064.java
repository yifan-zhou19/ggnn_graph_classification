package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t;
		int x;
		int m;
		int n;
		String s = new String(new char[300]);
		String sub = new String(new char[300]);
		String re = new String(new char[300]);
		s = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		re = new Scanner(System.in).nextLine();
		n = s.length();
		m = sub.length();
		x = re.length();
		for (i = 0;i <= n - m;i++)
		{
			for (j = 0,t = i;j < m;j++)
			{
				if (s.charAt(t) == sub.charAt(j))
				{
					t++;
				}
				else
				{
					break;
				}
			}
			if (j == m)
			{
				break;
			}
		}
		if (i == n - m + 1)
		{
			;
		}
		else
		{
			for (t = i + x;t < n + x - m;t++)
			{
				s = tangible.StringFunctions.changeCharacter(s, t, s.charAt(t - x + m));
			}
			for (j = i,t = 0;j < i + x;j++,t++)
			{
				s = tangible.StringFunctions.changeCharacter(s, j, re.charAt(t));
			}
		}
		System.out.println(s);
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}

}

