package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int[] a = new int[300];
		int[] b = new int[300];
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
			for (j = 0;j < i;j++)
			{
			if (a[j] == a[i])
			{
			 break;
			}
			}
			if (j == i)
			{
						b[k] = a[i];
						k = k + 1;
			}

		}
	for (i = 0;i < k;i++)
	{
	System.out.printf("%d",b[i]);
	if (i < k - 1)
	{
	System.out.print(",");
	}
	}
		return 0;
	}

}

