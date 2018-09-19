package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int i;
		int j;
		int k;
		int n;
		int[][] s = new int[26][999];
		int[] p = new int[26];
		String b = new String(new char[26]);
		char c;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < m; i++)
		{
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			n = b.length();
			for (k = 0; k < n; k++)
			{
				a = b.charAt(k) - 'A';
				s[a][p[a]] = j;
				p[a]++;
			}
		}
		j = 0;
		for (i = 1; i < 26; i++)
		{
			if (p[j] < p[i])
			{
				j = i;
			}
		}
		c = 'A' + j;
		System.out.print(c);
		System.out.print("\n");
		System.out.print(p[j]);
		System.out.print("\n");
		for (i = 0; ; i++)
		{
			if (s[j][i] != 0)
			{
				System.out.print(s[j][i]);
				System.out.print("\n");
			}
			else
			{
				break;
			}
		}
		return 0;
	}
}

