package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		int count;
		int key;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		count = 0;
		key = 0;
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[j] = Integer.parseInt(tempVar2);
				}

			}
			for (j = 0;j < n;j++)
			{
				if (a[j] == 0 && a[j + 1] == 0)
				{
					break;
				}
				if (a[j] == 0)
				{
					key = 1 - key;
				}
				if (a[j] * key != 0)
				{
					count = count + 1;
				}
			}



		}
		System.out.printf("%d",count);
		return 0;
	}

}

