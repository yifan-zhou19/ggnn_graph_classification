package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int m;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String c = new String(new char[21]);
		for (l = 0;l < n;l++)
		{
			x = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			m = c.length();
			if ((c.charAt(0) >= 65 && c.charAt(0) <= 90) || (c.charAt(0) >= 97 && c.charAt(0) <= 122) || c.charAt(0) == '_')
			{
				for (i = 1;i < m;i++)
				{
					if ((c.charAt(i) >= 65 && c.charAt(i) <= 90) || (c.charAt(i) >= 97 && c.charAt(i) <= 122) || (c.charAt(i) == '_') || (c.charAt(i) >= 48 && c.charAt(i) <= 57))
					{
						x = 1;
					}
					else
					{
						x = 0;
						break;
					}
				}
			}
			else
			{
				x = 0;
			}
			if (x == 0)
			{
				System.out.print("no\n");
			}
			if (x == 1)
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}


}

