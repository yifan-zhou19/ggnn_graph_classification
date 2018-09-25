package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[25]);
		int n;
		int i;
		int j;
		int a;
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
			a = 0;
			for (j = 0;zfc.charAt(j) != '\0';j++)
			{
				if (j == 0 && (zfc.charAt(j) == '_' || (zfc.charAt(j) >= 'a' && zfc.charAt(j) <= 'z') || (zfc.charAt(j) >= 'A' && zfc.charAt(j) <= 'Z')))
				{
					a = 1;
				}
				else if (j > 0 && (zfc.charAt(j) == '_' || (zfc.charAt(j) >= 'a' && zfc.charAt(j) <= 'z') || (zfc.charAt(j) >= 'A' && zfc.charAt(j) <= 'Z') || (zfc.charAt(j) >= '0' && zfc.charAt(j) <= '9')))
				{
					a = 1;
				}
				else
				{
					a = 0;
				}
				if (a == 0)
				{
					break;
				}
			}
			if (a == 0)
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

