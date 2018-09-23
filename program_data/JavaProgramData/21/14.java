package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[100];
		float sum = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum = sum + a[i];
		}
		sum = sum / n;
		for (i = 0;i <= n - 2;i++)
		{
			for (j = 0;j <= i;j++)
			{
				if (a[j + 1] < a[j])
				{
					k = a[j + 1];
					a[j + 1] = a[j];
					a[j] = k;
				}
			}
		}
		if (sum - a[0] == a[n - 1] - sum)
		{
			System.out.printf("%d,%d\n",a[0],a[n - 1]);
		}
		else
		{
			System.out.printf("%d\n",(sum - a[0] > a[n - 1] - sum)?a[0]:a[n - 1]);
		}
	}
}

