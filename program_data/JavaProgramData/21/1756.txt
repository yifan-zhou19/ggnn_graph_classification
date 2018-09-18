package <missing>;

public class GlobalMembers
{
	public static float average(int[] x, int n)
	{
		float y;
		int i;
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			sum += x[i];
		}
		y = ((float) sum) / n;
		return y;
	}
	public static void Main()
	{
		int[] num = new int[300];
		int[] output = new int[2];
		float[] juli = new float[300];
		int n;
		int i;
		int w = 0;
		int j = 0;
		float aver;
		float max = 0F;
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
				num[i] = Integer.parseInt(tempVar2);
			}
		}
		aver = average(num, n);
		for (i = 0;i < n;i++)
		{
			juli[i] = Math.abs(aver - num[i]);
		}
		max = juli[0];
		for (i = 0;i < n;i++)
		{
			if (max < juli[i])
			{
				max = juli[i];
			}
		}

		for (i = 0;i < n;i++)
		{
			if (juli[i] == max)
			{
				w++;
				output[j] = num[i];
				j++;
			}
		}

		if (w == 2)
		{
			System.out.printf("%d,%d\n",output[0],output[1]);
		}
		else
		{
			System.out.printf("%d\n",output[0]);
		}



	}



}

