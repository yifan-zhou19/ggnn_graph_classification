package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int[] a = new int[500];
		int[] b = new int[500];
		int t = 0;
		int r = 0;
		int tem;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] % 2 != 0)
			{
				b[t] = a[i];
				t++;
			}
		}
		for (i = 0;i < t - 1;i++)
		{
			for (j = 0;j < t - 1 - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					tem = b[j];
					b[j] = b[j + 1];
					b[j + 1] = tem;
				}
			}
		}
			for (i = 0;i < t;i++)
			{
				if (r == 0)
				{
					System.out.printf("%d",b[i]);
				}
				else
				{
					System.out.printf(",%d",b[i]);
				}
				r++;
			}




	return 0;
	}
}

