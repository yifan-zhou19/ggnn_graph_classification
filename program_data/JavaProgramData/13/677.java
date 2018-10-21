package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = 0;
		int k = 0;
		int t = 0;
		int[] a = new int[90000];

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
		}

		System.out.printf("%d",a[0]);

		for (k = 1;k < n;k++)

		{
			t = 0;
			for (i = 0;i < k;i++)
			{
				if (a[k] == a[i])
				{
					t = 1;
				}

			}
		if (t == 0)
		{
		System.out.printf(" %d",a[k]);
		}

		}
	}
}

