package <missing>;

public class GlobalMembers
{
	public static int fenjie(int max,int min)
	{
		int num = 1;
		int i;
		int k;
		for (i = min;i < max / 2;i++)
		{
			k = max % i;
			if (k == 0)
			{
				if (i <= max / i)
				{
				num += fenjie(max / i, i);
				}
			}
		}
		return num;
	}
	public static int Main()
	{
		int[] a = new int[10000];
		int n;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j < n;j++)
		{
			System.out.printf("%d\n",fenjie(a[j], 2));
		}
		return 0;
	}
}

