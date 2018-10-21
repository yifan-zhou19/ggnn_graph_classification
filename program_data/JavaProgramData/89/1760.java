package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[25000][2];
		int i;
		int[][] b = new int[25000][2];
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0][0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a[0][1] = Integer.parseInt(tempVar3);
		}
		i = 1;
		while (a[i - 1][0] != 0 || a[i - 1][1] != 0)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i][0] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				a[i][1] = Integer.parseInt(tempVar5);
			}
			i++;
		}
		i = 0;
		while (a[i][0] != 0 || a[i][1] != 0)
		{
			b[a[i][0]][0]++;
			b[a[i][1]][1]++;
			i++;
		}
		for (i = 0;i < n;i++)
		{
			if (b[i][0] == 0 && b[i][1] == n - 1)
			{
				System.out.printf("%d\n",i);
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("NOT FOUND");
		}
	}

}

