package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int[] a = new int[300];
		int[] b = new int[300];
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
		i = 1;
		for (j = 1;j < n;j++)
		{
			for (k = 0;k < i;k++)
			{
				if (a[j] == b[k])
				{
					break;
				}
			}
			if (k < i)
			{
				continue;
			}
			else
			{
				b[i] = a[j];
				i++;
			}
		}
		for (j = 0;j < i - 1;j++)
		{
			System.out.printf("%d,",b[j]);
		}
		System.out.printf("%d",b[j]);
	}
}

