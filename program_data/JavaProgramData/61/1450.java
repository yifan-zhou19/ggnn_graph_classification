package <missing>;

public class GlobalMembers
{
	public static int F(int x)
	{
		int[] sz = new int[100];
		int i;
		sz[0] = 1;
		sz[1] = 1;
		for (i = 2;i < 100;i++)
		{
			sz[i] = sz[i - 1] + sz[i - 2];
		}
		return sz[x - 1];
	}
		public static int Main()
		{
			int n;
			int i;
			int[] sa = new int[100];
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
					sa[i] = Integer.parseInt(tempVar2);
				}
			System.out.printf("%d\n",F(sa[i]));
			}
		return 0;
		}

}

