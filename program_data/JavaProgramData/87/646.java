package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
		int i;
		int n;
		int sum;
		int[] a = new int[10];
		for (i = 1;i < 100;i++)
		{
			sum = 0;
			for (i = 0;i < 6;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
			}
			if (a[1] == 0 && a[2] == 0)
			{
				break;
			}
			if (a[3] < 12)
			{
				a[3] += 12;
			}
			sum = a[3] * 3600 + a[4] * 60 + a[5] - a[0] * 3600 - a[1] * 60 - a[2];
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

