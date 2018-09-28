package <missing>;

public class GlobalMembers
{
	public static void Loop(String s, int n)
	{
		int i;
		int p;
		int q;
		for (i = 1;i < n;i++)
		{
			if (!s[i].equals(s[0]) && s[i] != null)
			{
				p = i;
				break;
			}
		}
		if (p == n - 1)
		{
			System.out.print("0 ");
			System.out.print(n - 1);
			System.out.print("\n");
			return;
		}
		for (i = p;i >= 0;i--)
		{
			if (s[i].equals(s[0]))
			{
				q = i;
				break;
			}
		}
		System.out.print(q);
		System.out.print(" ");
		System.out.print(p);
		System.out.print("\n");
		s[q] = s[p] = null;
		Loop(s, n);
	}
	public static int Main()
	{
		int n;
		int i;
		String s = new String(new char[MAXN]);
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = s.length();
		Loop(s, n);
		return 0;
	}
}

