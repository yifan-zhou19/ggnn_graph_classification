package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int[] b = new int[300];
		int i;
		int j;
		int k;
		int c;
		int x;
		int z = 0;
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
				(a + i) = tempVar2;
			}
		}
		for (x = 0;x < n;x++)
		{
			for (j = 0;j < n;j++)
			{
				if (x != a[j])
				{
					z = 0;
				}
				else
				{
					z = 1;
					break;
				}
			}
			if (z == 0)
			{
				break;
			}
		}
		for (i = 0,j = 0;i < n;i++)
		{
			if (a[i] != x)
			{
				b[j] = a[i];
				for (k = i + 1;k < n;k++)
				{
					if (a[k] == a[i])
					{
						a[k] = x;
					}
				}
				j++;
			}
		}
		if (n == 1)
		{
			System.out.printf("%d",b[0]);
		}
		else
		{
			for (i = 0;i < j - 1;i++)
			{
				System.out.printf("%d,",b[i]);
			}
			System.out.printf("%d\n",b[j - 1]);
		}
	}
}

