package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[1001][2];
		int n = 1;
		int i = 0;
		int j;
		int min;
		int max;
		int sum;
		int MAX = 0;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0][0] = Integer.parseInt(tempVar);
		}
		min = a[0][0];
		while ((c = System.in.read()) != '\n')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[n++][0] = Integer.parseInt(tempVar2);
			}
			if (a[n - 1][0] < min)
			{
				min = a[n - 1][0];
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[0][1] = Integer.parseInt(tempVar3);
		}
		n = 1;
		max = a[0][1];
		while ((c = System.in.read()) != '\n')
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[n++][1] = Integer.parseInt(tempVar4);
			}
			if (a[n - 1][1] > max)
			{
				max = a[n - 1][1];
			}
		}

		for (i = min;i <= max;i++)
		{
			sum = 0;
			for (j = 0;j < n;j++)
			{
				if (i >= a[j][0] != 0 && i < a[j][1])
				{
					sum++;
				}
			}
			if (sum > MAX)
			{
				MAX = sum;
			}
		}
		System.out.printf("%d %d\n",n,MAX);
	}
}

