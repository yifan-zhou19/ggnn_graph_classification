package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int h;
		int c;
		int l;
		int k;
		int p;
		int a = 0;
		int[] sz = new int[300];
		int[] ph = new int[300];
		for (i = 0;m != 0;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
				sz[j] = j + 1;
			}
			l = n;
			for (j = 0;j < (n - 1);j++,l--)
			{
				for (h = 0;h < m;h++)
				{
					p = sz[l - 1];
					for (c = (l - 2);c >= 0;c--)
					{
						k = sz[c];
						sz[c] = p;
						p = k;
					}
					sz[l - 1] = p;
				}
			}
			ph[a] = sz[0];
			a++;
		}
		for (i = 0;i < a - 1;i++)
		{
		System.out.printf("%d\n",ph[i]);
		}
		return 0;
	}

}

