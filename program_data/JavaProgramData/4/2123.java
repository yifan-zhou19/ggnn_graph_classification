package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h;
		int l;
		int i;
		int j;
		int k;
		int m = 0;
		int[][] a = new int[100][100];
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
		for (k = 0,i = 0,j = 0;;)
		{
			System.out.printf("%d\n",a[j][i]);
			if (i == (l - 1) && j == (h - 1))
			{
				break;
			}
			if (i == 0 || j == (h - 1))
			{
				j = 0;
				k++;
				if (k < l)
				{
				i = k;
				}
				else
				{
				i = l - 1;
				m++;
				j = m;
				}
			}
			else
			{
				i -= 1;
				j += 1;
			}
		}
	return 0;
	}
}

