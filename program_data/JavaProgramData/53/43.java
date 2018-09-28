package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[300];
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
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[j] == a[i])
				{
					for (k = j;k < n - 1;k++)
					{
						a[k] = a[k + 1];
					}
					if (a[j] == a[i])
					{
						j--;
					}
					n--;
				}
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(",%d",a[i]);
		}
	}

}

