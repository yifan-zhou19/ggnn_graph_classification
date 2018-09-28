package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = 0;
		int n;
		int[] x = new int[5];
		int i;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= 4;i++)
		{
				if (n >= Math.pow(10,4 - i))
				{
					x[i] = n / Math.pow(10,4 - i);
					n = n - x[i] * (Math.pow(10,4 - i));
				}
				else
				{
					x[i] = 0;
				}
		}
		for (i = 0;i <= 4;i++)
		{
			if (x[i] == 0)
			{
				j++;
			}
		}

		for (i = j;i <= 4;i++)
		{
			sum = x[i] * (Math.pow(10,i - j)) + sum;
		}
		System.out.printf("%d",sum);
		return 0;
	}
}

