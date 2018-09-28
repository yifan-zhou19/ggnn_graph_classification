package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int c;
		int j;
		String a = new String(new char[21]);
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
				a = tempVar2.charAt(0);
			}
			c = 0;
			for (j = 0;j < a.length();j++)
			{
				if (j == 0)
				{
					if ((a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || (a.charAt(0) == '_') && (a.charAt(0) < '0' || a.charAt(0)>'9'))
					{
						c++;
					}
				}
				else
				{
					if ((a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) == '_') || (a.charAt(j) >= '0' && a.charAt(j) <= '9'))
					{
							 c++;
					}
				}
			}
			if (c == a.length())
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

