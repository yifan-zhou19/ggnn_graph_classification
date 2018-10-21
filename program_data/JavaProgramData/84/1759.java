package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int j;
		int m;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		};
		for (j = 0;j < 2;j++)
		{
			max = a[j];
			for (i = j + 1;i < n;i++)
			{
				if (a[i] > a[j])
				{
					m = a[i];
					a[i] = a[j];
					a[j] = m;
				}
			}
		}
			System.out.printf("%d\n",a[0]);
			System.out.printf("%d\n",a[1]);
		return 0;
	}

}

