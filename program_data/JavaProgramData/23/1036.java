package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[100][100];
		String str = new String(new char[100]);
		int c = 0;
		int i;
		int t = 0;
		str = new Scanner(System.in).nextLine();
		for (i = 0;i <= str.length();i++)
		{
			if (str.charAt(i) != ' ')
			{
				a[c][t] = str.charAt(i);
				t += 1;
			}
			else
			{
				a[c][i] = '\0';
				c += 1;
				t = 0;
			}
		}

		while (c > 0)
		{
			i = 0;
			while (a[c][i] != '\0')
			{
				System.out.printf("%c",a[c][i]);
				i += 1;
			}
			System.out.print(" ");
			c -= 1;
		}
		i = 0;
		while (a[0][i] != '\0')
		{
			System.out.printf("%c",a[0][i]);
			i += 1;
		}
	}



}
