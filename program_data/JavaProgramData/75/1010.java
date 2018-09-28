package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t;
		int[] c = new int[1000];
		int[] d = new int[1000];
		int[] e = new int[1000];
		int s;
		int h;
		int p;
		int q;
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		t = a.length();
		q = b.length();
		s = 0;
		h = 0;
		for (i = 0; i <= t; i++)
		{
			if (a.charAt(i) == ',' || i == t)
			{
				p = 0;
				for (j = h; j < i; j++)
				{
					p = p * 10 + a.charAt(j) - '0';
					d[s] = d[s] + p;
				}
				s++;
				h = i + 1;
			}
		}
		s = 0;
		h = 0;
		for (i = 0; i <= q; i++)
		{
			if (b.charAt(i) == ',' || i == q)
			{
				p = 0;
				for (j = h; j < i; j++)
				{
					p = p * 10 + b.charAt(j) - '0';
					e[s] = e[s] + p;
				}
				h = i + 1;
				s++;
			}
		}
		System.out.print(s);
		System.out.print(" ");
		for (t = 1; t <= 1000; t++)
		{
			for (j = 0; j < s; j++)
			{
				if (d[j] <= t != 0 && t < e[j])
				{
					c[t - 1]++;
				}
			}
		}
		j = 0;
		for (t = 0; t < 1000; t++)
		{
			if (j < c[t])
			{
				j = c[t];
			}
		}
		System.out.print(j);
		return 0;
	}
}
