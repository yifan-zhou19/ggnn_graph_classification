package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] c = new int[8][8];
		int i;
		int j;
		int a;
		int b;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{

			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   c[i][j] = Integer.parseInt(tempVar3);
			   }
			}
		}
		int p;
		int q;
		int k;
		int count = 0;

		for (i = 0;i < a;i++)
		{
			p = i;
			q = 0;
			for (j = 0;j < b - 1;j++)
			{

				if (c[p][q] < c[i][j + 1])
				{
					q = j + 1;
				}
			}
			count = 0;
			for (k = 0;k < a;k++)
			{
				if (c[p][q] <= c[k][q])
				{
					count++;
				}
			}
			if (count == a)
			{
				break;
			}
		}
		if (count == a)
		{
			System.out.printf("%d+%d",p,q);
		}
		else
		{
			System.out.print("No");
		}

	}


}

