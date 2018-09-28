package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		int t;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int m = 0;
		int temp = 0;
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
				(a[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				if (a[j] < a[j - 1])
				{
					t = a[j];
				a[j] = a[j - 1];
				a[j - 1] = t;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] % 2 != 0)
			{
			b[m] = a[i];
			m++;
			temp++;
			}

		}
		for (m = 0;m < temp;m++)
		{
			if (b[m + 1] > b[m])
			{
			 System.out.printf("%d,",b[m]);
			}
			else
			{
				System.out.printf("%d",b[m]);
			}
		}
			return 0;


	}
}

