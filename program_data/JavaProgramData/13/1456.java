package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20000];
		int i;
		int j;
		int t;
		int l = 1;
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
		if (n == 1)
		{
			System.out.printf("%d",a[0]);
			return 0;
		}
		System.out.printf("%d",a[0]);
		t = n;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					t = t - 1;
					break;
				}

			}

		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					break;
				}
				else if (j == i - 1 && l < t)
				{

					System.out.printf(" %d",a[i]);
				}




			}

		}


		return 0;
	}
}

