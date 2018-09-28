package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[100]);
		int i;
		int k;
		int j;
		int b = 0;
		int n;
		int m = 0;
		c = new Scanner(System.in).nextLine();
		n = c.length();
		for (i = n - 1;i >= 0;i--)
		{
			for (j = 1;j <= i;j++)
			{
				if (c.charAt(i - j) == ' ')
				{
					for (k = i - j + 1;k <= i;k++)
					{
					System.out.printf("%c",c.charAt(k));
					}
					System.out.print(" ");
					m = i;
					b = j;
					break;
				}
			}
			i = i - j;
		}
		if (m - b <= 0)
		{
			for (k = 0;k < n;k++)
			{
				System.out.printf("%c",c.charAt(k));
			}
		}
		else
		{
		for (k = 0;k < m - b;k++)
		{
			System.out.printf("%c",c.charAt(k));
		}
		}
	}

}
