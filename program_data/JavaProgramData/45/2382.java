package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc1 = new String(new char[50]);
		String zfc2 = new String(new char[50]);
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

		int len1;
		int len2;
		len1 = zfc1.length();
		len2 = zfc2.length();

		int i;
		int j;
		int time = 0;
		int re;
		for (i = 0;i <= len2 - len1;i++)
		{
			for (j = 0;j < len1;j++)
			{
				if (zfc1.charAt(j) == zfc2.charAt(j + i))
				{
					time++;
				}
			}
			if (time == len1)
			{
				re = i;
				break;
			}
			time = 0;
		}
		System.out.printf("%d\n",re);
		return 0;
	}
}

