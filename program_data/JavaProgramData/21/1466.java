package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		int[] num = new int[300];
		int s;
		int j;
		int b;
		int c;
		double ave;
		double[] v = new double[300];
		double a;
		s = 0;
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
			s += num[i];
		}
		ave = (double)s / n;
		for (i = 0;i < n;i++)
		{
			if (num[i] < ave)
			{
				v[i] = ave - num[i];
			}
			else
			{
				v[i] = num[i] - ave;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (v[j] > v[i])
				{
					a = v[j];
					v[j] = v[i];
					v[i] = a;
					b = num[j];
					num[j] = num[i];
					num[i] = b;
				}
			}
		}
		if (v[i] == v[i + 1] && num[i] > num[i + 1])
		{
				c = num[i];
				num[i] = num[j];
				num[j] = c;
		}
		System.out.printf("%d",num[0]);
		for (i = 0;i < n - 1;i++)
		{
			if (v[i] == v[i + 1] && num[i] > num[i + 1])
			{
				c = num[i];
				num[i] = num[j];
				num[j] = c;
			}
			else if (v[i] > v[i + 1])
			{
				break;
			}

			System.out.printf(",%d",num[i + 1]);


		}
		System.out.print("\n");

	}


}

