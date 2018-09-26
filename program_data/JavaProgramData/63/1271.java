package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a1;
		int b1;
		int a2;
		int b2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b1 = Integer.parseInt(tempVar2);
		}
		int[][] p = new int[a1];
		for (int i1 = 0;i1 <= a1 - 1;i1++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i1] = (int)malloc(b1 * (Integer.SIZE / Byte.SIZE)); //????????????????
		}
		int i3;
		for (int i2 = 0;i2 <= a1 - 1;i2++)
		{
			for (i3 = 0;i3 <= b1 - 1;i3++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[i2][i3] = Integer.parseInt(tempVar3);
				}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			b2 = Integer.parseInt(tempVar5);
		}
		int[][] q = new int[a2];
		for (int j1 = 0;j1 <= a2 - 1;j1++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			q[j1] = (int)malloc(b2 * (Integer.SIZE / Byte.SIZE)); //????????????????
		}
		int j3;
		for (int j2 = 0;j2 <= a2 - 1;j2++)
		{
			for (j3 = 0;j3 <= b2 - 1;j3++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					q[j2][j3] = Integer.parseInt(tempVar6);
				}
			}
		}
		int[][] r = new int[a1]; //?????????C
		for (int k = 0;k <= a1 - 1;k++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			r[k] = (int)malloc(b2 * (Integer.SIZE / Byte.SIZE));
		}
		int z; //????
		int y;
		int x;
		for (z = 0;z <= a1 - 1;z++)
		{
			for (y = 0;y <= b2 - 1;y++)
			{
				r[z][y] = 0;
				for (x = 0;x <= a2 - 1;x++)
				{
					r[z][y] = r[z][y] + (p[z][x]) * (q[x][y]);
				}
			}
		}
		int v; //????
		for (int w = 0;w <= a1 - 1;w++)
		{
				for (v = 0;v <= b2 - 2;v++)
				{
					System.out.printf("%d ",r[w][v]);
				}
				if (v == b2 - 1)
				{
					System.out.printf("%d",r[w][v]);
				}
				System.out.print("\n");
		}

	}
}

