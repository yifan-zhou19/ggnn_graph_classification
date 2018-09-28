package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		int[] a = new int[1000];
		int[] b = new int[1000];
		int n;
		int i;
		int j;
		int max;
		int[] c = new int[1000];
		int num;
		int t;
		int s;
		int k;
		for (k = 0;k < 1000;k++)
		{
			num = 0;
			max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			break;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}

			for (j = 0;j < n - 1;j++)
			{
			for (i = 0;i < n - 1 - j;i++)
			{
				if (a[i] < a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
				if (b[i] < b[i + 1])
				{
					s = b[i];
					b[i] = b[i + 1];
					b[i + 1] = s;
				}
			}
			}

		for (i = 0;i < n;i++)
		{
				if (b[i] > a[i])
				{
					num = num + 200;
				}
				if (b[i] < a[i])
				{
					num = num - 200;
				}
		}
				c[n - 1] = num;

			for (j = 0;j < n - 1;j++)
			{
				num = 0;
	t = b[n - 1];
				for (i = 0;i < n - 1;i++)
				{

					b[n - 1 - i] = b[n - 2 - i];

				}
	b[0] = t;
				for (i = 0;i < n;i++)
				{
				if (b[i] > a[i])
				{
					num = num + 200;
				}
				if (b[i] < a[i])
				{
					num = num - 200;
				}
				}
				c[j] = num;
			}
			max = c[0];
	for (j = 0;j < n;j++)
	{
				if (c[j] > max)
				{
					max = c[j];
				}
	}


			System.out.printf("%d\n",max);
		}




	}
}

