package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int temp;
		int max;
		int min;
		int[] a = new int[100];
		int n;
		int i;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= i; j++)
			{
				if (a[i] >= a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.printf("%d\n%d", a[1], a[2]);
	}
}

