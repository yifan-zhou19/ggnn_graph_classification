package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[N];
		int[] b = new int[N];
		int n;
		int i;
		int j;
		int t;
		int flag;

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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}

		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - j - 1;i++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
					t = b[i];
					b[i] = b[i + 1];
					b[i + 1] = t;
				}
			}
		}


		for (i = 0,flag = 1;i < n;i++)
		{
			if (i == 0)
			{
				continue;
			}

			else if (a[i] == a[i - 1])
			{
				if (b[i] >= b[i - 1])
				{
				}
				else if (b[i] < b[i - 1])
				{
					b[i] = b[i - 1];
				}
			}
			else if (a[i] <= b[i - 1])
			{
				a[i] = a[i - 1];
				if (b[i] >= b[i - 1])
				{
				}
				else if (b[i] < b[i - 1])
				{
					b[i] = b[i - 1];
				}
			}
			else if (a[i] > b[i - 1])
			{
				flag = 0;
				break;
			}
		}

		if (flag == 0)
		{
			System.out.print("no\n");
		}
		else if (flag == 1)
		{
			System.out.printf("%d %d\n",a[n - 1],b[n - 1]);
		}

		return 0;
	}
}

