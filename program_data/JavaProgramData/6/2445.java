package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int j;
		int m;
		int n;
		int[] a = new int[10000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,r;
		int p;
		int r;
		int sum = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}


		int i;
		p = a;
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}

			for (j = 0;j < 10000;j++)
			{
				*(p + j) = 0;
			}

			for (j = 0;j < m * n;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					*(p + j) = tempVar4;
				}
			}

			for (j = 0;j < n;j++)
			{
				sum = sum + *(p + j);
			}

			for (r = 1;r < m - 1;r++)
			{
				sum = sum + *(p + n * r) + *(p + n * r + n - 1);
			}

			if (m != 1)
			{
				for (j = 0;j < n;j++)
				{
				sum = sum + *(p + (m - 1) * n + j);
				}
			}

			System.out.printf("%d\n",sum);
			sum = 0;
		}





	}

}

