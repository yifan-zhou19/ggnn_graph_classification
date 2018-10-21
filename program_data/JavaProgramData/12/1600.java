package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		while (true)
		{
			int[] a = new int[20];
			int sum = 0;
			for (i = 0;;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				if (a[i] == 0)
				{
					k = i;
					break;
				}
			}
			if (a[0] == -1)
			{
				break;
			}
			for (i = 0;i < k;i++)
			{
				for (j = i;j < k;j++)
				{
					if (a[j] == 2 * a[i] || 2 * a[j] == a[i])
					{
						sum++;
					}
				}
			}
			System.out.printf("%d\n",sum);
		}
	}

}

