package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int comp;
		int i;
		int j;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[300];
		int[] b = new int[300];



		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}



		if (n == 1)
		{
			System.out.printf("%d",a[0]);
		}



		else if (n >= 2)
		{
		for (i = 0;i <= n - 2;i++)
		{
			comp = a[i];
			for (j = i + 1;j <= n - 1;j++)
			{
				if (a[j] == comp)
				{
					a[j] = 1000;
				}
			}
		}

		p = 0;
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] != 1000)
			{
				b[p] = a[i];
				p++;
			}
		}

		for (i = 0;i <= p - 2;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[p - 1]);
		}



	}
}

