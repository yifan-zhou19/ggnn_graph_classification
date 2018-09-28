package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[1000];
		int n;
		int m;
		int i;
		int count;
		int rest;

		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 && m == 0)
			{
				break;
			}

			for (i = 0;i < n;i++)
			{
				a[i] = 1;
			}
			count = 0;
			rest = n;
			i = 0;

			while (rest > 1)
			{
				while (a[i] == 1)
				{
					count++;
					if (count == m)
					{
						a[i] = 0;
						count = 0;
						rest--;
						if (rest == 1)
						{
							break;
						}
					}
					if (i < n - 1)
					{
						i++;
					}
					else if (i == n - 1)
					{
						i = 0;
					}
				}

				while (a[i] == 0)
				{
					if (i < n - 1)
					{
						i++;
					}
					else if (i == n - 1)
					{
						i = 0;
					}
				}
			}

			if (rest == 1)
			{
				for (i = 0;i < n;i++)
				{
					if (a[i] == 1)
					{
						System.out.printf("%d\n",i + 1);
					}
				}
			}
		}
	}
}

