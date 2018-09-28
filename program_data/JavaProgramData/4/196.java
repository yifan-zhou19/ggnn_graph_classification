package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ro;
		int co;
		int[][] sz = new int[100][1000];
		int i;
		int j;
		int m;
		int k;
		int c = 0;
		int b = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ro = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			co = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < ro;i++)
		{
			for (j = 0;j < co;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		m = ro * co;
		i = 0;
		j = 0;
		for (k = 0;k < m;k++)
		{
		   System.out.printf("%d\n",sz[i][j]);
		if (ro >= co)
		{
		if (j == 0 && i < co - 1)
		{
				 j = i + 2;
				 i = -1;
		}
		 j--;
		 i++;
		 if ((j < 0 && i> co - 1) || i > ro - 1)
		 {
				 j = co - 1;
				 i = c + 1;
				 c++;
		 }

		}
	   if (ro < co)
	   {
			if (j == 0 && i <= ro - 1)
			{
					j = i + 2;
					i = -1;
			}
		  j--;
		  i++;
		   if (i > ro - 1)
		   {
			  i = 0;
			  j = ro + c + 1;
			  c++;
		   }

		 if (j > co - 1)
		 {
			 j = co - 1;
			 i = b;
			 b++;
		 }
	   }

		}
		return 0;
	}
}

