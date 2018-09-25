package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
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

					t = b[j];
					b[j] = b[j - 1];
					b[j - 1] = t;
				}
			}
		}

		int s = 0;
		for (i = 1;i < n;i++)
		{
			for (j = i - 1;j > -1;j--)
			{
					if (a[i] < b[j] + 1)
					{
						s = 1;
					}
					if (s == 1)
					{
						break;
					}

			}

			if (s == 0)
			{
				System.out.print("no");
				break;

			}

			if (s == 1)
			{
				if (i < n - 1)
				{
					s = 0;
				}
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

				if (b[j] < b[j - 1])
				{
					t = b[j];
					b[j] = b[j - 1];
					b[j - 1] = t;
				}
			}
		}



		if (s == 1)
		{
			System.out.printf("%d %d",a[0],b[n - 1]);

		}


		return 0;
	}

}

