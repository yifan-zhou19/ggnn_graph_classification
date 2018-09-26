package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int r;
		int c;
		int i;
		int j;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		int[][] x = new int[100][100];
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i][j] = Integer.parseInt(tempVar3);
			}

			}
		}
		s = 0;
		while (s <= r + c - 2)
		{
		 for (i = 0;i < r;i++)
		 {
		  for (j = 0;j < c;j++)
		  {
		  if (i + j == s)
		  {
		  System.out.printf("%d\n",x[i][j]);

		  }


		  }


		 }

		s++;
		}





	}

}

