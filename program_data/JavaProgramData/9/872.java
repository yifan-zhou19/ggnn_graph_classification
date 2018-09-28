package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 0;
		int[] sz = new int[100];
		int i;
		int j;
		int[] sz2 = new int[100];
		int e;
		char[][] zf = new char[100][20];
		String f = new String(new char[20]);
		char[][] zf2 = new char[100][20];
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
				zf[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] >= 60)
			{
				n--;
				zf2[m] = zf[i];
				sz2[m] = sz[i];
				m++;
				for (j = i;j <= n;j++)
				{
					zf[j] = zf[j + 1];
					sz[j] = sz[j + 1];
				}
				i--;
			}
		}
		for (j = 1;j <= m;j++)
		{
			for (i = 0;i < m - j;i++)
			{
				if (sz2[i] < sz2[i + 1])
				{
					e = sz2[i];
					sz2[i] = sz2[i + 1];
					sz2[i + 1] = e;
					f = zf2[i];
					zf2[i] = zf2[i + 1];
					zf2[i + 1] = f;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%s\n", zf2[i]);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n", zf[i]);
		}
		return 0;
	}
}

