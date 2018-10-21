package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10]);
		String b = new String(new char[10]);
		String c = new String(new char[10]);
		String d = new String(new char[10]);
		String e = new String(new char[10]);
		String f = new String(new char[10]);
		void reverse(char x[10]);
		void putstr(char y[10]);
		reverse(gets(a));
		reverse(gets(b));
		reverse(gets(c));
		reverse(gets(d));
		reverse(gets(e));
		reverse(gets(f));
		putstr(a);
		putstr(b);
		putstr(c);
		putstr(d);
		putstr(e);
		putstr(f);
	}

	public static void reverse(String x)
	{
		int length;
		int i;
		int j;
		int t;
		char[] p = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		length = x.length();
		if (x[0].equals(45))
		{
			if (x[1].equals(48))
			{
				x[0] = 48;
				x[1] = '\0';
			}
			else
			{
			for (i = length - 1,j = 1;i >= 1;i--,j++)
			{
					p[j] = x[i];
			}
			for (i = 1;i < j;i++)
			{
				if (p[i] != 48)
				{
					break;
				}
			}
			for (t = 1;i < j;i++,t++)
			{
				x[t] = p[i];
			}
			x[t] = '\0';
			}
		}
		if (!x[0].equals(45))
		{
			if (x[0].equals(48))
			{
				x[0] = 48;
				x[1] = '\0';
			}
			else
			{
			for (i = length - 1,j = 0;i >= 0;i--,j++)
			{
					p[j] = x[i];
			}
			for (i = 0;i < j;i++)
			{
				if (p[i] != 48)
				{
					break;
				}
			}
			for (t = 0;i < j;i++,t++)
			{
				x[t] = p[i];
			}
			x[t] = '\0';
			}
		}
	}

	public static void putstr(String y)
	{
		System.out.println(y);
	}



}
