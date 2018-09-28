package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h;
		int l;
		int[][] a = new int[1000][1000];
		int j;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (k = 0;k < l;k++)
		{
			for (j = k, i = 0;(j >= 0 && i < h);i++, j--)
			{
				System.out.printf("%d\n",a[i][j]);
			}
		}
			for (k = 1;k < h;k++)
			{
			   for (j = l - 1, i = k;(i < h && j >= 0);i++, j--)
			   {
				   System.out.printf("%d\n",a[i][j]);
			   }
			}
	}
}

