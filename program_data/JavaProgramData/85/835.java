package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int len;
		int flag;
		String zfc = new String(new char[X]);
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
			len = zfc.length();
			flag = 1;
			for (j = 1;j < len;j++)
			{
				if (zfc.charAt(0) >= 'a' && zfc.charAt(0) <= 'z' || zfc.charAt(0) >= 'A' && zfc.charAt(0) <= 'Z' || zfc.charAt(0) == '_')
				{
					;
				}
				else
				{
					System.out.print("no\n");
					flag = 0;
					break;
				}
				if (zfc.charAt(j) >= '0' && zfc.charAt(j) <= '9' || zfc.charAt(j) >= 'a' && zfc.charAt(j) <= 'z' || zfc.charAt(j) >= 'A' && zfc.charAt(j) <= 'Z' || zfc.charAt(j) == '_')
				{
					;
				}
				else
				{
						System.out.print("no\n");
						flag = 0;
						break;
				}
			}
			if (flag == 1)
			{
				System.out.print("yes\n");
			}

		}
	}

}

