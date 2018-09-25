package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] sum = new int[100];
		int i;
		int j;
		int k;
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
				j = Integer.parseInt(tempVar2);
			}
			for (k = 1;k <= j;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[k - 1] = Integer.parseInt(tempVar3);
				}
			}

			if (j == 0)
			{
				sum[i] = 60;
			}
			else if (j == 1)
			{
				if (a[0] <= 57)
				{
					sum[i] = 57;
				}
				else
				{
					sum[i] = a[0];
				}
			}

			else
			{
				if (a[j - 2] + 3 * (k - 1) >= 60)
				{
				j = j - 1;
				}


				if (a[j - 1] + 3 * j <= 60)
				{
					sum[i] = 60 - 3 * j;
				}
				else if (a[j - 1] + 3 * (j - 1) <= 60 && a[j - 1] + 3 * j>60)
				{
					sum[i] = a[j - 1];
				}

				else if (a[j - 2] + 3 * (j - 1) <= 60 && a[j - 1] + 3 * (j - 1)>60)
				{
					 sum[i] = 60 - 3 * (j - 1);
				}
				else
				{
					sum[i] = a[j - 2];
				}
			}
		}



		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",sum[i]);
		}
		return 0;
	}






}

