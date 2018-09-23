package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
			a[0] = m;
			for (i = 0;a[i] >= 1;i++)
			{
				if (a[i] % 2 == 0)
				{
				a[i + 1] = a[i] / 2;
				}
				if (a[i] % 2 == 1)
				{
					a[i + 1] = (a[i] - 1) / 2;
				}
			}
			b[0] = n;
			for (j = 0;b[j] >= 1;j++)
			{
						if (b[j] % 2 == 0)
						{
						b[j + 1] = b[j] / 2;
						}
						if (b[j] % 2 == 1)
						{
							b[j + 1] = (b[j] - 1) / 2;
						}
			}
			for (i = 0;a[i] >= 1;i++)
			{
				for (j = 0;b[j] >= 1;j++)
				{
					if (b[j] == a[i])
					{
						k = a[i];
						break;
					}
				}
				if (k == a[i])
				{
				break;
				}

			}
			System.out.printf("%d",k);
	}
}

