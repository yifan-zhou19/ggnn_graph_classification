package <missing>;

public class GlobalMembers
{
	public static int num(String st)
	{
		int i;
		int l;
		char t;
		t = st[0];
		l = st.length();
		for (i = 1;i < l;i++)
		{
			if (st[i].compareTo(t) > 0)
			{
				t = st[i];
			}
		}
		for (i = 0;i < l;i++)
		{
			if (st[i].equals(t))
			{
				return (i + 1);
				break;
			}
		}
	}
	public static void conv1(String st, int n)
	{
		st[n] = '\0';
	}
	public static void conv2(String st, int n)
	{
		int l;
		int i;
		l = st.length();
		for (i = 0;i < l - n;i++)
		{
			st[i] = st[i + n];
		}
		st[l - n] = '\0';
	}
	public static void result(String st1, String st2, String st3)
	{
		 st1 += st2;
		 st1 += st3;
		 System.out.println(st1);
	}
	public static void Main()
	{
		String str = new String(new char[20]);
		String substr = new String(new char[4]);
		String str1 = new String(new char[20]);
		String str3 = new String(new char[20]);
		while (scanf("%s%s",str,substr) != EOF)
		{
			int n;
			n = num(str);
			str3 = str;
			conv1(str, n);
			conv2(str3, n);
			result(str, substr, str3);
		}
	}



}
