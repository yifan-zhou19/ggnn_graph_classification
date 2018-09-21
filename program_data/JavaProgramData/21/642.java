package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0; //??????n
		int[] a = new int[300]; //????a??????,sum???,t????
		int sum = 0;
		int t;
		double ave; //???????ave?????,??dis??????,max?????????
		double[] dis = new double[300];
		double max = 0.0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0; //??????ij
		int j = 0;
		int p = 0; //p?????
		for (i = 0;i < n;i++) //????,??
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
		ave = (double)sum / (double)n; //???
		for (i = 0;i < n - 1;i++) //?????????
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i] > a[j])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for (i = 0;i < n;i++) //?????
		{
			dis[i] = (a[i] - ave) * (a[i] - ave);
		}
		max = dis[0];
		for (i = 0;i < n;i++) //??????
		{
			if (dis[i] >= max)
			{
				max = dis[i];
				p++;
			}
		}
		if (p == 1) //?????????????
		{
			for (i = 0;i < n;i++)
			{
				if (dis[i] == max)
				{
					System.out.print(a[i]);
				}
			}
		}
		else
		{
			if (p > 1)
			{
				for (i = 0;i < n;i++)
				{
					if (dis[i] == max)
					{
					   j = i;
					   System.out.print(a[j]);
					   break;
					}
				}
			   for (i = j + 1;i < n;i++)
			   {
					if (dis[i] == max)
					{
					   System.out.print(",");
					   System.out.print(a[i]);
					}
			   }
			}
		}
		return 0;
	}
}

