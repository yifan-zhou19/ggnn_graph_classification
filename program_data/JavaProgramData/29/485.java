package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] bc = new int[100];
		int[] c = new int[100];
		int qnx;
		int i;
		int j;
		float sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		bc[0] = 2;
		bc[1] = 3;
		c[0] = 1;
		c[1] = 2;
		for (i = 2;i < 100;i++)
		{
			bc[i] = bc[i - 2] + bc[i - 1];
			c[i] = c[i - 2] + c[i - 1];
		}
		for (i = 0;i < n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				qnx = Integer.parseInt(tempVar2);
			}
			sum = 0F;
			for (j = 0;j < qnx;j++)
			{
				sum += 1.0 * bc[j] / c[j];
			}
			System.out.printf("%.3f\n",sum);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			qnx = Integer.parseInt(tempVar3);
		}
			sum = 0F;
			for (j = 0;j < qnx;j++)
			{
				sum += 1.0 * bc[j] / c[j];
			}
			System.out.printf("%.3f",sum);


		return 0;
	}
}

