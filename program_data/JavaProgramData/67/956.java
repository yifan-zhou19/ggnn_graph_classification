package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[N][2];
		int n;
		int i;
		int x;
		int y;
		float[][] b = new float[N][2];
		float z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		z = (float)y / (float)x;
	//	printf("%f\n",z);
		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i][0] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				a[i][1] = Integer.parseInt(tempVar5);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
	//		printf("%d %d\n",a[i][0],a[i][1]);
			b[i][0] = ((float)a[i][1] / (float)a[i][0]);
			b[i][1] = b[i][0] - z;
	//		printf("%f\n \n%f\n \n",b[i][0],b[i][1]);
			if (b[i][1] > 0.05F)
			{
				System.out.print("better\n");
			}
			else if (b[i][1] < -0.05F)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

