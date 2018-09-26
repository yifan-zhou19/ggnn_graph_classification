package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[100]);
		int n;
		int i;
		int j;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			f = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c.charAt(0) >= '0' && c.charAt(0) <= '9')
			{
				f = 1;
			}
			else
			{
				for (j = 0;c.charAt(j) != 0;j++)
				{
					if ((c.charAt(j) < 'a' && c.charAt(j)>'Z' || c.charAt(j) > 'z' || c.charAt(j) < 'A' && c.charAt(j)>'9' || c.charAt(j) < '0') && c.charAt(j) != '_')
					{
						f = 1;
					}
				}
			}
			if (f != 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}

		}
		return 0;
	}
}

