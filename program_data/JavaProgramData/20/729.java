package <missing>;

public class GlobalMembers
{
	public static void print(int a, int b, String c)
	{
		int i;
	for (i = a;i <= b;i++)
	{
	System.out.printf("%c",c[i]);
	}
	}
	public static int arrange(String a)
	{
		int m = 0;
		int i;
		int n;
		n = a.length();
		int t = a[0];
			for (i = 0;i < n;i++)
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
			int m;
			m = arrange(a);
			print(0, m, a);
			print(0, l2 - 1, c);
			print(m + 1, l1 - 1, a);
			System.out.print("\n");

		}
	}
}
