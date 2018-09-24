public class distants
{
	public double d;
public int x;
public int y;
}

package <missing>;

public class GlobalMembers
{
	public static distants[] b = tangible.Arrays.initializeWithDefaultdistantsInstances(45);
	public static distants mid = new distants();

	public static int Main()
	{
		int n;
		int i;
		int j;
		int num = 0;
	int[][] a = new int[10][3];
	distants[] b = tangible.Arrays.initializeWithDefaultdistantsInstances(45);
	distants mid = new distants();

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n <= 10)
	{
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
			b[num].d = Math.sqrt((double)((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2])));
			b[num].x = i;
			b[num].y = j;
			num++;
			}
		} //????num????b[num-1].d

		for (i = 1;i < num;i++)
		{
				for (j = 1;j <= num - i;j++)
				{
					if ((b[j - 1].d < b[j].d) || ((b[j - 1].d - b[j].d < 1e-6) && (b[j - 1].x> b[j].x)) || ((b[j - 1].d - b[j].d < 1e-6) && (b[j - 1].x == b[j].x) && (b[j - 1].y> b[j].y)))
					{

//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: mid=b[j-1];
						mid.copyFrom(b[j - 1]);
						b[j - 1] = b[j];
						b[j] = mid;
					}
				}
		}

				for (i = 0;i < num;i++)
				{

			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",a[b[i].x][0],a[b[i].x][1],a[b[i].x][2],a[b[i].y][0],a[b[i].y][1],a[b[i].y][2],b[i].d);

				}
	}
	return 0;
	}





}

