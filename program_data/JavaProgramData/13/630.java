package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20000];
		int n;
		int i;
		int j;
		int k;
		i = 0;
		k = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d",a[i]);
		}
		else
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d",a[i]);
			for (i = 1;i < n;i++,k++)
			{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = Integer.parseInt(tempVar4);
			}
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					break;
				}
			}
			if (k < (n - 1))
			{
				if (i == j)
				{
			System.out.printf(" %d",a[i]);
				}
			}
			else
			{
					for (j = 0;j < i;j++)
					{
				if (a[i] == a[j])
				{
					break;
				}
					}
					if (i == j)
					{
				System.out.printf(" %d",a[i]);
					}
			}
			}
		}
		return 0;
	}


}

