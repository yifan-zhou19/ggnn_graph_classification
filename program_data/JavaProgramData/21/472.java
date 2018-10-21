package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[300]; //num???????n??????,sum????
		int n;
		int i;
		int j = 0;
		int m = 0;
		double[] dis = new double[300];
		double ave;
		double max;
		double sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++) //??
		{
			sum = sum + num[i];
		}
		ave = sum / n; //????
		for (i = 0;i < n;i++) //????
		{
			if (num[i] >= ave)
			{
				dis[i] = num[i] - ave;
			}
			else
			{
				dis[i] = ave - num[i];
			}
		}
		max = dis[0];
		for (i = 0;i < n;i++) //????
		{
			if (dis[i] > max)
			{
				max = dis[i];
			}
		}
		for (i = 0;i < n;i++) //??????
		{
			if (dis[i] == max)
			{
				j++;
			}
		}
		for (i = 0;i < n;i++) //?????
		{
			if (dis[i] == max)
			{
				System.out.print(num[i]);
				m++;
				if (m != j)
				{
					System.out.print(",");
				}
			}

		}
		System.out.print("\n");
		return 0;
	}
}

