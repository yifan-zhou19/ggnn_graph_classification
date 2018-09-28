package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] a = new int[500];
		int i;
		int u = 0;
		int[] b = new int[500];
		int j;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}

		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
		}

		 for (i = 0;i < N;i++)
		 {
			if (a[i] % 2 != 0)
			{
			b[u] = a[i];
			u++;
			}
		 }


		for (i = u - 1;i > 0;i--)
		{
		 for (j = 0;j < u - 1;j++)
		 {
						  if (b[j] > b[j + 1])
						  {
										  m = b[j];
										  b[j] = b[j + 1];
										  b[j + 1] = m;
						  }
		 }
		}

		 for (i = 0;i < u - 1;i++)
		 {
			 System.out.printf("%d,",b[i]);
		 }
		 if (i = u - 1)
		 {
		 System.out.printf("%d",b[i]);
		 }

								return 0;
	}



}

