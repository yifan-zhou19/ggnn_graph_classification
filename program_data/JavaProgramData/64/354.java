package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct B
	//	{
	//		int a;
	//		int b;
	//		int c;
	//		int d;
	//		int e;
	//		int f;
	//		float g;
	//	}
	//	B[45];
		int n;
		int[][] A = new int[10][3];
		int i;
		int j;
		int p = 0;
		int q = 0;
		float[] c = new float[45];
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
				A[i][j] = Integer.parseInt(tempVar2);
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				B[p].a = A[i][0];
				B[p].b = A[i][1];
				B[p].c = A[i][2];
				B[p].d = A[j][0];
				B[p].e = A[j][1];
				B[p].f = A[j][2];
				B[p].g = (float)Math.sqrt((A[i][0] - A[j][0]) * (A[i][0] - A[j][0]) + (A[i][1] - A[j][1]) * (A[i][1] - A[j][1]) + (A[i][2] - A[j][2]) * (A[i][2] - A[j][2]));
				p++;
			}
		}
		for (i = 0;i < p;i++)
		{
			c[i] = 0F;
			if (i == 0)
			{
				for (j = 0;j < p;j++)
				{
					if (B[j].g > c[i])
					{
					c[i] = B[j].g;
					q++;
					}
				}
			}
			else
			{
				for (j = 0;j < p;j++)
				{
					if (c[i] < B[j].g && B[j].g < c[i - 1])
					{
						c[i] = B[j].g;
						q++;
					}
				}
			}
		}
		int z = 0;
		for (i = 0;i < q;i++)
		{
			for (j = 0;j < p;j++)
			{
				if (z == n * (n - 1) / 2)
				{
					break;
				}
				if (B[j].g == c[i])
				{
					z++;
					System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",B[j].a,B[j].b,B[j].c,B[j].d,B[j].e,B[j].f,B[j].g);
				}
			}
		}
	}
}

