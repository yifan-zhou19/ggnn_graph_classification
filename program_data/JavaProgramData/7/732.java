package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		String w = new String(new char[100]);
		String t = new String(new char[100]);
		w = new Scanner(System.in).nextLine();
		s = new Scanner(System.in).nextLine();
		t = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int p;
		int q;
		int f = 1;
		int n;
		int m;
		int e;
		n = w.length();
		m = s.length();
		for (i = j = 0;i < n;i++)
		{
				k = i;
				p = i;
				q = j;
			if (w.charAt(p) == s.charAt(q))
			{
				for (q = 0;q < m;q++)
				{
					if (w.charAt(p) != s.charAt(q))
					{
						f = 0;
					}
					p++;
				}
				if (f == 1)
				{
					for (e = 0;e < k;e++)
					{
									System.out.printf("%c",w.charAt(e));
					}
					System.out.printf("%s",t);
					for (e = k + m;e < n;e++)
					{
						System.out.printf("%c",w.charAt(e));
					}
					return 0;
				}
				f = 1;
			}
		}
		System.out.printf("%s",w);
		return 0;
	}
}
