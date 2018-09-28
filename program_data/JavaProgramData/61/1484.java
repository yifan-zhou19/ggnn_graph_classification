package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[5000];
		int[] b = new int[1000];
		int i;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		a[0] = 1;
		a[1] = 1;
		for (i = 0;i < 1000;i++)
		{
			a[i + 2] = a[i + 1] + a[i];
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		 for (i = 0;i < k - 1;i++)
		 {
			 System.out.printf("%d\n",a[b[i] - 1]);
		 }
		 System.out.printf("%d",a[b[k - 1] - 1]);
		return 0;
	}

}

