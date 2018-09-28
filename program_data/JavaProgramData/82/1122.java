package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int m;
		int g;
		int[] a = new int[105];
		int[] b = new int[105];
		int[] e = new int[105];
		int normal = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j = 0;

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		if (n == 1)
		{
			if (a[0] >= 90 && a[0] <= 140 && b[0] >= 60 && b[0] <= 90)
			{
			   System.out.print("1");
			   return 0;
			}
			   else
			   {
			   System.out.print("0");
			   return 0;
			   }
		}

		for (i = 0;i < n;i++)
		{
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90 && a[i + 1] >= 90 && a[i + 1] <= 140 && b[i + 1] >= 60 && b[i + 1] <= 90)
			{
				normal++;
			}
			else
			{
				if (i < n - 1)
				{
					if (normal == 0)
					{
					  e[j] = normal;
					  j++;
					}
				else
				{
					e[j] = normal + 1;
				normal = 0;
				j++;

				}
				}

				else if (i == n - 1)
				{
					if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
					{
						e[j] = normal + 1;

					}
					else
					{
						e[j] = 0;
					}
				}


			}
		}




		for (k = 1;k <= j;k++)
		{
			for (i = 0;i < j + 1 - k;i++)
			{
				if (e[i] > e[i + 1])
				{
					m = e[i + 1];
					e[i + 1] = e[i];
					e[i] = m;
				}
			}
		}
		if (e[j] == 0)
		{
			for (i = 0;i < n;i++)
			{
				if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
				{
					System.out.print("1");
					return 0;
				}
			}
			System.out.print("0");
			return 0;
		}
		System.out.printf("%d",e[j]);
		return 0;

	}


}

