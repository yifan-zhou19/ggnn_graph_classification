package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int[] a = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;i < n;)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}

				for (j = 0;j < i;)
				{
					if (m == a[j])
					{
						n--;
						break;
					}
					if (m != a[j])
					{
						j++;
					}
				}
				if (i == j)
				{
					a[i] = m;
					i++;
				}


		}
		for (k = 0;k < n - 1;k++)
		{
			System.out.printf("%d,",a[k]);
		}
		System.out.printf("%d",a[n - 1]);
		return 0;
	}
}

