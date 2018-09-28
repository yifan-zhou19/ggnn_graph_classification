package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int sum;
		int k;
		int n;
		int[] a = new int[300];
		int[] b = new int[300];
		int result;
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
		sum = 1;
		for (i = 1;i < n;i++)
		{
			result = 1;
			for (k = 0;k < sum;k++)
			{
				if (a[i] == b[k])
				{
					result = 0;
				}
			}
			if (result != 0)
			{
				b[sum] = a[i];
				sum++;
			}
		}
		System.out.printf("%d",b[0]);
		for (k = 1;k < sum;k++)
		{
			System.out.printf(",%d",b[k]);
		}
	}


}

