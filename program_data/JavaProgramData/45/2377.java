package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc1 = new String(new char[51]);
		String zfc2 = new String(new char[51]);
		int k1;
		int k2;
		int i;
		int j;
		int e;
		int c;
		c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zfc2 = tempVar2.charAt(0);
		}
		k1 = zfc1.length();
		k2 = zfc2.length();
		for (i = c;i < k2;i++)
		{
			e = 0;
			for (j = 0;j < k1;j++)
			{
				if (j == 0)
				{
					c = i;
				}
				if (zfc2.charAt(i) == zfc1.charAt(j))
				{
					e++;
					i++;
				}
				else
				{
					break;
				}
			}
			if (e == k1)
			{
				System.out.printf("%d",i - k1);
				break;
			}
		}
		return 0;
	}
}

