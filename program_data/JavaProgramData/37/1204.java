package <missing>;

public class GlobalMembers
{
	public static String sz = new String(new char[100000]);
	public static int zd(tangible.RefObject<String> sz)
	{
		String bz;
		bz = "abcdefghijklmnopqrstuvwxyz";
		int[] js = new int[26];
		int len = sz.argValue.length();
		int i;
		int j;
		for (i = 0;i < len;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (bz.charAt(j) == sz.argValue.charAt(i))
				{
					js[j]++;
				}
			}
		}
		for (i = 0;i < len;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (bz.charAt(j) == sz.argValue.charAt(i))
				{
					if (js[j] == 1)
					{
						System.out.printf("%c\n",sz.argValue.charAt(i));
						return 1;
					}
				}
			}
		}
		return 0;
	}
	public static int Main()
	{
		int n;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz = tempVar2.charAt(0);
			}
		tangible.RefObject<String> tempRef_sz = new tangible.RefObject<String>(sz);
			x = zd(tempRef_sz);
			sz = tempRef_sz.argValue;
			if (x == 0)
			{
				System.out.print("no\n");
			}
		}

		return 0;
	}

}

