package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int max;
		int[] ss = new int[10000];
		int i;
		int j;
		int k = 0;
		int b1 = 0;
		int b2;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			max = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= max;i++)
		{
			b2 = 0;
			for (j = 2;(double)j <= Math.sqrt((double)max) && j < i;j++)
			{
				if (i % j == 0)
				{
					b2 = 1;
					break;
				}
			}
			if (b2 == 0)
			{
				ss[k] = i;
				k = k + 1;
			}
		}
		if (k == 0 || max < 5)
		{
			System.out.print("empty");
		}
		else
		{
		for (i = 1;i < k;i++)
		{
			if ((ss[i] - ss[i - 1]) == 2)
			{
				if (b1 != 0)
				{
					System.out.print("\n");
				}
				System.out.printf("%d %d",ss[i - 1],ss[i]);
				b1 += 1;
			}
		}
		}
	}

}

