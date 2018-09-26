package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[300];
		int[] flag = new int[300];
		int[] new = new int[300];
		int i;
		int j;
		int n;
		int count = 0;
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
			flag[i] = 0;
		}
		new[0] = sz[0];
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (sz[i] == sz[j])
				{
					flag[i] = 1;
					count++;
				}
			}
		}
		System.out.printf("%d",new[0]);
		for (j = 1, i = 1;j < n && i < n;i++)
		{
			if (flag[i] == 0)
			{
				new[j] = sz[i];
				System.out.printf(",%d",new[j]);
				j++;
			}
		}
		return 0;
	}

}

