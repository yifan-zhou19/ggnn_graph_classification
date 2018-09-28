package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[][] sz = new int[number][2];
		int i;
		int j;
		int mc = 0;
		int n;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == 0 && b == 0)
			{
				break;
			}
			else
			{
				sz[a][0]++;
				sz[b][1]++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i][0] == 0 && sz[i][1] == n - 1)
			{
				System.out.printf("%d\n", i);
				mc++;
			}
		}
		if (mc == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}
}

