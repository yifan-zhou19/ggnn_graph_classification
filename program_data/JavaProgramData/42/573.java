package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100000];
		int i;
		int n;
		int m;
		int k;
		int j;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (k = 0,i = 0;i < n - k;)
		{
			if (a[i] == m)
			{
				for (j = i;j < n - k - 1;j++)
				{
					a[j] = a[j + 1];
				}
				k++;
			}
			else
			{
				i++;
			}
		}
		for (i = 0;i < n - k - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n - k - 1]);
	}

}

