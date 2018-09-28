package <missing>;

public class GlobalMembers
{
	public static void f(String s, int n, int m)
	{
		int i;
		int b;
		int g;
		String s2;
		if (n == 2)
		{
			System.out.printf("%d %d\n",m,m + 1);
		}
		else
		{
			b = 0;
			g = 0;
			for (i = 0;;i++)
			{
				if (s[i].equals(s[0]))
				{
					b++;
				}
				else
				{
					g++;
				}
				if (b == g)
				{
					break;
				}
			}
			if (i == n - 1)
			{
				s2 = s + 1;
				f(s2, n - 2, m + 1);
				System.out.printf("%d %d\n",m,m + n - 1);
			}
			else
			{
				f(s, i + 1, m);
				s2 = s + i + 1;
				f(s2, n - i - 1, m + i + 1);
			}
		}
	}

	public static void Main()
	{
		String s = new String(new char[100]);
		int n;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		f(s, n, 0);
	}
}
