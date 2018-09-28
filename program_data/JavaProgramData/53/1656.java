package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[300][2];
		int i;
		int j;
		int n;
		for (i = 0;i < 300;i++)
		{
			a[i][1] = 0;
			a[i][0] = 0;
		}
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
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[j][0] == a[i][0])
				{
					a[j][1] = 1;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i][1] == 0)
			{
				if (i >= 1)
				{
				System.out.printf(",%d",a[i][0]);
				}
				else if (i == 0)
				{
					System.out.printf("%d",a[0][0]);
				}
			}
		}
	}

}

