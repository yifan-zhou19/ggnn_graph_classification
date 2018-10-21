package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[30]);
		int i;
		int n;
		int shi;
		int zhong;
		int m;
		int l;
		c = new Scanner(System.in).nextLine();
		n = c.length();
		for (i = 0;i < n;i++)
		{
			if (c.charAt(i) <= '9' && c.charAt(i) >= '0')
			{
				shi = i;
				for (l = i;l < n;l++)
				{
					if (c.charAt(l) > '9' || c.charAt(l) < '0')
					{
						zhong = l - 1;
						break;
					}
					if (l == n - 1)
					{
						zhong = n - 1;
					}
				}
				for (m = shi;m < zhong;m++)
				{
					System.out.printf("%c",c.charAt(m));
				}
				System.out.printf("%c\n",c.charAt(zhong));
				i = zhong;
			}
		}
		return 0;
	}


}
