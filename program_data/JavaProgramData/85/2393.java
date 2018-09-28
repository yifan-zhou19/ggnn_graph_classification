package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int m = 0;
		int j;
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
			l = zfc.length();
			if ((zfc.charAt(0) >= 'a' && zfc.charAt(0) <= 'z') || (zfc.charAt(0) >= 'A' && zfc.charAt(0) <= 'Z') || (zfc.charAt(0) == '_'))
			{
				for (j = 1;j < l;j++)
				{
				if (!((zfc.charAt(j) >= 'a' && zfc.charAt(j) <= 'z') || (zfc.charAt(j) >= 'A' && zfc.charAt(j) <= 'Z') || (zfc.charAt(j) == '_') || (zfc.charAt(j) >= '0' && zfc.charAt(j) <= '9')))
				{
					System.out.println("no");
					break;
				}
					if (j == l - 1)
					{
						System.out.println("yes");
					}
				}
			}
			else
			{
				System.out.println("no");
			}
		}

		return 0;
	}







}

