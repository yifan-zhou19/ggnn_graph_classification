package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[160];
		int i;
		int j;
		int k;
		int m;
		int n;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int [160])malloc(110 * (Integer.SIZE / Byte.SIZE));

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}

		for (j = 0;j < m;j++)
		{
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] + i = tempVar3;
				}
			}
		}

	for (k = 0;k < n;k++)
	{

				for (j = 0, i = k;i >= 0 && j < m;j++, i--)
				{
					if (i >= 0 && i < n && j >= 0 && j < m)
					{
				System.out.printf("%d\n",*(a[j] + i));
					}
				}

	}
		for (k = 1;k < m;k++)
		{
		for (j = k, i = 0;j < m && i <= n - 1;j++, i++)
		{
		System.out.printf("%d\n",*(a[j] + n - i - 1));
		}
		}


	}

}

