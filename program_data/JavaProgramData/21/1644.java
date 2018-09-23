package <missing>;

public class GlobalMembers
{
		public static void Main(String[] args)
		{
		int n;
		int i = 0;
		int j = 0;
		int[] r = new int[300];
		int sum = 0;
		int l = 0;
		int k = 0;
		double aver;
		double[] cha = new double[300];
		double max = 0;
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
				r[i] = Integer.parseInt(tempVar2);
			}
			sum = sum + r[i];
		}
		aver = sum * 1.0 / n;
		for (i = 0;i < n;i++)
		{
			cha[i] = Math.abs(aver - r[i]);
		}
		for (i = 0;i < n;i++)
		{
			if (cha[i] > max)
			{
				max = cha[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (cha[i] == max)
			{
				l++;
			}

		}
		if (l == 0)
		{
			for (i = 0;i < n;i++)
			{
				if (cha[i] == max)
				{
					System.out.printf("%d",r[i]);
				}
			}
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				if (cha[i] == max)
				{
					k++;
					if (k < l)
					{
						System.out.printf("%d,",r[i]);
					}
					else
					{
						System.out.printf("%d",r[i]);
					}
				}
			}
		}

		}

}

