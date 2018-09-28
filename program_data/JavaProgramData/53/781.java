package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int n;
		int i;
		int j;
		int k = 0;
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
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i] == a[j])
				{
					a[j] = 0;
				}
				else
				{
					continue;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != 0)
			{
				b[k] = a[i];
				k++;
			}
			else
			{
				continue;
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i <= k - 1;i++)
		{
			System.out.printf(",%d",b[i]);
		}
	}
}

