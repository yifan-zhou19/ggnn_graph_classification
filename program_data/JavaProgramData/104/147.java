package <missing>;

public class GlobalMembers
{
	public static int next(int x)
	{
		int z;
		if (x % 2 == 0)
		{
			z = x / 2;
		}
		else
		{
			z = (x - 1) / 2;
		}
		return (z);
	}
	public static int Main()
	{
		int x;
		int y;
		int i;
		int j;
		int num1 = 1;
		int num2 = 1;
		int[] z = new int[11];
		int k = 0;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}

		a[0] = x;
		b[0] = y;
		for (i = 1;;i++)
		{
			a[i] = next(x);
			x = a[i];
			num1++;
			if (a[i] == 1 || a[i - 1] == 1)
			{
				break;
			}
		}
		for (i = 1;;i++)
		{
			b[i] = next(y);
			y = b[i];
			num2++;
			if (b[i] == 1 || b[i - 1] == 1)
			{
				break;
			}
		}

		for (i = 0;i < num1;i++)
		{
			for (j = 0;j < num2;j++)
			{
				if (a[i] == b[j])
				{
					z[k] = a[i];
					k++;
				}

			}
		}
		System.out.printf("%d\n",z[0]);

	}
}

