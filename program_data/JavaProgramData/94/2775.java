package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int p;
		int q;
		int r;
		int s;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		j = 1;
		int[] a = new int[100];
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			if (k % 2 == 1)
			{
				a[j] = k;
				j++;
			}
		}
		l = j - 1;
		for (i = 1;i <= l;i++)
		{
			for (j = i;j <= l;j++)
			{
				if (a[i] >= a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.printf("%d",a[1]);
		for (i = 2;i <= l;i++)
		{
			System.out.printf(",%d",a[i]);
		}
		return 0;
	}

}

