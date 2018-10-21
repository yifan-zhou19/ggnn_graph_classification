package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int n;
		int m;
		int i;
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
		}
		for (j = 0,i = n - m;i < n;j++,i++)
		{
		b[j] = a[i];
		}
		for (i = 0,j = m;j < n;i++,j++)
		{
		b[j] = a[i];
		}
		for (i = 0;i < n - 1;i++)
		{
		System.out.printf("%d ",b[i]);
		}
		if (i = n - 1)
		{
			System.out.printf("%d",b[i]);
		}
	}
}

