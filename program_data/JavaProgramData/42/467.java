package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100000];
		int i;
		int j;
		int k;
		int n;
		int t = 0;
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
			k = Integer.parseInt(tempVar3);
		}

		for (i = 0;i < n - t - 1;i++)
		{
			if (a[i] == k)
			{
				for (j = i;j < n - t - 1;j++)
				{
				a[j] = a[j + 1];
				}
				t++;
				i--;
			}
		}
			if (a[i] == k)
			{
			a[i] = '\0';
			t++;
			}


		for (i = 0;i < n - t - 1;i++)
		{
		System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[i]);
	}
}

