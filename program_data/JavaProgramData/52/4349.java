package <missing>;

public class GlobalMembers
{
	public static void swap(int[] a, int n, int m)
	{
		int temp;
		temp = a[m];
		a[m] = a[n];
		a[n] = temp;
	}
	public static void circle(int[] a, int l)
	{
		int i;
		for (i = 0;i < l;i++)
		{
			swap(a, 0, i);
		}
	}
	public static void Main()
	{
		int l;
		int k;
		int i;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < l;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < k;i++)
		{
			circle(a, l);
		}
		for (i = 0;i < l - 1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d\n",a[i]);
	}
}

