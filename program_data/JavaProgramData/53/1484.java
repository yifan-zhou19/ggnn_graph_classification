package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[400][3];
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
				a[i][0] = Integer.parseInt(tempVar2);
			}
			a[i][1] = 0;
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i][0] == a[j][0])
				{
					a[j][1] = 1;
				}
			}
		}
		System.out.printf("%d",a[0][0]);
		for (i = 1;i < n;i++)
		{
			if (a[i][1] != 1)
			{
				System.out.printf(",%d",a[i][0]);
			}
		}
		return 0;
	}



}

