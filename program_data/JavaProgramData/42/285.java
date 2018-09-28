package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int j;
		int i;
		int sum = 0;

		int[] a = new int[1000000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j <= n - 1;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (j = 0;j < n;j++)
		{
			if (a[j] == k)
			{
				{
			   for (i = j;i < n;i++)
			   {

				   a[i] = a[i + 1];
			   }
			}
			   sum = sum + 1;

			   j = j - 1;
			}
			else
			{
				a[j] = a[j];
			}

		}

		System.out.printf("%d",a[0]);
		for (j = 1;j < n - sum;j++)
		{
			System.out.printf(" %d",a[j]);
		}
	}

}

