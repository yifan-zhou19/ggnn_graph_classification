package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] an = new int[300];
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				an[i] = Integer.parseInt(tempVar2);
			}
			sum += an[i];
		}
		float average;
		average = sum * 1.0 / n;
		float[] away = new float[300];
		for (i = 0;i < n;i++)
		{
			if (an[i] - average >= 0F)
			{
				away[i] = an[i] - average;
			}
			else
			{
				away[i] = average - an[i];
			}
		}
		float f = away[0];
		for (i = 1;i < n;i++)
		{
			if (away[i] >= f)
			{
				f = away[i];
			}
		}
		int[] max = new int[10];
		int j;
		int num = 0;
		for (i = 0;i < n;i++)
		{
			if (away[i] == f)
			{
				num++;
				max[num] = an[i];
			}
		}
		if (num == 1)
		{
			System.out.printf("%d",max[1]);
		}
		else
		{
			for (int m = num - 1;m > 0;m--)
			{
				for (int n = 0;n < m;n++)
				{
					if (max[n] > max[n + 1])
					{
						int ntmp = max[n];
						max[n] = max[n + 1];
						max[n + 1] = ntmp;
					}
				}
			}
			for (int p = 1;p <= num;p++)
			{
				System.out.printf("%d",max[p]);
				if (p <= num - 1)
				{
				System.out.print(",");
				}
			}
		}
		return 0;
	}
}

