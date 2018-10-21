package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[20000];
		int b = 0;
		int m = 0;
		int k = 0;
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
		for (i = 0;i < n;i++)
		{
		   for (j = i + 1;j < n;j++)
		   {
			   if (a[j] == a[i])
			   {
				   a[j] = 0;
			   }
		   }
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != 0)
			{
				m = m + 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != 0)
			{
				k = k + 1;
			}
			if (a[i] != 0 && k < m)
			{
				System.out.printf("%d ",a[i]);
			}
			if (a[i] != 0 && k == m)
			{
				System.out.printf("%d",a[i]);
			}
		}
	}
}

