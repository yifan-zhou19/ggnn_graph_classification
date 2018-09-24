package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int t;
		int k;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (k = n - m;k < n;k++)
		{
			for (j = 0,i = k;j < n - m;j++,i--)
			{
			t = a[i];
			a[i] = a[i - 1];
			a[i - 1] = t;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n - 1]);
	}
}

