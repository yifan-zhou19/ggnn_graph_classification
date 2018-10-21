package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int a;
	 int b;
	 int maxline;
	 int i;
	 int j;
	 int mi;
	 int mj;
	 int i1;
	 int[][] in = new int[100][100];
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
				in[i][j] = Integer.parseInt(tempVar3);
			}
		}
	 }
	   for (i = 0;i < a;i++)
	   {
		   maxline = in[i][0];
		   mi = i;
		   mj = 0;

		for (j = 1;j < b;j++)
		{
			if (in[i][j] > maxline)
			{
				maxline = in[i][j];
				mj = j;
			}
		}

		for (i1 = 0;i1 < a;i1++)
		{
			if (maxline > in[i1][mj])
			{
				break;
			}
		}

		if (i1 == a)
		{
			System.out.printf("%d+%d\n",mi,mj);
			break;
		}
		if (i == a - 1 && i1 < a)
		{
			System.out.print("No\n");
		}
	   }

	}
}

