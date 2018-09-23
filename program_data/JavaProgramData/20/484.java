package <missing>;

public class GlobalMembers
{
	public static char max(String ch, int len)
	{
		int i;
		char t;
		for (i = 0;i < len - 1;i++)
		{
			if (ch[i].compareTo(ch[i + 1]) > 0)
			{
				t = ch[i];
				ch[i] = ch[i + 1];
				ch[i + 1] = t;
			}
		}
		return ch[len - 1];
	}
	public static int Main()
	{
		String str = new String(new char[20]);
		String sub = new String(new char[4]);
		String x = new String(new char[20]);
		char m;
		int len;
		int i;
		while (scanf("%s %s",str,sub) != EOF)
		{
			len = str.length();
			x = str;
			m = max(x, len);
			i = 0;
			do
			{
				System.out.printf("%c",str.charAt(i));
				i++;
			} while (str.charAt(i) != m);
			System.out.printf("%c",str.charAt(i));
			System.out.printf("%s",sub);
			for (++i;i < len;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
	System.out.print("\n");
		}
		return 0;
	}
}
