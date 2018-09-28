package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int i;
		int j;
		int k;
		int n;
		int s = 0;
		int t;
		int tt;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			if (k % 2 != 0)
			{
				s++;
				a[s] = k;
			}
		}

		for (i = 1;i <= s;i++)
		{
			for (j = 1;j <= s - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					tt = a[j];
				  a[j] = a[j + 1];
				  a[j + 1] = tt;

				}
			}
		}
		System.out.printf("%d",a[1]);
		for (i = 2;i <= s;i++)
		{
			System.out.printf(",%d",a[i]);
		}

	  return 0;
	}
}

