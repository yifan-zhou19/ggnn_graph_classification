package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int e;
		int m = 0;
		int[] a = new int[501];
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
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					e = a[j + 1];
					a[j + 1] = a[j];
					a[j] = e;
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			if (a[j] % 2 != 0)
			{
			 if (m == 0)
			 {
				 System.out.printf("%d",a[j]);
			 }
			 else
			 {
				 System.out.printf(",%d",a[j]);
			 }
			 m++;
			}
		}



		return 0;
	}

}

