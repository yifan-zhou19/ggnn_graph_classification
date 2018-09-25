package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] zf = new char[100][10];
		String id = new String(new char[10]);
		int i;
		int k;
		int e = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zf[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (k = 1;k < n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (sz[i + 1] >= 60 && sz[i + 1] > sz[i])
				{
					e = sz[i];
					sz[i] = sz[i + 1];
					sz[i + 1] = e;
					id = zf[i];
					zf[i] = zf[i + 1];
					zf[i + 1] = id;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",zf[i]);
		}
		return 0;
	}

}

