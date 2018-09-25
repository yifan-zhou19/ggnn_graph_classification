package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10];
		int n;
		int i;
		int j;
		int b;
		int t;
		int q;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,t = 0;i <= (n - 1);i++)
		{
			for (j = 0,sum = 0;j <= (n - 1);j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[j] = Integer.parseInt(tempVar2);
				}
					sum = sum + a[j];
			}
			if (sum == (n * 255))
			{
				continue;
			}
			b = (n * 255 - sum) / 255;
			t = t + 1;
		}
		q = (t - 2) * (b - 2);
		System.out.printf("%d",q);
	}

}

