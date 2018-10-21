package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int j;
		int hang;
		int h;
		int z = 0;
		int min;
		int[][] m = new int[10][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		//printf("\n");
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					m[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (j = 0;j < b;j++)
		{
			z = 0;
			min = m[0][j];
			for (i = 0;i < a;i++)
			{
				if (m[i][j] <= min)
				{
					min = m[i][j];
					hang = i;
				}
			}
			for (h = 0;h < b;h++)
			{
				if (m[hang][h] > min)
				{
					z++;
				}
			}
			if (z == 0)
			{
				System.out.printf("%d+%d",hang,j);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto loop;
			}
			if (z != 0)
			{
				continue;
			}
		}
		System.out.print("No");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		loop:
		System.out.print("\n");
	}
}

