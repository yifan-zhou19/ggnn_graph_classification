package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int[] a = new int[100];
		int tem = 0;
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		if (n % 2 != 0)
		{
			for (i = 0;i <= n / 2;i++)
			{
			tem = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = tem;
			}
		}
		if (n % 2 == 0)
		{
			for (i = 0;i <= n / 2 - 1;i++)
			{
			tem = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = tem;
			}
		}
		for (i = 1;i < n;i++)
		{
		System.out.printf("%d ",a[i - 1]); //?i?1?????a[i-1]????????a[i-2]????????????
		}
		System.out.printf("%d",a[i - 1]); //(???????????????)
		return 0;

	}
}

