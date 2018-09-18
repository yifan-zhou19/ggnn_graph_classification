package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char[][] c = new char[100][100];
		int i;
		int len;
		int n = 0;
		int j = 0;
		int z = 0;
		int len1;
		int len3;
		int d;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) != ' ')
			{
				c[n][j] = s.charAt(i);
				j++;
			}
			else
			{
				c[n][j] = '\0';
				n++;
				j = 0;
			}
		}
		c[n][j] = '\0';
		len1 = a.length();
		for (i = 0;i <= n;i++)
		{
			z = 0;
			d = 0;
			len3 = String.valueOf(c[i]).length();
			for (j = 0;j < len3 && j < len1;j++)
			{
				if (c[i][j] == a.charAt(z))
				{
					d++;
					z++;
				}
			}
				if (d == len1)
				{
					c[i] = b;
				}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s ",c[i]);
		}
		System.out.printf("%s",c[n]);
		return 0;
	}

}
