package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int m;
		int j;
		int k = 1;
		int l = 0;
		String c = new String(new char[20]);
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
			m = c.length();
			for (j = 0;j < m;j++)
			{
				if ((((c.charAt(j) >= '0') && (c.charAt(j) <= '9')) || ((c.charAt(j) >= 'a') && (c.charAt(j) <= 'z')) || ((c.charAt(j) >= 'A') && (c.charAt(j) <= 'Z')) || (c.charAt(j) == '_')) && (((c.charAt(0) >= 'a') && (c.charAt(0) <= 'z')) || ((c.charAt(0) >= 'A') && (c.charAt(0) <= 'Z')) || (c.charAt(0) == '_')))
				{
					continue;
				}
				else
				{
					k = 0;
					break;
				}
			}
			if (k == 1)
			{
				if (l == 0)
				{
					System.out.print("yes");
					l = 1;
				}
				else
				{
				System.out.print("\nyes");
				}
			}
			else
			{
				if (l == 0)
				{
					System.out.print("no");
					l = 1;
				}
				else
				{
				System.out.print("\nno");
				}
			}
			k = 1;
		}
	}

}

