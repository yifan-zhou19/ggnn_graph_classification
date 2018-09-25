package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int i;
		int m;
		int k;
		int[] a = new int[60];
		int[] count = {60, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			count[i] = 60;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m != 0)
			{
				for (k = 1;k <= m;k++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[k] = Integer.parseInt(tempVar3);
					}
					if ((a[k] + 3 * k - 3) < 57)
					{
						count[i] = count[i] - 3;
					}
					else if ((a[k] + 3 * k - 3) < 63)
					{
						count[i] = a[k];
					}
				}
			}
			System.out.printf("%d\n",count[i]);
		}
		return 0;
	}
}

