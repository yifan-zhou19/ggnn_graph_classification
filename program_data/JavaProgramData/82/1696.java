package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 2 * n;i = i + 2)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i + 1] = Integer.parseInt(tempVar3);
			}
		}
		System.out.print("\n");
		for (i = 0,j = 0,k = 0;i < 2 * n;i = i + 2)
		{
			if (a[i] >= 90 && a[i] <= 140 && a[i + 1] >= 60 && a[i + 1] <= 90)
			{
				j = j + 1;
			}
			else
			{
				{
					if (j > k)
					{
					k = j;
					}
			}
				j = 0;
			}
		}
		if (j > k)
		{
			k = j;
		}

		System.out.printf("%d\n",k);


		return 0;

	}
}

