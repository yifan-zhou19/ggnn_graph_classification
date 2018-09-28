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
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= k;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[j] = Integer.parseInt(tempVar3);
			}
			}
			for (j = 1;j <= k;j++)
			{
				sum = a[j] + 3 * (j - 1);
				if (sum >= 60)
				{
					System.out.printf("%d\n",60 - (j - 1) * 3);
					break;
				}
				else if (sum == 57 || sum == 58 || sum == 59)
				{
					System.out.printf("%d\n",a[j]);
					break;
				}
			}
			if (sum < 57)
			{
				System.out.printf("%d\n",60 - 3 * k);
			}
		}
	}
}

