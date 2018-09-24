package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct dot1
	//	{
	//		int x;
	//		int y;
	//		int z;
	//	}
	//	dot[10];
		float[][] dis =
		{
			{0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F}
		};
		float distance;
		int row;
		int col;
		int sign = 0;
		int n;
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
				dot[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				dot[i].y = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				dot[i].z = tempVar4;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dis[i][j] = (float)(dot[i].x - dot[j].x) * (float)(dot[i].x - dot[j].x) + (float)(dot[i].y - dot[j].y) * (float)(dot[i].y - dot[j].y) + (float)(dot[i].z - dot[j].z) * (float)(dot[i].z - dot[j].z);
				dis[i][j] = Math.sqrt((float)dis[i][j]);
			}
		}
		do
		{
			distance = dis[0][1];
			row = 0;
			col = 1;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (distance < dis[i][j])
				{
					distance = dis[i][j];
					row = i;
					col = j;
				}
			}
		}
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n", dot[row].x, dot[row].y, dot[row].z, dot[col].x, dot[col].y, dot[col].z, distance);
		dis[row][col] = 0F;
			sign += 1;
		} while (sign != (n - 1) * n / 2);
		return 0;
	}

}

