package <missing>;

public class GlobalMembers
{
	public static int lujing(int a)
	{
		int b;
		int j;
		int n;
		for (j = 9;j >= 0;j--)
		{
			if (a >= Math.pow(2,j) && a < Math.pow(2,j + 1))
			{
				n = j;
			}
		}
		b = (a - Math.pow(2,j)) / 2 + Math.pow(2,j - 1);
		return b;
	}
	public static void Main()
	{
		int[] x = new int[10];
		int[] y = new int[10];
		int i;
		int k;
		int t;
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
		for (i = 1;;i++)
		{
			x[i] = lujing(x[i - 1]);
			if (x[i] == 1)
			{
				break;
			}
		}
		for (k = 1;;k++)
		{
			y[k] = lujing(y[k - 1]);
			if (y[k] == 1)
			{
				break;
			}
		}
		for (t = 0;;t++)
		{
			if (x[i - t] == y[k - t] && x[i - t - 1] != y[k - t - 1])
			{
				System.out.printf("%d\n",x[i - t]);
				break;
			}
		}



	}
}

