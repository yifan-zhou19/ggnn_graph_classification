package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int i;
		int n;
		int m;
		int[] b = new int[100];
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
			b[i] = a[i];
		}
		for (i = n - 1;i >= 0;i--)
		{
			a[i + m] = a[i];
		}
		for (i = 0;i < m;i++)
		{
			a[i] = b[i + n - m];
		}
		for (i = 0;i < n;i++)
		{
			if (i == n - 1)
			{
				System.out.printf("%d",a[i]);
				break;
			}
			System.out.printf("%d ",a[i]);
		}
	}

}

