public class loc
{
	public int x;
	public int y;
	public int z;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		loc[] a = tangible.Arrays.initializeWithDefaultlocInstances(10);
		double[][] len = new double[10][10];
		double max;
		int n;
		int i;
		int j;
		int k;
		int no1;
		int no2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(len,0,(Double.SIZE / Byte.SIZE));
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
				a[i].x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].z = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				len[i][j] = Math.sqrt((a[i].x - a[j].x) * (a[i].x - a[j].x) + (a[i].y - a[j].y) * (a[i].y - a[j].y) + (a[i].z - a[j].z) * (a[i].z - a[j].z));
			}
		}
		for (k = 0;k < (n - 1) * n / 2;k++)
		{
			max = 0;
			for (i = 0;i < n - 1;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (len[i][j] > max)
					{
						max = len[i][j];
						no1 = i;
						no2 = j;
					}
				}
			}
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",a[no1].x,a[no1].y,a[no1].z,a[no2].x,a[no2].y,a[no2].z,len[no1][no2]);
			len[no1][no2] = 0;
		}
		return 0;
	}


}

