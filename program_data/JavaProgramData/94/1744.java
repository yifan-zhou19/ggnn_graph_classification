package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int t;
		int flag = 0;
		int[] a = new int[505];
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
			if (a[i] % 2 == 0)
			{
				a[i] = 0;
			}
		}


		for (k = n - 1;k > 0;k--)
		{
			for (i = 0;i < k;i++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}


		for (i = 0;i < n;i++)
		{
			if (a[i] != 0)
			{
				if (flag == 0)
				{
				System.out.printf("%d",a[i]);
				flag++;
				}
				else
				{
					System.out.printf(",%d",a[i]);
				}

			}
		}
		return 0;
	}




}

