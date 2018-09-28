package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int l;
		int t = 0;
		int i;
		int j;
		int[] m = new int[100];
		int n;
		String a = new String(new char[1000]);
		char[][] b = new char[1000][51];
		String ab = new String(new char[51]);
		a = new Scanner(System.in).nextLine();
		l = a.length();
		m[0] = 0;
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) != ' ')
			{
				b[t][m[t]] = a.charAt(i);
				m[t]++;
				b[t][m[t]] = '\0';
			}
			if (a.charAt(i) == ' ')
			{
				t++;
				m[t] = 0;
			}
		}
		for (i = 1;i <= t;i++)
		{
		for (j = 0;j <= t - i;j++)
		{
			if (m[j] < m[j + 1])
			{
				n = m[j + 1];
				m[j + 1] = m[j];
				m[j] = n;
				ab = b[j];
				b[j] = b[j + 1];
				b[j + 1] = ab;
			}
		}
		}
		System.out.println(b[0]);
	for (i = 1;i <= t;i++)
	{
		for (j = 0;j <= t - i;j++)
		{
			if (m[j] > m[j + 1])
			{
				n = m[j + 1];
				m[j + 1] = m[j];
				m[j] = n;
				ab = b[j];
				b[j] = b[j + 1];
				b[j + 1] = ab;
			}
		}
	}
		System.out.println(b[0]);
	}
}
