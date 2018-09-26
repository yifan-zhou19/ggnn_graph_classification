package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int min = 10000;
		int max = 0;
		int[] a = new int[10001];
		int[] b = new int[10001];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] < min)
			{
				min = a[i];
			}
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;

					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
		int mm = b[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] > mm)
			{
				break;
			}
			if (b[i] > mm)
			{
				mm = b[i];
			}
		}
		if (i == n)
		{
			System.out.printf("%d %d\n",min,max);
		}
		else
		{
			System.out.print("no\n");
		}
		return 0;
	}
}

