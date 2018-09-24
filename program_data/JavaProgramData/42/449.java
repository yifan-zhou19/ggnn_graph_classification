package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k;
		int[] a = new int[100000];
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != k)
			{
				 a[j] = a[i];
				if (j == 0)
				{
					System.out.printf("%d",a[j]);
				}
				if (j != 0)
				{
					System.out.printf(" %d",a[j]);
				}
				j++;

			}

		}

	}

}

