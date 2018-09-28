package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int i = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y1 = Integer.parseInt(tempVar2);
		}
		int[][] aa;
		aa = new int[x1];
		for (i = 0;i < x1;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			aa[i] = (int)malloc((Integer.SIZE / Byte.SIZE) * y1);
			for (j = 0;j < y1;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				aa[i][j] = Integer.parseInt(tempVar3);
			}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			y2 = Integer.parseInt(tempVar5);
		}
		int[][] bb;
		bb = new int[x2];
		for (i = 0;i < x2;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			bb[i] = (int)malloc((Integer.SIZE / Byte.SIZE) * y2);
			for (j = 0;j < y2;j++)
			{
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				bb[i][j] = Integer.parseInt(tempVar6);
			}
			}
		}
		int[][] cc;
		cc = new int[x1];
		for (i = 0;i < x1;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			cc[i] = (int)malloc((Integer.SIZE / Byte.SIZE) * y2);
			for (j = 0;j < y2;j++)
			{
				cc[i][j] = 0;
			}
			for (j = 0;j < y2;j++)
			{
				for (int p = 0;p < x2;p++)
				{
					cc[i][j] += aa[i][p] * bb[p][j];
				}
			}
		}
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y2 - 1;j++)
			{
				System.out.printf("%d ",cc[i][j]);
			}
			System.out.printf("%d\n",cc[i][j]);
		}
		return 0;
	}

}

