package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h;
		int l;
		int[] x = new int[8];
		int X;
		int Y;
		int i;
		int j;
		int[][] a = new int[8][8];
		int[] t = {0, 0, 0, 0, 0, 0, 0, 0};
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
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
				if (a[i][j] > t[i])
				{
					t[i] = a[i][j];
					x[i] = j;
				}
			}
		}
		n = 0;
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < h;j++)
			{
				if (a[j][x[i]] < t[i])
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto MQ;
				}
			}
			X = i;
			Y = x[i];
			n--;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	MQ:
	n++;
		}
		if (n == h)
		{
			System.out.print("No");
		}
		if (n == (h - 1))
		{
			System.out.printf("%d+%d",X,Y);
		}
		return 0;
	}

}

