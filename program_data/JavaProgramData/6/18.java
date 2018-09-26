package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][100];
		int[] b = new int[1000];
		int n;
		int he;
		int h;
		int l;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			he = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				l = Integer.parseInt(tempVar3);
			}
			for (i = 0;i < h;i++)
			{
				for (j = 0;j < l;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						(*(a + i) + j) = tempVar4;
					}
				}
			}

			for (i = 0;i < h;i++)
			{
				he = he + *(*(a + i) + 0) + *(*(a + i) + l - 1);
			}

			for (j = 0;j < l;j++)
			{
				he = he + *(a + j) + *(*(a + h - 1) + j);
			}


			he = he - *(*(a + 0) + l - 1) - *(*(a + h - 1) + l - 1) - *(*(a + 0) + 0) - *(*(a + h - 1) + 0);
			b[k] = he;

		}
	  for (k = 0;k < n - 1;k++)
	  {
		  System.out.printf("%d\n",b[k]);
	  }
	  System.out.printf("%d",b[k]);
	}

}

