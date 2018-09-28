package <missing>;

public class GlobalMembers
{
	public static String c = new String(new char[100010]);
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead(" ");
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			int flag = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			int l = c.length();
			for (i = 0;i < l;i++)
			{
				int num = 0;
				for (j = 0;j < l;j++)
				{
					if (c.charAt(j) == c.charAt(i))
					{
						num++;
					}
				}
				if (num == 1)
				{
					System.out.printf("%c\n",c.charAt(i));
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				System.out.print("no\n");
			}


		}

	}
}

