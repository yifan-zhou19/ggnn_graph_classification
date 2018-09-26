package <missing>;

public class GlobalMembers
{
	public static final double EPS = 1e-6;
	public static int Main()
	{
		int[][] a = new int[10][3];
		int[] c = new int[50];
		int n;
		int z = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < 50;++i)
	{
		c[i] = i;
	}
	for (int i = 0;i < n;++i)
	{
		a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[i][2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct MyStruct
	//{
	//	double d;
	//	int x;
	//	int y;
	//}
	//b[50];
	for (int i = 0;i < n;++i)
	{
		for (int j = i + 1;j < n;++j)
		{
			b[z].d = Math.floor((100 * Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]))) + 0.5) / 100;
			b[z].x = i;
			b[z].y = j;
			++z;
		}
	}
		for (int i = 0;i < n * (n - 1) / 2;++i)
		{
			for (int j = 0;i + j < n * (n - 1) / 2 - 1;++j)
			{
				if ((b[c[j + 1]].d - b[c[j]].d) > EPS)
				{
					int temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
				}
				else if ((Math.abs(b[c[j + 1]].d - b[c[j]].d) < EPS))
				{
					if (b[c[j + 1]].x < b[c[j]].x)
					{
					int temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
					}
				}

			}
		}
	for (int i = 0;i < n * (n - 1) / 2;++i)
	{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[b[c[i]].x][0],a[b[c[i]].x][1],a[b[c[i]].x][2],a[b[c[i]].y][0],a[b[c[i]].y][1],a[b[c[i]].y][2],b[c[i]].d);
	}
	return 0;

	}

}

