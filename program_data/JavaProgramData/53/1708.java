package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[300][2];
		int i;
		int j;
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
			a[i][1] = 1;
		}
		for (i = 0;i < n;i++)
		{
			if (a[i][1] == 1)
			{
				for (j = i + 1;j < n;j++)
				{
					if (a[j][0] == a[i][0])
					{
						a[j][1] = 0;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i][1] == 1)
			{
				if (i != 0)
				{
				System.out.printf(",%d",a[i][0]);
				}
				else
				{
					System.out.printf("%d",a[i][0]);
				}
			}
		}
	}

}

