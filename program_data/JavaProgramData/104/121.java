package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] road_1 = new int[10];
		int[] road_2 = new int[10];
		int n;
		int x;
		int y;
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}

		//?????????
		road_1[0] = x; //?x????
		for (n = 1;x != 1;n++)
		{
			if (x % 2 == 0)
			{
				road_1[n] = x / 2;
				x = x / 2;
			}
			else
			{
				road_1[n] = (x - 1) / 2;
				x = (x - 1) / 2;
			}
		}

		road_2[0] = y; //?y????
		for (m = 1;y != 1;m++)
		{
			if (y % 2 == 0)
			{
				road_2[m] = y / 2;
				y = y / 2;
			}
			else
			{
				road_2[m] = (y - 1) / 2;
				y = (y - 1) / 2;
			}
		}

		//????
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (road_1[i] == road_2[j])
				{
					System.out.printf("%d",road_1[i]);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto lable;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	lable:
	;
	}
}

