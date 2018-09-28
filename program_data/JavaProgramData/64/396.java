package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int p = 0;
		int n;
		int[][] b = new int[10][3];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct qwe
	//	{
	//		int a[3];
	//		int b[3];
	//		int jl;
	//	}
	//	t[45],e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				*(b + i) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				*(b + i) + 1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				*(b + i) + 2 = tempVar4;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				t[p].a[0] = b[i][0];
				t[p].a[1] = b[i][1];
				t[p].a[2] = b[i][2];
				t[p].b[0] = b[j][0];
				t[p].b[1] = b[j][1];
				t[p].b[2] = b[j][2];
				t[p].jl = (b[i][0] - b[j][0]) * (b[i][0] - b[j][0]) + (b[i][1] - b[j][1]) * (b[i][1] - b[j][1]) + (b[i][2] - b[j][2]) * (b[i][2] - b[j][2]);
				p++;
			}
		}
		for (i = 0;i < p;i++)
		{
			for (j = 0;j < p - i - 1;j++)
			{
				if (t[j].jl < t[j + 1].jl)
				{
					e = t[j];
					t[j] = t[j + 1];
					t[j + 1] = e;
				}
			}
		}
		for (i = 0;i < p;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",t[i].a[0],t[i].a[1],t[i].a[2],t[i].b[0],t[i].b[1],t[i].b[2],Math.sqrt(t[i].jl));
		}
	}
}

