package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[501];
		int[] b = new int[501];
		int temp;
		int i;
		int j;
		int k = 0;
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
			if (a[i] % 2 == 1)
			{
				b[k] = a[i];
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = i + 1;j < k;j++)
			{
				if (b[j] < b[i])
				{
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < k;i++)
		{
			System.out.printf(",%d",b[i]);
		}
		return 0;
	}





}

