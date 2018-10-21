package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] p = new int[10][3];
		int[][] d2 = new int[10][10];
		float[][] d = new float[10][10];
		int i;
		int j;
		int k = 0;
		int n;
		int N;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i][j] = Integer.parseInt(tempVar2);
			}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d2[i][j] = (p[i][0] - p[j][0]) * (p[i][0] - p[j][0]) + (p[i][1] - p[j][1]) * (p[i][1] - p[j][1]) + (p[i][2] - p[j][2]) * (p[i][2] - p[j][2]);
				d[i][j] = Math.sqrt((float)d2[i][j]);
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		float d;
	//		int p1;
	//		int p2;
	//	}
	//	A[46];
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				A[k].d = d[i][j];
				A[k].p1 = i;
				A[k].p2 = j;
				k++;
			}
		}
		N = k;
		for (k = 0;k < N;k++)
		{
			for (j = 0;j < N - 1 - k;j++)
			{
				if (A[j].d < A[j + 1].d)
				{
					A[45] = A[j];
					A[j] = A[j + 1];
					A[j + 1] = A[45];
				}
			}
		}
		for (k = 0;k < N;k++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",p[A[k].p1][0],p[A[k].p1][1],p[A[k].p1][2],p[A[k].p2][0],p[A[k].p2][1],p[A[k].p2][2],A[k].d);
		}
		return 0;
	}

}

