package <missing>;

public class GlobalMembers
{
	public static void swap(String a, int n)
	{
		int i;
		int j;
		char t;
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n - j - 1;i++)
			{
			if (a[i].compareTo(a[i + 1]) < 0)
			{
				t = a[i];
				a[i] = a[i + 1];
				a[i + 1] = t;
			}
			}
		}

	}
	public static void Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		while (scanf("%s%s",s1,s2) != EOF)
		{

			String m = new String(new char[100]);
			m = s1;
			int l = m.length();
			swap(m, l);
			int i;
			int j;
			int k;
			for (i = 0;i < l;i++)
			{
			if (s1.charAt(i) == m.charAt(0))
			{
				j = i;
				break;
			}
			}
				for (k = 0;k <= j;k++)
				{
					System.out.printf("%c",s1.charAt(k));
				}
				System.out.printf("%s",s2);
				for (i = j + 1;i < l;i++)
				{
					System.out.printf("%c",s1.charAt(i));
				}
				System.out.print("\n");
		}
	}
}
