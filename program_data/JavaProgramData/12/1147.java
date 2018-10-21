package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		while (b != -1)
		{
			int[] a = new int[15];
			int i = 1;
			int k;
			int j;
			int sum = 0;
			a[0] = b;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			while (a[i] != 0)
			{
				i++;
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
			}
			for (k = 0;k < i;k++)
			{
				for (j = k + 1;j < i;j++)
				{
					if (a[j] == 2 * a[k] || a[k] == 2 * a[j])
					{
						sum++;
					}
				}
			}
			System.out.printf("%d\n",sum);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b = Integer.parseInt(tempVar4);
			}
		}
	}
}

