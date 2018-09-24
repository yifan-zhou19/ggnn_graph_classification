package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] k = new int[25];
		int[] a = new int[25];
		int maxk;
		int maxa;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k[i] = Integer.parseInt(tempVar2);
			}
		}
		a[0] = 1;
		maxk = 1;

		for (i = 1;i < n;i++)
		{
			maxa = 0;

			for (j = 0;j < i;j++)
			{
				if (k[j] >= k[i])
				{
					if (a[j] >= maxa)
					{
						maxa = a[j];
					}

				}

			}
			a[i] = maxa + 1;


			if (a[i] >= maxk)
			{
				maxk = a[i];
			}
		}
		System.out.printf("%d",maxk);


	}

}

