package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			col = Integer.parseInt(tempVar3);
		}
		int i;
		int j;
		int k;
		int[] jmax = new int[8]; //????????
		int imin; //????????
		int[][] a = new int[8][8];
		int t = 0;

		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					a[i][j] = Integer.parseInt(tempVar4);
				}
				if (j == 0)
				{
					jmax[i] = j;
				}
				if (a[i][j] > a[i][jmax[i]])
				{
					jmax[i] = j;
				}
			}
		}

		//for(i=0;i<row;i++){
		//	printf("jmax[%d]:%d ",i,jmax[i]);
		//}

		for (k = 0;k < row;k++)
		{
			imin = 0;
			//printf("?%d????",k);

			for (i = 0;i < row;i++)
			{
				if (i == 0)
				{
					imin = i;
				}
				if (a[i][jmax[k]] < a[imin][jmax[k]])
				{
					imin = i;
				}

			}
			if (imin == k)
			{

			//	printf("?%d????",k);
				System.out.printf("%d+%d\n",imin,jmax[k]);
				t += 1;
			}


		}

		if (t == 0)
		{
			System.out.print("No");
		}




		return 0;
	}

}

