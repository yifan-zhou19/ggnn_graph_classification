package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[100]);
		char[][] a = new char[100][100];
		int i;
		int k;
		int j;
		int n;
		int m = -1;
		c = new Scanner(System.in).nextLine();
		n = c.length();
		int b = n;
		for (i = n - 1;i < n && i >= 0;i--)
		{
			if (c.charAt(i) == ' ')
			{
				m = m + 1;
			for (j = 0;j < b - i - 1;j++)
			{
				a[m][j] = c.charAt(i + 1 + j);

			}
			a[m][j] = '\0';
			System.out.printf("%s ",a[m]);
			b = i;
			}
		}
		for (j = 0;j < b;j++)
		{
			a[m + 1][j] = c.charAt(j);
		}
		System.out.printf("%s",a[m + 1]);
	}


}
