package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int[] a = new int[20000];
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n >= 1 && n <= 20000)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[0] = Integer.parseInt(tempVar2);
			}
			for (i = 1; i < n; i++)
			{
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
			}
			for (i = 0, m = 0; i < n - m - 1; i++)
			{
				for (j = i + 1; j < n - m; j++)
				{
					if (a[i] != a[j])
					{
						continue;
					}
					else
					{
						for (k = j; k < n - m - 1; k++) //?????????????????????
						{
							a[k] = a[k + 1];
						}
						m++;
						j--;
					}
				}
			}
			System.out.printf("%d",a[0]);
			for (i = 1; i < n - m; i++)
			{
				System.out.printf(" %d",a[i]);
			}
		}
	}


}

