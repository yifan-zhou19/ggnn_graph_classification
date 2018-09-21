package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int s = 0;
		int[] b = new int[300];
		int temp;
		int n;
		int[] a = new int[300];
		int tem;
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
			s = s + a[i];
		}
		for (i = 0;i < n;i++)
		{
			b[i] = Math.abs(n * a[i] - s);
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (b[j] > b[i])
				{
					temp = b[j];
					b[j] = b[i];
					b[i] = temp;
					tem = a[j];
					a[j] = a[i];
					a[i] = tem;
				}
			}
		}
		j = 1;
		for (i = 1;i < n;i++)
		{
			if (b[i] >= b[0])
			{
			j++;
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d",a[j - 1]);
	}

}

