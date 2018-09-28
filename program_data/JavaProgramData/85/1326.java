package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String bz = new String(new char[50]);
		int n;
		int i;
		int j;
		int l;
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
				bz = tempVar2.charAt(0);
			}
			l = bz.length();
			for (j = 0;j < l;j++)
			{
				if (j == 0)
				{
					if (!((bz.charAt(j) >= 'a' && bz.charAt(j) <= 'z') || (bz.charAt(j) >= 'A' && bz.charAt(j) <= 'Z') || bz.charAt(j) == '_'))
					{
						System.out.print("no\n");
						break;
					}
				}
				else
				{
				if (!((bz.charAt(j) >= 'a' && bz.charAt(j) <= 'z') || (bz.charAt(j) >= 'A' && bz.charAt(j) <= 'Z') || bz.charAt(j) == '_' || (bz.charAt(j) >= '0' && bz.charAt(j) <= '9')))
				{
						System.out.print("no\n");
						break;
				}
				}
			}
		if (j == l)
		{
			System.out.print("yes\n");
		}

		}

		return 0;
	}
}

