package <missing>;

public class GlobalMembers
{
	public static int max(String a)
	{
		int i;
		int n;
		int m;
		n = a.length();
		m = 0;
		for (i = 0;i < n - 1;i++)
		{
			if (a[m].compareTo(a[i + 1]) < 0)
			{
				m = i + 1;
			}
		}
			return (m);
	}

	public static void Main()
	{
		int i;
		int len;
		int m;
		String a = new String(new char[11]);
		String b = new String(new char[4]);
		while (scanf("%s%s",a,b) != EOF)
		{
			len = a.length();
			m = max(a);
			for (i = 0;i <= m;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			for (i = 0;i < 3;i++)
			{
				System.out.printf("%c",b.charAt(i));
			}
			for (i = m + 1;i < len;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			System.out.print("\n");
		}

	}


}
