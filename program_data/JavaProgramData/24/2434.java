package <missing>;

public class GlobalMembers
{
	public static void f(String c, String a, int a1, int a2)
	{
		int i;
		for (i = a1;i <= a2;i++)
		{
			c[i - a1] = a[i];
		}
	} //copy
	public static int Main()
	{
		int n = 0;
		int i;
		int max;
		int min;
		int[] l = new int[200];
		int length;
		int[] d = new int[201];
		String a = new String(new char[10000]);
		char[][] c =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[] maxc = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] minc = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		a = new Scanner(System.in).nextLine();
		length = a.length();
		for (i = 1;i < length;i++)
		{
			if ((a.charAt(i) == ' ' || a.charAt(i) == ',') && a.charAt(i - 1) != ' ' && a.charAt(i - 1) != ',')
			{
				d[++n] = i;
			}
		} //n+1 ge danci qie ge d1-dn
		if (n == 0)
		{
			f(c[0], a, 0, length - 1);
		}
		else
		{
			f(c[0], a, 0, d[1] - 1);
			for (i = 1;i < n;i++)
			{
				f(c[i], a, d[i] + 1, d[i + 1] - 1);
			}
			f(c[n], a, d[n] + 1, length);
		}

		for (i = 0;i <= n;i++)
		{
			l[i] = String.valueOf(c[i]).length();
		}
		max = l[0];
		min = l[0];
		maxc = c[0];
		minc = c[0];
		for (i = 1;i <= n;i++)
		{
			if (l[i] > max)
			{
				max = l[i];
				maxc = c[i];
			}
			else if (l[i] < min)
			{
				min = l[i];
				minc = c[i];
			}
		}
		System.out.printf("%s\n%s\n",maxc,minc);
	}
}
