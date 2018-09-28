package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String zfc = new String(new char[101]);
		for (i = 0;i < n - 1;i++)
		{
			k = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			l = zfc.length();
			if (zfc.charAt(0) == '_' || (zfc.charAt(0) >= 'a' && zfc.charAt(0) <= 'z') || (zfc.charAt(0) >= 'A' && zfc.charAt(0) <= 'Z'))
			{
				for (j = 1;j < l;j++)
				{
					if (zfc.charAt(j) == '_' || (zfc.charAt(j) >= 'a' && zfc.charAt(j) <= 'z') || (zfc.charAt(j) >= 'A' && zfc.charAt(j) <= 'Z') || (zfc.charAt(j) >= '0' && zfc.charAt(j) <= '9'))
					{
						k++;
					}
				}
			}
			if (k == l - 1)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
			k = 0;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				zfc = tempVar3.charAt(0);
			}
			l = zfc.length();
			if (zfc.charAt(0) == '_' || (zfc.charAt(0) >= 'a' && zfc.charAt(0) <= 'z') || (zfc.charAt(0) >= 'A' && zfc.charAt(0) <= 'Z'))
			{
				for (j = 1;j < l;j++)
				{
					if (zfc.charAt(j) == '_' || (zfc.charAt(j) >= 'a' && zfc.charAt(j) <= 'z') || (zfc.charAt(j) >= 'A' && zfc.charAt(j) <= 'Z') || (zfc.charAt(j) >= '0' && zfc.charAt(j) <= '9'))
					{
						k++;
					}
				}
			}
			if (k == l - 1)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		return 0;
	}
}

