package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int N;
		int x;
		int y = 0;
		int i;
		int j;
		int[] a = new int[1000];
		int m = 0;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			for (j = 0;j < N;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					x = Integer.parseInt(tempVar2);
				}
				a[i] = a[i] + x;
			}
			if (a[i] == 255 * (N - 2))
			{
				m = m + 1;
			}
			else if (a[i] < 255 * (N - 2))
			{
				n = N - a[i] / 255;
			}
		}
		y = (n - 2) * m;
		System.out.printf("%d",y);
	}

}

