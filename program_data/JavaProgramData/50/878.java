package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int[] b = new int[20];
		int i;
		int[] sum = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		for (i = 0;i < 12;i++)
		{
			if (i == 0)
			{
				sum[i] = 0;
			b[i] = (sum[i] + w - 1 + 13) % 7;
			}
			else
			{
			sum[i] = a[i] + sum[i - 1];
			b[i] = (sum[i] + w - 1 + 13) % 7;
			}
			if (b[i] == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
		return 0;
	}

}

