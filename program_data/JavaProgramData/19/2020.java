package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[2000]);
	public static String sub = new String(new char[2000]);
	public static int[] b = new int[2000];
	public static int[] jianyan = new int[1000];
	public static int Main()
	{
		a = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		int i;
		int j = 0;
		int v = 0;
		int count_jianyan = 0;
		int l = a.length();
		int l_sub = sub.length();
		for (int r = 0;r < l;r++)
		{
			if (a.charAt(r) == ' ')
			{
				jianyan[count_jianyan] = r;
				count_jianyan++;
			}
		}
				for (int u = 0;u < l_sub;u++)
				{
				if (a.charAt(u) == sub.charAt(u))
				{
					b[0]++;
				}
				}
		while (v < count_jianyan)
		{
			i = jianyan[v] + 1;
			for (j = 0;j < l_sub;j++)
			{
				if (a.charAt(i + j) == sub.charAt(j))
				{
					b[i]++;
				}
			}
			v++;
		}
		int k = 0;
		int[] w = new int[1000];
		int count = 0;
		for (int gl = 0;gl < 1000;gl++)
		{
			w[gl] = 999;
		}
		for (k = 0;k < 2000;k++)
		{
			if (b[k] == l_sub)
			{
				w[count] = k;
				count++;
			}
		}
		String c = new String(new char[300]);
		c = new Scanner(System.in).nextLine();
		int q = 0;
		int m = 0;
		if (count != 0)
		{
		while (q < l)
		{
			if (q == w[m])
			{
				System.out.printf("%s",c);
				q += l_sub;
				m++;
			}
			if (q != l)
			{
				System.out.printf("%c",a.charAt(q));
			}
			q++;
		}
		}
		else if (count == 0)
		{
			System.out.println(a);
		}
		return 0;
	}
}
