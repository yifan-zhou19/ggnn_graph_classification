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
		int t;
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
			for (j = 0;j < n;j++)
			{
				if (a[j] == b[k])
				{
					a[j] = 0;
				}
			}
			k++;
			for (t = i + 1;t < n;t++)
			{
				if (a[t] != 0)
				{
					b[k] = a[t];
					break;
				}
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < n;i++)
		{
			if (b[i] == 0)
			{
				break;
			}
			System.out.printf(",%d",b[i]);
		}
	}
}

