package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int l;
		int p = 0;
		int[] a = new int[20];
		int[] b = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a[0] = m;
		b[0] = n;
		i = 0;
		j = 0;
		while (a[i] != 1)
		{
			a[i + 1] = a[i] / 2;
			i++;
		}
		while (b[j] != 1)
		{
			b[j + 1] = b[j] / 2;
			j++;
		}
		for (k = 0;k <= i;k++)
		{
			if (p == 1)
			{
				break;
			}
			else
			{
				for (l = 0;l <= j;l++)
				{
					if (a[k] == b[l])
					{
						System.out.printf("%d\n",a[k]);
						p = 1;
						break;
					}
				}
			}
		}


	return 0;
	}
}

