package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[21]);
	public static int Main()
	{
		int n;
		int m;
		int l1;
		int l2;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (l1 = 1;l1 <= n;l1++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					str = tempVar2.charAt(0);
				}
				m = str.length();
				for (l2 = 0;l2 < m;l2++)
				{
					if ((str.charAt(l2) >= '0') && (str.charAt(l2) <= '9'))
					{
						if (l2 == 0)
						{
							break;
						}
						else
						{
							;
						}
					}
					else if (!(((str.charAt(l2) >= 'a') && (str.charAt(l2) <= 'z')) || ((str.charAt(l2) >= 'A') && (str.charAt(l2) <= 'Z')) || (str.charAt(l2) == '_')))
					{
						break;
					}
				}
				if (l2 == m)
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

