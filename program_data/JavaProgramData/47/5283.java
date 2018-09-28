package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] b = new int[100];
		int[] a = new int[100];
		int i = 0;
		int n;
		int j = 0;
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
		for (i = 0;i < n - 1;i++)
		{
			b[i] = a[n - i - 1];
			System.out.printf("%d ",b[i]);
		}
			 if (i = n - 1)
			 {
			  b[i] = a[0];
			  System.out.printf("%d",b[i]);
			 }
		return 0;

	}

}

