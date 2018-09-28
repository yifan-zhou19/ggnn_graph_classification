package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		String c = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c.charAt(c.length() - 1) == 'r')
			{
				for (j = 0;j < c.length() - 2;j++)
				{
					System.out.printf("%c",c.charAt(j));
				}
				System.out.print("\n");
			}
			if (c.charAt(c.length() - 1) == 'y')
			{
				for (j = 0;j < c.length() - 2;j++)
				{
					System.out.printf("%c",c.charAt(j));
				}
				System.out.print("\n");
			}
			if (c.charAt(c.length() - 1) == 'g')
			{
				for (j = 0;j < c.length() - 3;j++)
				{
					System.out.printf("%c",c.charAt(j));
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}

