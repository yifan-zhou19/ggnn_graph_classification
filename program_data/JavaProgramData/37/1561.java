package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			int len;
			int flag = 1;
			String c = new String(new char[100001]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			len = c.length();
			for (i = 0;i < len;i++)
			{
				int isbreak = 0;
				for (j = 0;j < i;j++)
				{
					if (c.charAt(j) == c.charAt(i))
					{
						isbreak = 1;
						break;
					}
				}
				if (isbreak != 0)
				{
					continue;
				}
				for (j = i + 1;j < len;j++)
				{
					if (c.charAt(j) == c.charAt(i))
					{
						isbreak = 1;
						break;
					}
				}
				if (isbreak != 0)
				{
					continue;
				}
				System.out.printf("%c",c.charAt(i));
				flag = 0;
				break;
			}
			if (flag != 0)
			{
				System.out.print("no");
			}
			if (n != 0)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}

