package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void huiwen(char c[1000],int);
		int i;
		int n;
		String c = new String(new char[1000]);
		c = new Scanner(System.in).nextLine();
		for (i = 2;i <= c.length();i++)
		{
			huiwen(c, i);
		}

	}

	public static void huiwen(String c, int i)
	{
		int j;
		int l;
		int flag = 0;
		int m;
		String p = c;
		for (j = 0;j <= c.length() - i;j++)
		{
			for (l = 0;l <= i / 2;l++)
			{
				if (*(p.Substring(j) + l) != *(p.Substring(j) + i - l - 1))
				{
					flag = 1;
					break;
				}
			}
				if (flag == 0)
				{
					for (m = 0;m < i;m++)
					{
						System.out.printf("%c",*(p.Substring(j) + m));
					}
					System.out.print("\n");
				}
			flag = 0;
		}
	}

}
