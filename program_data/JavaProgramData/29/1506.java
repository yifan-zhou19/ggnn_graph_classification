package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		int num;
		float sum;
		float[] rst = new float[100];
		int up = int x;
		int down = int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < num;j++)
			{
				sum = sum + ((double)up(j + 1) / (double)down(j + 1));
			}
			rst[i] = sum;
			sum = 0F;
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3f\n",rst[i]);

		}




	}
	public static int up(int x)
	{
		if (x == 1)
		{
		return 2;
		}
		if (x == 2)
		{
		return 3;
		}
		else
		{
		return up(x - 1) + up(x - 2);
		}




	}
	public static int down(int x)
	{
		if (x == 1)
		{
		return 1;
		}
		if (x == 2)
		{
		return 2;
		}
		else
		{
		return down(x - 1) + down(x - 2);
		}



	}



}

