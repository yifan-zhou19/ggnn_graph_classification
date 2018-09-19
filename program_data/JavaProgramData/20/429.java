package <missing>;

public class GlobalMembers
{
	public static void dd(String a, String b)
	{
		int i;
		int j = 0;
		int m;
		int max;
		m = a.length();
		max = a[0];
		for (i = 0;i < m;i++)
		{
			if (a[i].compareTo(max) > 0)
			{
				max = a[i];
				j = i;
			}
		}
		for (i = m;i > j;i--)
		{
			a[i + 3] = a[i];
		}
		a[j + 1] = b[0];
		a[j + 2] = b[1];
		a[j + 3] = b[2];
		for (i = 0;i < m + 3;i++)
		{
			System.out.printf("%c",a[i]);
		}
		System.out.print("\n");
	}
	public static void Main()
	{
		String a = new String(new char[20]);
		String b = new String(new char[5]);

		while (scanf("%s%s",a,b) != EOF)
		{
		dd(a, b);
		}

	}

}
