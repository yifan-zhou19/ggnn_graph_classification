package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[5][5];
	int[] maxi = new int[5];
	int[] minj = new int[5];
	int[] j1 = new int[5];
	int[] i2 = new int[5];
	int ii;
	int io;
	int ji;
	int jo;
	int i;
	int j;
	int i1;
	int j2;
	int i3;
	int j3;
	int k;
	int l;
	int m;
	int n;
	  l = 0;
	 for (ii = 0;ii < 5;ii++)
	 {
			for (ji = 0;ji < 5;ji++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[ii][ji] = Integer.parseInt(tempVar);
				}
			}
	 }
	for (i = 0;i < 5;i++)
	{
		maxi[i] = a[i][0];
	j1[i] = 0;
	for (j = 0;j < 5;j++)
	{
		if (a[i][j] > maxi[i])
		{
		maxi[i] = a[i][j];
	j1[i] = j;
		} ///j1?i??????/
	}
	}
	for (jo = 0;jo < 5;jo++)
	{
		minj[jo] = a[0][jo];
	i2[jo] = 0;
	for (io = 0;io < 5;io++)
	{
		if (a[io][jo] < minj[jo])
		{
		minj[jo] = a[io][jo];
	i2[jo] = io; //i2?j??????/
		}
	}

	}
	for (i3 = 0;i3 < 5;i3++)
	{
		if (a[i3][j1[i3]] == minj[j1[i3]])
		{
		System.out.printf("%d %d %d",i3 + 1,j1[i3] + 1,minj[j1[i3]]);
		l++;
		}
	}

	if (l == 0)
	{
		System.out.print("not found");
	}














	}

}

