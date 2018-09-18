package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String s1 = new String(new char[15]);
	String s2 = new String(new char[4]);
	int m;
	int max = char s1.charAt(15);
	void cut(char s1.charAt(15),int m,char s2.charAt(3));
	while (scanf("%s%s",s1,s2) != EOF)
	{
		m = max(s1);
		cut(s1, m, s2);
		System.out.print('\n');
	}
	}

	public static int max(String s1)
	{
		int i;
		int n;
		int m;
		char max;
		max = s1[0];
		n = s1.length();
		for (i = 0;i < n - 1;i++)
		{
		if (s1[i + 1].compareTo(max) > 0)
		{
			max = s1[i + 1];
			m = i + 1;
		}
		}
		return (m);
	}

	public static void cut(String s1, int m, String s2)
	{
		int i;
		int j;
		int n;
		n = s1.length();
		for (i = n + 2;i > m;i--)
		{
		s1[i] = s1[i - 3];
		}
		for (i = m + 1;i < m + 4;i++)
		{
		s1[i] = s2[i - m - 1];
		}
		for (i = 0;i < n + 3;i++)
		{
		System.out.printf("%c",s1[i]);
		}
	}

}
