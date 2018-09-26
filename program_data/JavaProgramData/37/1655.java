package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[100001]);
		int t;
		int i;
		int k;
		int x;
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
			for (k = 0;k < zfc.length() - 1;k++)
			{
				for (x = 0;x < zfc.length();x++)
				{
					if (x != k && zfc.charAt(x) == zfc.charAt(k))
					{
						break;
					}
				}
				if (x == zfc.length())
				{
					System.out.printf("%c\n",zfc.charAt(k));
					break;
				}
			}
			if (k == zfc.length() - 1)
			{
				for (x = 0;x < zfc.length();x++)
				{
					if (x != k && zfc.charAt(x) == zfc.charAt(k))
					{
						break;
					}
				}
				if (x == zfc.length())
				{
					System.out.printf("%c\n",zfc.charAt(k));
					break;
				}
				else
				{
					System.out.print("no\n");
				}
			}
		}
		return 0;
	}
}

