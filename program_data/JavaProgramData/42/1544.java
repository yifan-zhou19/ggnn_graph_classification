package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100001];
		int k;
		int i;
		int sum;
		sum = 0;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == k)
			{
					sum = sum + 1;
			}
			if (i == 0)
			{
				if (a[i] != k)
				{
					System.out.printf("%d",a[i]);
				}

			}
			if (i != 0)
			{

				if (a[i] != k)
				{
					if (i != sum)
					{
						System.out.printf(" %d",a[i]);
					}

					if (i == sum)
					{
						System.out.printf("%d",a[i]);
					}
				}
			}

		}








		return 0;
	}

}

