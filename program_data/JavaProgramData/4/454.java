package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int h;
		int l;
		int m;
		int i;
		int j;
		int[][] a = new int[100][100];
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
			for (k = 0;k < h;k++)
			{
					for (j = 0;j < l;j++)
					{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[k][j] = Integer.parseInt(tempVar3);
					}
					}
			}
			i = 0;
			while (i < l)
			{
				k = i;
				j = 0;
				while (true)
				{
					System.out.printf("%d\n",a[j][k]);
					k--;
					j++;
					if (k < 0 || j == h)
					{
					break;
					}
				}
				i++;
			}
			i = 1;
			while (i < h)
			{
				k = i;
				j = l - 1;
				while (true)
				{
					System.out.printf("%d\n",a[k][j]);
					k++;
					j--;
					if (j < 0 || k == h)
					{
					break;
					}
				}
				i++;
			}
		return 0;
	}
}

