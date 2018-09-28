package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int j;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[j]) = Integer.parseInt(tempVar2);
			}
		}
		for (j = n - 1,i = 0;j > -1;j--)
		{
			if (i < n - 1)
			{
				System.out.printf("%d ",a[j]);
				i++;
			}
			if (i == n - 1)
			{
				System.out.printf("%d",a[0]);
				i++;
			}
		}
		return 0;
	}
}

