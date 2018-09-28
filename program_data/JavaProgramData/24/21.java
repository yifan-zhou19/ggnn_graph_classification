package <missing>;

public class GlobalMembers
{
	public static int len(String s)
	{
		int l;
		int i;
		l = 0;
		for (i = 0;i < 100;i++)
		{
			if (((s[i].compareTo(96) > 0) && (s[i].compareTo(123) < 0)) || ((s[i].compareTo(64) > 0) && (s[i].compareTo(91) < 0)))
			{
				l++;
			}
		}
		return l;
	}
	public static void Main()
	{
		int i;
		int p;
		int n;
		int maxlen;
		int minlen;
		int maxnum;
		int minnum;
		String s = new String(new char[1000]);
		char[][] c = new char[50][100];
		for (p = 0;p < 50;p++)
		{
			for (i = 0;i < 100;i++)
			{
				c[p][i] = 0;
			}
		}
		for (i = 0;i < 1000;i++)
		{
			s = s.substring(0, i);
		}
		s = new Scanner(System.in).nextLine();
		i = 0;
		do
		{
			c[0][i] = s.charAt(i);
			i++;
		}while (((s.charAt(i) > 96) && (s.charAt(i) < 123)) || ((s.charAt(i)>64) && (s.charAt(i) < 91)));
		for (n = 1;n < 50;n++)
		{
			i++;
			p = 0;
			do
			{
				c[n][p] = s.charAt(i);
				p++;
				i++;
			}while (((s.charAt(i) > 96) && (s.charAt(i) < 123)) || ((s.charAt(i)>64) && (s.charAt(i) < 91)));
		}
		maxlen = 0;
		minlen = 100;
		for (n = 0;n < 50;n++)
		{
			if (c[n][0] > 0)
			{
			if (len(c[n]) > maxlen)
			{
				maxlen = len(c[n]);
				maxnum = n;
			}
			if (len(c[n]) < minlen)
			{
				minlen = len(c[n]);
				minnum = n;
			}
			}
		}
		System.out.printf("%s\n%s",c[maxnum],c[minnum]);
	}
}
