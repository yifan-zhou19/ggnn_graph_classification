package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p;
		int s;
		int flag;
		String zfc = new String(new char[21]);
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
				zfc = tempVar2.charAt(0);
			}
			s = zfc.length();
			if ((zfc.charAt(0) >= 'A' && zfc.charAt(0) <= 'Z') || (zfc.charAt(0) >= 'a' && zfc.charAt(0) <= 'z') || zfc.charAt(0) == '_')
			{
				for (p = 1;p < s;p++)
				{
					if ((zfc.charAt(p) >= 'A' && zfc.charAt(p) <= 'Z') || (zfc.charAt(p) >= 'a' && zfc.charAt(p) <= 'z') || zfc.charAt(p) == '_' || (zfc.charAt(p) >= '0' && zfc.charAt(p) <= '9'))
					{
						flag = 1;
					}
				else
				{
					flag = 0;
					break;
				}
				}
			}
		else
		{
			flag = 0;
		}
		if (flag == 1)
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

