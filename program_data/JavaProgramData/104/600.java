package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[] x = new int[10000];
		int[] y = new int[10000];
		x[0] = m;
		y[0] = n;
		int i = 0;
		int j = 0;
		int num1;
		int num2;
		if (m == 1 || n == 1)
		{
			int k = 1;
			System.out.printf("%d\n", k);
		}
		else
		{
			while (x[i] > 1)
			{
			if (x[i] % 2 == 0)
			{
				x[i + 1] = x[i] / 2;
			}
			else
			{
				x[i + 1] = (x[i] - 1) / 2;
			}
			i = i + 1;
			num1 = i + 1;
			}
		while (y[j] > 1)
		{
			if (y[j] % 2 == 0)
			{
				y[j + 1] = y[j] / 2;
			}
			else
			{
				y[j + 1] = (y[j] - 1) / 2;
			}
			j = j + 1;
			num2 = j + 1;
		}
		int judge;
		for (i = num1, j = num2;i >= 0;i--)
		{
			if (x[i] == y[j])
			{
				j = j - 1;
				judge = x[i];
			}
		}
		System.out.printf("%d\n", judge);
		}
		return 0;
	}

}

