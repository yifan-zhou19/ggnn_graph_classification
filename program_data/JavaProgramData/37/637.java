package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[100000]);
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			c = new Scanner(System.in).nextLine();
			for (int j = 0;c.charAt(j) != '\0';j++)
			{
				m = 0;
				for (int k = 0;c.charAt(k) != '\0';k++)
				{
					if (k != j)
					{
						if (c.charAt(k) == c.charAt(j))
						{
							m = 1;
							break;
						}
					}
				}
				if (m == 0)
				{
					System.out.printf("%c\n",c.charAt(j));
					break;
				}
			}
			if (m == 1)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

