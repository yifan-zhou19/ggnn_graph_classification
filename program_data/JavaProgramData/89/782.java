package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int[] know = new int[10000];
		int[] known = new int[10000];
		int x;
		int y;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = 0;
		z = 0;
		for (i = 0;i < 10000;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				know[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				known[i] = Integer.parseInt(tempVar3);
			}
			m = i;
			if (know[i] == 0 && known[i] == 0)
			{
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			x = 0;
			y = 0;
			for (j = 0;j < m;j++)
			{
				if (i == know[j])
				{
					x++;
				}
				if (i == known[j])
				{
					y++;
				}
			}
			if (x == 0 && y == n - 1)
			{
				System.out.printf("%d\n",i);
				z = 1;
			}
		}
		if (z == 0)
		{
		System.out.print("NOT FOUND\n");
		}
		return 0;
	}

}

