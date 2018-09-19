package <missing>;

public class GlobalMembers
{
	public static void insert(String a)
	{
		char m;
		char c;
		int i;
		int l = 0;
		int j;
		int k;
		j = a.length();
		if (a.length() == 0 || a[0].compareTo(33) < 0 || a[0].compareTo(126) > 0)
		{
			return;
		}
		m = 0;
		for (i = 0;i < j - 4;i++)
		{
			if (m < a[i])
			{
				m = a[i];
				l = i + 1;
			}
		}
			for (i = 0;i < 3;i++)
			{
				c = a[j - 3 + i];
				for (k = j - 3 + i;k > l + i;k--)
				{
					a[k] = a[k - 1];
				}
				a[l + i] = c;
			}
			for (i = 0;i < j - 2;i++)
			{
				System.out.printf("%c",a[i]);
			}
				System.out.printf("%c\n",a[j - 2]);
	}
	public static void Main()
	{
		char[][] b = new char[50][15];
		int l = 0;
		int i;
		do
		{
			b[l] = new Scanner(System.in).nextLine();
			if (String.valueOf(b[l]).length() == 0 || b[l][0] < 33 || b[l][0]>126)
			{
				break;
			}
			l = l + 1;
		}while (b[l - 1][0] != '\0');
		for (i = 0;i < l;i++)
		{
			insert(b[i]);
		}
	}

}
