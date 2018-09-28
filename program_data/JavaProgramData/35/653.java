package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//	int a[8][8],x1[8]={0},y1[8]={0},x2[8]={0},y2[8]={0};
		int[][] a = new int[8][8];
		int[] x1 = new int[8];
		int[] y1 = new int[8];
		int[] x2 = new int[8];
		int[] y2 = new int[8];
		int row;
		int col;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
	//	printf("%d %d",row,col);
		int x;
		int y;
		for (x = 0;x < row;x++)
		{
			for (y = 0;y < col;y++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[x][y] = Integer.parseInt(tempVar3);
				}
			}
		}
	/*	for(x=0;x<row;x++){
			for(y=0;y<col;y++){
				printf("%d",a[x][y]);
			}
		}*/
		int max = 0;
		int i = 0;
		for (x = 0;x < row;x++)
		{
			for (y = 0;y < col;y++)
			{
				if (a[x][y] > max)
				{
					max = a[x][y];
					x1[i] = x;
					y1[i] = y;
				}
			}
			i++;
			max = 0;
		}
	/*	for(i=0;i<8;i++){
			printf("%d %d ",x1[i],y1[i]);
		}*/
		int min = 10000;
		int j = 0;
		for (y = 0;y < col;y++)
		{
			for (x = 0;x < row;x++)
			{
				if (a[x][y] < min)
				{
					min = a[x][y];
					x2[j] = x;
					y2[j] = y;
				}
			}
			j++;
			min = 10000;
		//	printf("%d %d %d",j,x2[j],y2[j]);
		}
		int p;
		int q;
		int w = 0;
		for (p = 0;p < row;p++)
		{
			for (q = 0;q < j;q++)
			{
				if ((x1[p] == x2[q]) && (y1[p] == y2[q]))
				{
					System.out.printf("%d+%d",p,q);
					w++;
				}
			}
		}
		if (w == 0)
		{
			System.out.print("No");
		};
		return 0;
	}

}

