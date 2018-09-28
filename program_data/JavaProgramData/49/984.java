package <missing>;

public class GlobalMembers
{
	public static void strre(String a)
	{
		int i;
		int j;
		int k;
		char t;
		k = a.length();
		for (j = 0,i = k - 1;j < k / 2;j++,i--)
		{
			t = a[j];
			a[j] = a[i];
			a[i] = t;
		}
	}
	public static void Main()
	{
		int i;
		int j;
		int k = 0;
		int t;
		String a = new String(new char[600]);
		char[][] b = new char[500][500];
		String c = new String(new char[500]);
		String d = new String(new char[500]);
		a = new Scanner(System.in).nextLine();
		t = a.length();
		for (i = 0;i < t - 2;i++)
		{
			for (j = i + 1;j < t;j++)
			{
				c = a.substring(i, j + 1);
				c = tangible.StringFunctions.changeCharacter(c, j - i + 1, '\0');
				d = c;
				strre(d);
				if (!strcmp(c,d))
				{
					b[k] = c;
					k++;
				}
				b[k] = "\0";
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			for (j = 0;j < k - i - 1;j++)
			{
				if (String.valueOf(b[j]).length() > String.valueOf(b[j + 1]).length())
				{
					c = b[j];
					b[j] = b[j + 1];
					b[j + 1] = c;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",b[i]);
		}
	}
}

