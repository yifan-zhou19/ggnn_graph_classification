package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int i;
		int j;
		int k;
		int[] a = new int[500];
		int sum = 0;
		int[] b = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i - 1] = Integer.parseInt(tempVar2);
			}
			if ((a[i - 1] % 2) != 0)
			{
					sum += 1;
					b[sum - 1] = a[i - 1];
			}
		}
		for (j = 1;j < sum;j++)
		{
				for (i = 1;i < sum - j + 1;i++)
				{
				if (b[i - 1] > b[i])
				{
						k = b[i - 1];
						b[i - 1] = b[i];
						b[i] = k;
				}
				}
		}

		for (i = 1;i <= sum;i++)
		{
				System.out.printf("%d",b[i - 1]);
				if (i == sum)
				{
					break;
				}
				System.out.print(",");
		}
			return 0;
	}
}

