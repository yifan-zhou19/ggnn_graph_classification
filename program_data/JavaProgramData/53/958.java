package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[300];
		int[] b = new int[300];
		int j = 1;
		int m;
		int k;
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
		b[0] = a[0];
		for (i = 0;i < n;i++)
		{
			m = 0;
			for (k = 0;k < j;k++)
			{
				if (a[i] == b[k])
				{
					m = 1;
					break;
				}
			}
			if (m == 0)
			{
				b[j] = a[i];
				j++;
			}
		}
		if (j == 1)
		{
			System.out.printf("%d",b[0]);
		}
		else
		{
			System.out.printf("%d",b[0]);
			for (k = 1;k < j;k++)
			{
				System.out.printf(",%d",b[k]);
			}
		}
	}
}

