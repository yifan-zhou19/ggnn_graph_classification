package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] x = new int[100];
		int[] y = new int[100];
		int i;
		int j;
		int p;
		int q;
		int k;
		int temp = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y[0] = Integer.parseInt(tempVar2);
		}
		for (i = 0;x[i] != 0;i++)
		{

			x[i + 1] = x[i] / 2;
		}
		for (p = 0;y[p] != 0;p++)
		{

			y[p + 1] = y[p] / 2;
		}
		for (q = 0;q <= i;q++)
		{
			for (j = 0;j <= p;j++)
			{
				if (x[q] == y[j])
				{
					temp = 1;
					k = q;
					break;
				}
			}
			if (temp == 1)
			{
				break;
			}
		}
		System.out.printf("%d",x[k]);
	}
}

