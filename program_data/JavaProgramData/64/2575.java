package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct dian
	//	{
	//		float a;
	//		int x;
	//		int y;
	//	}
	//	a[45];
		dian t = new dian();
		int[][] d = new int[10][3];
		int i;
		int j;
		int k = 0;
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
				d[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				d[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				d[i][2] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				a[k].a = Math.sqrt((d[i][0] - d[j][0]) * (d[i][0] - d[j][0]) + (d[i][1] - d[j][1]) * (d[i][1] - d[j][1]) + (d[i][2] - d[j][2]) * (d[i][2] - d[j][2]));
				a[k].x = j;
				a[k].y = i;
				k++;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			for (j = 0;j < k - 1 - i;j++)
			{
				if (a[j].a < a[j + 1].a)
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",d[a[i].x][0],d[a[i].x][1],d[a[i].x][2],d[a[i].y][0],d[a[i].y][1],d[a[i].y][2],a[i].a);
		}

		return 0;
	}

}

