package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c;
		String t = new String(new char[80]);
		char[][] a = new char[50][80];
		int i;
		int j;
		int n = 0;
		for (c = System.in.read();c != '\n';)
		{
			for (i = 0;c != ' ' && c != '\n';i++)
			{
				a[n][i] = c;
				c = System.in.read();
			}
			a[n][i + 1] = '\0';
			n++;
			if (c == ' ')
			{
				c = System.in.read();
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (String.valueOf(a[j]).length() > String.valueOf(a[i]).length())
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.printf("%s\n%s",a[0],a[n - 1]);
	}
}
