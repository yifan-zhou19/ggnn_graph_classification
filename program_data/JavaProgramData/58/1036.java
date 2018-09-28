package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		String c = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			k = 1;
			c = new Scanner(System.in).nextLine();
			for (int j = 0;c.charAt(j) != '\0';j++)
			{
				if ((j == 0) && (c.charAt(j) <= '9') && (c.charAt(j) >= '0'))
				{
					k = 0;
					break;
				}
				else if ((c.charAt(j) <= 'z') && (c.charAt(j) >= 'a'))
				{
					continue;
				}
				else if ((c.charAt(j) <= 'Z') && (c.charAt(j) >= 'A'))
				{
					continue;
				}
				else if ((c.charAt(j) <= '9') && (c.charAt(j) >= '0'))
				{
					continue;
				}
				else if (c.charAt(j) == '_')
				{
					continue;
				}
				else
				{
					k = 0;
					break;
				}
			}
			System.out.printf("%d\n",k);
		}
		return 0;
	}

}

