package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int amin;
		int bmax;
		int t = 0;
		int[][] zqj = new int[1000][1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct qujian
	//	{
	//		int a;
	//		int b;
	//	};
		qujian[] q = tangible.Arrays.initializeWithDefaultqujianInstances(5000);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				q[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				q[i].b = tempVar3;
			}
		}
		amin = q[1].a;
		bmax = q[1].b;
		for (i = 1;i <= n;i++)
		{
			if (q[i].a < amin)
			{
				amin = q[i].a;
			}
			if (q[i].b > bmax)
			{
				bmax = q[i].b;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (q[i].a == q[i].b)
			{
				zqj[q[i].a][q[i].b] = 1;
			}
			for (j = q[i].a;j < q[i].b;j++)
			{
				zqj[j][j] = 1;
				zqj[j][j + 1] = 1;
			}
			zqj[q[i].b][q[i].b] = 1;
		}
		for (i = amin;i < bmax;i++)
		{
			if (zqj[i][i] == 0 || zqj[i][i + 1] == 0)
			{
				t = 1;
				System.out.print("no");
				break;
			}
		}
		if (t == 0)
		{
			System.out.printf("%d %d",amin,bmax);
		}
		return 0;
	}


}

