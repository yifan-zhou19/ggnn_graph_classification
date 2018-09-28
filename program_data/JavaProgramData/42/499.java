package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100001];
		int n;
		int i;
		int j;
		int x;
		int m;
		int t;
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
		a[n] = 0;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			x = Integer.parseInt(tempVar3);
		}
		for (m = 0,i = 0;i < n;i++)
		{
			if (a[i] == x)
			{
				t = i;
				for (j = t;j < n;j++)
				{
					a[j] = a[j + 1];
				}
				m++;
				i--;
			}
		}
		for (i = 0;i < n - m - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d\n",a[n - m - 1]);
	}

}

