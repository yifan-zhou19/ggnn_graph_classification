package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int[] c = new int[20000];
		int i;
		int j;
		int x = 0;
		int y = 0;
		int k = 0;


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

		for (i = 0; i < n; i++)
		{
			for (j = 0; j < 20000; j++)
			{
				if (j % 2 == 0)
				{
					if (j / 2 >= a[i] != 0 && j / 2 <= b[i])
					{
						c[j] = 1;
					}
				}
				else
				{
					if ((j - 1) / 2 >= a[i] != 0 && (j + 1) / 2 <= b[i])
					{
						c[j] = 1;
					}
				}
			}
		}



		for (i = 0; i <= 20000; i++)
		{
			if (c[i] == 1)
			{
				x = i;
				break;
			}
		}

		for (i = 20000; i >= x; i--)
		{
			if (c[i] == 1)
			{
				y = i;
				break;
			}
		}

		for (i = x; i <= y; i++)
		{
			if (c[i] == 0)
			{
				System.out.print("no\n");
				break;
			}
			else
			{
				k++;
				continue;
			}
		}
		if (k == y - x + 1)
		{
			System.out.printf("%d %d", x / 2, y / 2);
		}

		return 0;
	}

}

