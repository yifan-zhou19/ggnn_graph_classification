package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char[][] w = new char[20][20];
		int n;
		int t;
		int i;
		int j;
		int[] m = new int[100];
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n = s.length();
		m[0] = -1;
		t = 1;
		for (i = 0;i < n;i++)
		{
			if (s.charAt(i) == ' ')
			{
				m[t] = i;
				t += 1;
			}
		}
		m[t] = n;
		for (i = 0;i < t;i++)
		{
			for (j = m[i] + 1;j < m[i + 1];j++)
			{
				w[i][j - m[i] - 1] = s.charAt(j);
			}
			w[i][m[i + 1] - m[i] - 1] = '\0';
		}
		for (i = 0;i < t;i++)
		{
			if (strcmp(w[i],a) == 0)
			{
				w[i] = b;
			}
		}
		System.out.printf("%s",w[0]);
		for (i = 1;i < t;i++)
		{
			System.out.printf(" %s",w[i]);
		}
	}
}
