package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[6];
		int i;
		int j;
		int k;
		int t;
		int sum;
		while (t < 1000)
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
			if (a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] == 0 && a[4] == 0 && a[5] == 0)
			{
				break;
			}
			a[3] = a[3] + 12;
			sum = (a[3] - a[0]) * 60 * 60 + (a[4] - a[1]) * 60 + (a[5] - a[2]);
			System.out.printf("%ld\n",sum);
		}
		return 0;
	}
}

