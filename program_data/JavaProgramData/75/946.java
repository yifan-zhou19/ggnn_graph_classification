package <missing>;

public class GlobalMembers
{
	public static int tr(String a, int[] b)
	{
		int l;
		int i;
		int j = 1;
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (!a[i].equals(','))
			{
				b[j] = b[j] * 10 + a[i] - '0';
			}
			else
			{
				j++;
			}
		}
		return (j - 1);
	}
	public static void Main()
	{
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
		int i;
		int j;
		int k;
		int n;
		int l = 0;
		int[] c = new int[5000];
		int[] d = new int[5000];
		int[] m = new int[1001];
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n = tr(a, c);
		n = tr(b, d);
		for (i = 1;i <= n + 1;i++)
		{
			for (j = c[i];j < d[i];j++)
			{
				m[j]++;
			}
		}
		for (i = 1;i <= 1000;i++)
		{
			if (l < m[i])
			{
				l = m[i];
			}
		}
		System.out.printf("%d %d",n + 1,l);
	}
}
