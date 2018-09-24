package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		int j;
		int n;
		int test;
		int[] a = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = n + k;;i = i + n)
		{
				a[0] = i;
				for (j = 0;j < n - 1;j++)
				{
					test = n * a[j] - k + n * k;
					if (test % (n - 1) != 0)
					{
					  j = 0;
					  break;
					}
					 else
					 {
					a[j + 1] = test / (n - 1);
					 }
				}

				if (j == n - 1)
				{
				System.out.printf("%d\n",a[n - 1]);
				break;
				}
		}

	}
}

