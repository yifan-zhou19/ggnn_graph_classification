package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[300];
		int[] nsz = new int[300];
		int i;
		int j;
		int w = 1;
		int flag = 0;
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
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",sz[0]);
		nsz[0] = sz[0];
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < w;j++)
			{
				if (sz[i] == nsz[j])
				{
					flag = 1;
				//	break;
				}
			}
			if (flag == 0)
			{
				nsz[w] = sz[i];
				w++;
				System.out.printf(",%d",sz[i]);
			}
			flag = 0;
		}

		return 0;
	}
}

