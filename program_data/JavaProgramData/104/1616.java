package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int r1;
		int r2;
		int a1;
		int b1;
		int x;
		int y;
		int[] a = new int[100];
		int[] b = new int[100];
		int r;
		int result = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}

		for (i = x,k = 0;i >= 1;i = i / 2,k++)
		{
			a[k] = i;
		}

		for (i = y,k = 0;i >= 1;i = i / 2,k++)
		{
			b[k] = i;
		}

		for (i = 0,k = 0;;i++)
		{
			if (a[i] == 0)
			{
				break;
			}
			for (j = 0;;j++)
			{
				if (b[j] == 0)
				{
					break;
				}
				else if (b[j] == a[i])
				{
						result = a[i];
						k++;
						break;
				}
			}
			if (k != 0)
			{
				break;
			}
		}
		System.out.printf("%d\n",result);

	}
}

