package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int t;
		int flag = 0;
		int[] a = new int[30];
		int[] b = new int[30];
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
		for (i = n - 1;i >= 0;i--)
		{
		b[i] = 1;
		for (j = n - 1;j >= i;j--)
		{
			if (a[i] >= a[j])
			{
				flag = 1;
			if (b[i] < b[j])
			{
			b[i] = b[j];
			}
			}
		}
		b[i] = b[i] + 1;
		if (flag == 0)
		{
		   b[i] = 1;
		}
		}
		for (i = 0;i < n;i++)
		{
			if (b[0] < b[i])
			{
		b[0] = b[i];
			}
		}
		System.out.printf("%d",b[0] - 1);
	}

}

