package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int i;
		int j;
		int n;
		int m;
		int t;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			a[k] = m;
		}
		for (i = 0;i < (n + 1) / 2;i++)
		{
			t = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = t;
		}
		for (j = 0;j < n - 1;j++)
		{
			System.out.printf("%d ",a[j]);
		}
		System.out.printf("%d",a[n - 1]);
	}
}

