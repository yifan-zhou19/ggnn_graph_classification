package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //n>=3&&n<=50000
		int i;
		int j;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int e;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					e = a[j];
					a[j] = a[j + 1];
					a[j + 1] = e;
					e = b[j];
					b[j] = b[j + 1];
					b[j + 1] = e;
				}
			}
		}
		e = 0;
		for (i = 0;i < n;i++)
		{
			if (b[i] >= a[i + 1])
			{
				a[i + 1] = a[i];
				if (b[i + 1] < b[i])
				{
					b[i + 1] = b[i];
				}
			}
			else
			{
				e = 1;
				break;
			}
		}
		if (e == 1)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",a[n - 1],b[n - 1]);
		}
		return 0;
	}
}

