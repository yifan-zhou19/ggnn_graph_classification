package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int k;
		int max;
		int maxj;
		int n;
		int d = 0;
		int flag;
		char ch;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		for (n = 1;ch = System.in.read() != '\n';n++)
		{
			scanf(",");
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[n] = Integer.parseInt(tempVar2);
			}
		}


		if (n == 1)
		{
			System.out.print("No\n");
		}
		else
		{

			for (i = 1;i < n;i++)
			{
			if (a[i] != a[0])
			{
				d++;
			}
			}
			if (d == 0)
			{
				System.out.print("No\n");
			}
			else
			{

			max = a[0];
			for (j = 1;j < n;j++)
			{
				if (a[j] >= max)
				{
					max = a[j];
					flag = j;
				}
			}
			for (i = 0;i < n;i++)
			{
				if (a[i] != max)
				{
					maxj = a[i];
					break;
				}
			}
				for (k = n - 1;k >= 0;k--)
				{
					if (a[k] >= maxj != 0 && a[k] < max)
					{
						maxj = a[k];
					}
				}
					System.out.printf("%d\n",maxj);
			}

		}
	}








}

