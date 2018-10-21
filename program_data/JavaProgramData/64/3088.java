package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int z;
		int[][] a = new int[10][3];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{

						 if (i == 0)
						 {
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a[0][0] = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 a[0][1] = Integer.parseInt(tempVar3);
						 }
						 String tempVar4 = ConsoleInput.scanfRead(" ");
						 if (tempVar4 != null)
						 {
							 a[0][2] = Integer.parseInt(tempVar4);
						 }
						 }
						 else
						 {
						 String tempVar5 = ConsoleInput.scanfRead(" ");
						 if (tempVar5 != null)
						 {
							 a[i][0] = Integer.parseInt(tempVar5);
						 }
						 String tempVar6 = ConsoleInput.scanfRead(" ");
						 if (tempVar6 != null)
						 {
							 a[i][1] = Integer.parseInt(tempVar6);
						 }
						 String tempVar7 = ConsoleInput.scanfRead(" ");
						 if (tempVar7 != null)
						 {
							 a[i][2] = Integer.parseInt(tempVar7);
						 }
						 }
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		   int b[3],c[3];
	//		   float d;
	//		   }
	//		   x[46];

		for (i = 0;i < n;i++)
		{
						 for (j = i + 1;j < n;j++)
						 {

											x[k].b[0] = a[i][0];

											x[k].b[1] = a[i][1];
											x[k].b[2] = a[i][2];
											x[k].c[0] = a[j][0];
											x[k].c[1] = a[j][1];
											x[k].c[2] = a[j][2];
											x[k].d = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]));
											k++;
						 }
		}


		for (i = 0;i < k;i++)
		{
						 for (j = k - 1;j > i;j--)
						 {
											if (x[j].d > x[j - 1].d)
											{
																x[45] = x[j];
																x[j] = x[j - 1];
																x[j - 1] = x[45];
											}
						 }
		}
		for (i = 0;i < k;i++)
		{
						 System.out.printf("\n(%d,%d,%d)-(%d,%d,%d)=%.2f",x[i].b[0],x[i].b[1],x[i].b[2],x[i].c[0],x[i].c[1],x[i].c[2],x[i].d);
		}





	return 0;
	}

}

