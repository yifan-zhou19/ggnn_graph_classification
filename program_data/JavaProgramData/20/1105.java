package <missing>;

public class GlobalMembers
{
	public static int number(String a)
	{
		int i;
		int m = 0;
		for (i = 0; !a[i].equals(0);i++)
		{
			m++;
		}
		return m;
	}
	public static void change(String a, int m, String b)
	{
		int i;
		int j = 0;
		String c = new String(new char[13]);
		for (i = m + 1; !a[i].equals(0);i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, j, a[i]);
			j++;
			a[i] = null;
		}
		a += b;
		a += c;
		System.out.printf("%s\n",a);
	}
	public static void in(String a, String b)
	{
		int i;
		int j;
		int m;
		for (i = 0; !a[i].equals(0);i++)
		{
			m = 0;
			for (j = 0; !a[j].equals(0);j++)
			{
				if (a[i].compareTo(a[j]) >= 0)
				{
					m++;
				}
			}
			if (m == number(a))
			{
				change(a, i, b);
				break;
			}
		}
	}
	public static void remove(String a)
	{
		int i;
		for (i = 0; !a[i].equals(0);i++)
		{
			a[i] = null;
		}
	}
	public static int Main()
	{
		char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] substr = {0, '\0', '\0', '\0'};
		while (scanf("%s%s",str,substr) != EOF)
		{
			in(str, substr);
			remove(str);
			remove(substr);
		}
	}
}

