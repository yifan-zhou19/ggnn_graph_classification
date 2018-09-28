package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String zfc = new String(new char[100001]);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			for (k = 0;zfc.charAt(k);k++)
			{
				for (j = 0;zfc.charAt(j);j++)
				{
					if (zfc.charAt(k) == zfc.charAt(j) && k != j)
					{
						break;
					}
				}
				if (zfc.charAt(j) == '\0')
				{
					System.out.printf("%c\n",zfc.charAt(k));
					break;
				}
			}
			if (zfc.charAt(k) == '\0')
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}

}

