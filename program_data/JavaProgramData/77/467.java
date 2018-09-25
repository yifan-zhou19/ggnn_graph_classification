package <missing>;

public class GlobalMembers
{
	public static char c1;
	public static char c2;
	public static int num;
	public static int k = 0;
	public static int[][] s = new int[1000][2];
	public static int Main()
	{
		int i;
		int j;
		int temp;
		void f(char str[1000]);
		String c = new String(new char[1000]);
		c = new Scanner(System.in).nextLine();
		c1 = c.charAt(0);
		num = c.length();
		for (i = 1;i < num;i++)
		{
			if (c.charAt(i) != c1)
			{
				c2 = c.charAt(i);
				break;
			}
		}
		f(c);
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k - 1 - i;j++)
			{
				if (s[j][1] > s[j + 1][1])
				{
					temp = s[j + 1][1];
					s[j + 1][1] = s[j][1];
					s[j][1] = temp;
					temp = s[j + 1][0];
					s[j + 1][0] = s[j][0];
					s[j][0] = temp;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d %d\n", s[i][0], s[i][1]);
		}
		System.out.print("\n");
		return 0;
	}
	public static void f(String str)
	{
		int i;
		int j;
		for (i = 0;i < num - 1;i++)
		{
			if (str[i].equals(c1))
			{
			for (j = i + 1;j < num;j++)
			{
				if (str[j].equals(c1))
				{
					break;
				}
				if (str[j].equals(c2))
				{
					s[k][0] = i;
					s[k++][1] = j;
					str[i] = ' ';
					str[j] = ' ';
					break;
				}
			}
			}
		}
		if (k * 2 < num)
		{
			f(str);
		}
	}

}
