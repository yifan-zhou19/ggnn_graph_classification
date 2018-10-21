package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[10000];
		int[] d = new int[1000];
		int i;
		int j;
		int n;
		int b;
		int m;
		int k;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",a[0]);
		d[0] = a[0];
		for (i = 1; i < n; i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[i] == d[j])
				{
					break;
				}
			d[i] = a[i];
			if (j == i - 1)
			{
			System.out.printf(",%d",a[i]);
			}
			}
		}
	}

}

