package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x;
		int y;
		int z;
		String c = new String(new char[35]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 35;j++)
			{
				c = c.substring(0, j);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			x = c.length() - 1;
			y = x - 1;
			z = x - 2;
			if (c.charAt(x) == 'r' && c.charAt(y) == 'e')
			{
				c = c.substring(0, x);
				c = c.substring(0, y);
			}
			else if (c.charAt(x) == 'y' && c.charAt(y) == 'l')
			{
				c = c.substring(0, y);
				c = c.substring(0, x);
			}
			else if (c.charAt(x) == 'g' && c.charAt(y) == 'n' && c.charAt(z) == 'i')
			{
				c = c.substring(0, z);
				c = c.substring(0, y);
				c = c.substring(0, x);
			}
			System.out.printf("%s\n",c);
		}
		return 0;
	}

}

