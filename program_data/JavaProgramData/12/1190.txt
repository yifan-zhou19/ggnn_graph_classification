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
			int[] a = new int[16];
			int i;
			int j = 0;
			int k;
			int sum = 0;
			a[j] = b;
			while (a[j] != 0)
			{
				j++;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[j] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < j - 1;i++)
			{
				for (k = i + 1;k < j;k++)
				{
					if (a[k] == a[i] * 2 || a[i] == a[k] * 2)
					{
						sum++;
					}
				}
			}
			System.out.printf("%d\n",sum);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
		}
	}

}

