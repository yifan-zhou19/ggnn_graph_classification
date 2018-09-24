public class space
{
	public float b;
	public int x;
	public int y;
}

package <missing>;

public class GlobalMembers
{
	public static space[] juli = tangible.Arrays.initializeWithDefaultspaceInstances(100);
	public static space cache = new space();
	public static int Main()
	{
		int[][] a = new int[10][3];
		int i;
		int j;
		int k = 0;
		int n;
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
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			a[0][2] = Integer.parseInt(tempVar4);
		}
		for (i = 1;i < n;i++)
		{
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				a[i][0] = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				a[i][1] = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				a[i][2] = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0,j = 0;;)
		{
			juli[k].x = i;
			juli[k].y = j;
			juli[k].b = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]));
			k++;
			if (i == n - 1 && j == n - 1)
			{
				break;
			}
			if (j == n - 1)
			{
				i++;
				j = 0;
			}
			else
			{
				j++;
			}
		}
		for (i = 0;i < n * n;i++)
		{
			for (k = 0;k < n * n - i;k++)
			{
				if (juli[k].b < juli[k + 1].b)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: cache=juli[k+1];
					cache.copyFrom(juli[k + 1]);
					juli[k + 1] = juli[k];
					juli[k] = cache;
				}
			}
		}
		int a1;
		int a2;
		for (i = 0;i < n * n;i++)
		{
			if (juli[i].x >= juli[i].y)
			{
				continue;
			}
			else
			{
				a1 = juli[i].x;
				a2 = juli[i].y;
				System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",a[a1][0],a[a1][1],a[a1][2],a[a2][0],a[a2][1],a[a2][2],juli[i].b);
			}
		}
		return 0;
	}

}

