package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int i;
		int j;
		int n;
		int m;
		int[] a = new int[15];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		while (k != -1)
		{
			n = 0;
			m = 0;
			i = 0;
			while (k != 0)
			{
				n++;
				a[i] = k;
				i++;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					k = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (a[i] == 2 * a[j] || a[j] == 2 * a[i])
					{
						m++;
					}
				}
			}
			System.out.printf("%d\n",m);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				k = Integer.parseInt(tempVar3);
			}
		}
	}
}

