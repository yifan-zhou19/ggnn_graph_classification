package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int k;
		int m;
		String zfc = new String(new char[100001]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			for (k = 0;zfc.charAt(k) != 0;k++)
			{
				for (m = 0;zfc.charAt(m) != 0;m++)
				{
					if (zfc.charAt(m) == zfc.charAt(k) && m != k)
					{
						break;
					}
				}
				if (zfc.charAt(m) == 0)
				{
					System.out.printf("%c\n",zfc.charAt(k));
					break;
				}
			}
			if (zfc.charAt(k) == 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

