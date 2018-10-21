package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int[] sz = new int[100005];
		int bz = 0;
		int bz2 = 0;
		String zfc = new String(new char[100005]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= t;i++)
		{
			for (j = 0;j <= 100004;j++)
			{
				sz[j] = 0;
			}
			bz = 0;
			bz2 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			for (j = 0;j < zfc.length();j++)
			{
				for (k = j;k < zfc.length();k++)
				{
					if (zfc.charAt(j) == zfc.charAt(k))
					{
						sz[j]++;
					}
				}
			}
			for (j = 0;j < zfc.length();j++)
			{
				if (sz[j] == 1)
				{
					bz = 0;
					for (k = 0;k <= j;k++)
					{
						if (zfc.charAt(j) == zfc.charAt(k))
						{
							bz++;
						}
					}
					if (bz == 1)
					{
						System.out.printf("%c\n",zfc.charAt(j));
						bz2 = 1;
						break;
					}
				}
			}
			if (bz2 == 0)
			{
				System.out.print("no\n");
			}
		}

		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			t = Integer.parseInt(tempVar3);
		}
		return 0;
	}

}

