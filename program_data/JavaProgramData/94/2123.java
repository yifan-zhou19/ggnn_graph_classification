package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int b = 0;
		int j;
		int c;
		int[] a = new int[501];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 1;j < N;j++)
		{
			for (i = 0;i < N;i++)
			{
				if (a[i] > a[i + 1])
				{
					c = a[i + 1];
					a[i + 1] = a[i];
					a[i] = c;
				}
			}
		}

		for (i = 1;i <= N;i++)
		{
			if (a[i] % 2 == 1 && b == 0)
			{
				System.out.printf("%d",a[i]);
				b = b + 1;
			}
			else if (a[i] % 2 == 1 && b != 0)
			{
				System.out.printf(",%d",a[i]);
			}
	//		else
	//			continue;
		}

		return 0;
	}

}

