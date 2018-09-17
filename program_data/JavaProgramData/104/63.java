package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 0;
		int k = 0;
		int[] x = new int[20];
		int[] y = new int[20];
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
		for (i = 0;x[i] != 1;i++)
		{
			x[i + 1] = x[i] / 2;
			k = i + 1;
		}
		for (i = 0;y[i] != 1;i++)
		{
			y[i + 1] = y[i] / 2;
			j = i + 1;
		}
		for (;x[k] == y[j] && k >= 0 && j >= 0;)
		{
			k--;
			j--;
		}
			System.out.printf("%d",x[k + 1]);
	}

}

