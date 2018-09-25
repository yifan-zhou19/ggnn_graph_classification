package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void pai(int na,int nb);
		int na;
		int nb;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			na = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			nb = Integer.parseInt(tempVar2);
		}
		pai(na, nb);

	}

	public static void pai(int na,int nb)
	{
		int t;
		int i;
		int j;
		int[] a = new int[200];
		int[] b = new int[100];
		for (i = 0;i < na;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < nb;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}

		for (j = 0;j < na - 1;j++)
		{
			for (i = 0;i < na - 1 - j;i++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}

		for (j = 0;j < nb - 1;j++)
		{
			for (i = 0;i < nb - 1 - j;i++)
			{
				if (b[i] > b[i + 1])
				{
					t = b[i];
					b[i] = b[i + 1];
					b[i + 1] = t;
				}
			}
		}

		for (j = 0;j < na;j++)
		{
			System.out.printf("%d ",a[j]);
		}
		for (j = 0;j < nb - 1;j++)
		{
			System.out.printf("%d ",b[j]);
		}
		System.out.printf("%d\n",b[nb - 1]);



	}


}

