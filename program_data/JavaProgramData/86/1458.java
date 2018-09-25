package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int k;
		int e = 0;
		int t = 0;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			e = 0;
			t = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}
			}
			for (j = 0;j < m;j++)
			{
				t = 3 * j + a[j];
				if (t >= 57 && t <= 60)
				{
					System.out.printf("%d\n",a[j]);
					break;
				}
				if (t > 60)
				{
					a[j] -= t - 60;
					System.out.printf("%d\n",a[j]);
					break;
				}
			}
			if (t < 57)
			{
				System.out.printf("%d\n",60 - 3 * m);
			}

		}

		return 0;
	}

}

