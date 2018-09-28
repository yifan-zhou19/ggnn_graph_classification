package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
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
		int i;
		int temp;
		int[] a = new int[101];
		for (i = n - 1;i >= 0;i--)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		while (m-- != 0)
		{

		temp = a[0];
		for (i = 0;i < n - 1;i++)
		{
		a[i] = a[i + 1];
		}
		a[n - 1] = temp;
		}
		for (i = n - 1;i > 0;i--)
		{
		System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d\n",a[i]);
	}
}

