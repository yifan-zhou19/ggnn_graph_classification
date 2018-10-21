package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int j = 0;
		int k = 1;
		int m;
		int n = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		b[0] = a[0];
		for (i = 1;i < m;i++)
		{
			while (j < k && b[j] != a[i])
			{
				j++;
			}
			if (j == k)
			{
				k++;
				b[k - 1] = a[i];
				j = 0;
			}
			else
			{
				j = 0;
			}
		}

		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d\n",b[k - 1]);
	}

}

