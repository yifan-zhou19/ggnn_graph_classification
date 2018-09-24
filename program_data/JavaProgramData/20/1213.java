package <missing>;

public class GlobalMembers
{
	public static int max(String a)
	{
		int i;
		int m = 0;
		for (i = 1; !a[i].equals(0);i++)
		{
			if (a[m].compareTo(a[i]) < 0)
			{
				m = i;
			}
			else
			{
				continue;
			}
		}
		return m;
	}
	public static void cao(String a, String b)
	{
		int i;
		int m = 0;
		char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		for (i = max(a) + 1; !a[i].equals(0);i++)
		{
			c[m] = a[i];
			m++;
			a[i] = null;
		}
		a += b;
		a += c;
	}
	public static int Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] b = {0, '\0', '\0', '\0'};
		int i;
		while (scanf("%s%s",a,b) != EOF)
		{
			cao(a, b);
			System.out.println(a);
			for (i = 0;i < 12;i++)
			{
				a[i] = 0;
			}
			for (i = 0;i < 4;i++)
			{
				b[i] = 0;
			}
		}
	}
}
