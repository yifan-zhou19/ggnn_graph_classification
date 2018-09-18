package <missing>;

public class GlobalMembers
{
	public static void print(int a, int b, String d)
	{
		int i;
		for (i = a;i <= b;i++)
		{
			System.out.printf("%c",d[i]);
		}
	}
	public static int arrange(String a)
	{
		int i;
		int m = 0;
		int t = a[0];
		int l = a.length();
		for (i = 1;i < l;i++)
		{
			if (a[i].compareTo(t) > 0)
			{
				m = i;
				t = a[i];
			}
		}
		return m;
	}
	public static void Main()
	{
		String a = new String(new char[11]);
		String c = new String(new char[4]);
		while (scanf("%s%s",a,c) != EOF)
		{
			int l1 = a.length();
			int l2 = c.length();
			int m = arrange(a);
			print(0, m, a);
			print(0, l2 - 1, c);
			print(m + 1, l1 - 1, a);
			System.out.print("\n");
		}
	}
}
