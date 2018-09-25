package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[500];
		int n;
		int b;
		int i = 0;
		int k;
		int p;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			if (b % 2 != 0)
			{
				a[i] = b;
				i++;
			}
		}
		for (j = 0;j < i;j++)
		{
			for (k = j + 1;k < i;k++)
			{
				if (a[j] > a[k])
				{
					p = a[j];
					a[j] = a[k];
					a[k] = p;
				}
			}
		}
		System.out.printf("%d",a[0]);
		for (j = 1;j < i;j++)
		{
			System.out.printf(",%d",a[j]);
		}
	}

}

