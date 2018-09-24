package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n;
		int i;
		int j;
		int max = 0;
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
			max = a[i] > max != 0?a[i]:max;
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] <= max)
			{
				for (j = i + 1;j < n;j++)
				{
					if (a[j] == a[i])
					{
						a[j] = max + 1;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] <= max)
			{
				System.out.printf("%d",a[i]);
				break;
			}
		}
		for (j = i + 1;j < n;j++)
		{
			if (a[j] <= max)
			{
				System.out.printf(",%d",a[j]);
			}
		}
	}

}

