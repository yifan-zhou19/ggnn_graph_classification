package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][256];
		String num = new String(new char[10]);
		int i;
		int j;
		int len;
		int n;
		num = new Scanner(System.in).nextLine();
		n = Integer.parseInt(num);
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			len = String.valueOf(a[i]).length();
			for (j = 0;j <= len;j++)
			{
				if (a[i][j] == 'A')
				{
					a[i][j] = 't';
				}
				if (a[i][j] == 'T')
				{
					a[i][j] = 'a';
				}
				if (a[i][j] == 'G')
				{
					a[i][j] = 'c';
				}
				if (a[i][j] == 'C')
				{
					a[i][j] = 'g';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			len = String.valueOf(a[i]).length();
			for (j = 0;j <= len;j++)
			{
				if (a[i][j] == 'a')
				{
					a[i][j] = 'A';
				}
				if (a[i][j] == 't')
				{
					a[i][j] = 'T';
				}
				if (a[i][j] == 'c')
				{
					a[i][j] = 'C';
				}
				if (a[i][j] == 'g')
				{
					a[i][j] = 'G';
				}
			}
			System.out.printf("%s\n",a[i]);
		}
		return 0;
	}
}
