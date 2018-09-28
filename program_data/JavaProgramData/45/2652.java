package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc1 = new String(new char[55]);
		String zfc2 = new String(new char[55]);
		int i;
		int j;
		int k;
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
		k = 0;
		for (i = 0;i < zfc2.length();i++)
		{
			if (zfc1.charAt(0) == zfc2.charAt(i))
			{
				k = i;
				for (j = i;j < i + zfc1.length() - 1;j++)
				{
					if (zfc1.charAt(j - i) != zfc2.charAt(j))
					{
						k = 0;
						break;
					}
				}
			}
			if (k != 0)
			{
				break;
			}
		}
		System.out.printf("%d",k);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			zfc1 = tempVar3.charAt(0);
		}
		return 0;
	}
}

