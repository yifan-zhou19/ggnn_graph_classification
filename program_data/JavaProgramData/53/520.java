package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int i;
		int n;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		b[0] = a[0];
		k++;
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < k;j++)
			{
				if (a[i] == b[j])
				{
			break;
				}
			}

			if (j == k)
			{
				b[k++] = a[i];
			}

		}
		k--;
		for (i = 0;i < k;i++)
		{
		System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[k]);
	}
}

