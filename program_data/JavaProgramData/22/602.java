package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int[] a = new int[300];
		int j;
		int k;
		int p = 0;
		for (i = 0;i < 300;i++)
		{
			if (i == 0)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
			}
			else
			{
				String tempVar2 = ConsoleInput.scanfRead(",");
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}

		}

		if (a[1] != 0)
		{
		for (i = 0;i <= 300;i++)
		{
			for (j = 0;j < 299 - i;j++)
			{
				if (a[j] < a[j + 1])
				{
					k = a[j];
					a[j] = a[j + 1];
					a[j + 1] = k;
				}
			}
		}
		i = 0;
		j = 1;
		k = 0;
		for (k = 0;k < 300;k++)
		{
			p = p + a[k];
			if (a[k] != 0)
			{
			i++;
			}
		}

		j = a[0] * i;
		i = 0;
		k = 0;
		while (k < 300)
		{
			if (a[i] == a[i + 1])
			{
				i++;
			}
			k++;
		}
		if (p != j)
		{
		System.out.printf("%d\n",a[i + 1]);
		}
		else
		{
			System.out.print("No\n");
		}
		}
		else
		{
			System.out.print("No\n");
		}
	}
}

