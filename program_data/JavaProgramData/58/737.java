package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		String c = new String(new char[800]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			c = new Scanner(System.in).nextLine();
			m = c.length();
			if ((c.charAt(0) >= 65 && c.charAt(0) <= 90) || (c.charAt(0) >= 97 && c.charAt(0) <= 122) || (c.charAt(0) == 95))
			{
				for (j = 0;j <= m - 1;j++)
				{
					if (c.charAt(j) == ' ')
					{
						System.out.print("0\n");
						break;
					}
					if (c.charAt(j) < 48)
					{
						System.out.print("0\n");
						break;
					}
					if (c.charAt(j) > 57 && c.charAt(j) < 65)
					{
						System.out.print("0\n");
						break;
					}
					if (c.charAt(j) > 91 && c.charAt(j) < 95)
					{
						System.out.print("0\n");
						break;
					}
					if (c.charAt(j) > 95 && c.charAt(j) < 97)
					{
						System.out.print("0\n");
						break;
					}
					if (c.charAt(j) > 122)
					{
						System.out.print("0\n");
						break;
					}
				}
				if (j == m)
				{
					System.out.print("1\n");
				}
			}
			else
			{
				System.out.print("0\n");
			}
		}
		return 0;
	}

}

