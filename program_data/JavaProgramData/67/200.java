package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] data = new int[100][3];
		int n;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		double c;
		c = 1.0 * b / a;
		int i;
		int j;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					(data[i][j]) = Integer.parseInt(tempVar4);
				}
			}
		}
		float buff = 0F;
		for (i = 0;i < n - 1;i++)
		{



			buff = (float)data[i][1] / data[i][0];
			if ((buff - c) > 0.05)
			{
				System.out.print("better\n");
			}
			else if ((c - buff) > 0.05)
			{
				System.out.print("worse\n");
			}
			else if ((c - buff) < 0.05 || (buff - c) < 0.05)
			{
				System.out.print("same\n");
			}
			/*printf("%f,%f\n",c,buff);*/

		}
		return 0;
	}
}

