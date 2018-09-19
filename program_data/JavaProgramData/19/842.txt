package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[20][20];
		String d = new String(new char[100]);
		String b = new String(new char[20]);
		String c = new String(new char[20]);
		int n;
		int j = 0;
		int k = 0;
		int flag = 0;
		int x;
		d = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		x = c.length();
		for (;x < 20;x++)
		{
			c = tangible.StringFunctions.changeCharacter(c, x, '\0');
		}
		n = d.length();
		for (int i = 0;i < n;i++)
		{
			if (d.charAt(i) != ' ')
			{
				a[j][k++] = d.charAt(i);
			}
			else
			{
				for (;k < 20;)
				{
					a[j][k++] = '\0';
				}
				flag = flag + 1;
				j++;
				k = 0;
			}
		}
		for (int m = 0;m < 20;m++)
		{
			if (a[flag][m] == d.charAt(n - 1))
			{
				k = m + 1;
			}
		}
		for (;k < 20;)
		{
			a[flag][k++] = '\0';
		}
		for (int p = 0;p < 20;p++)
		{
			if (strcmp(a[p],b) == 0)
			{
				a[p] = c.substring(0, 20);
			}
		}
		System.out.printf("%s",a[0]);
		for (int l = 1;l < flag + 1;l++)
		{
			System.out.printf(" %s",a[l]);
		}
		return 0;
	}
}

