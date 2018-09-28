package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k;
		int j;
		int r;
		int[] a = new int[300];
		int[] index = new int[300];
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
			{
				for (k = 0;k < i;k++)
				{
					if (a[i] == a[k])
					{
						index[i] = 1;
					}
				}
		}
		}
	for (r = n - 1;r >= 0;r--)
	{
			if (index[r] == 0)
			{
				break;
			}
	}
		for (j = 0;j < n;j++)
		{
			if (index[j] == 1)
			{
				continue;
			}
			System.out.printf("%d",a[j]);
		if (j == r)
		{
			break;
		}

	System.out.print(",");
		}

	}




}

