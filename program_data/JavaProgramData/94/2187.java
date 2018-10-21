package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int[] b = new int[500];

		int i;
		int n;
		int j;
		int temp;
		int p = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}


		for (i = 0;i < n;i++)
		{
			if (a[i] % 2 == 1)
			{
				b[p] = a[i];
				p = p + 1;
			}
		}



		for (i = 1;i < p - 1;i++)
		{
		for (j = 0;j <= p - 2;j++)
		{
		   if (b[j] > b[j + 1])
		   {
		   temp = b[j + 1];
		   b[j + 1] = b[j];
		   b[j] = temp;
		   }
		}
		}

		if (p == 1)
		{
			System.out.printf("%d",b[0]);
		}
		else
		{
			System.out.printf("%d",b[0]);
			for (i = 1;i <= p - 1;i++)
			{
				System.out.printf(",%d",b[i]);
			}

		}

	}
}

