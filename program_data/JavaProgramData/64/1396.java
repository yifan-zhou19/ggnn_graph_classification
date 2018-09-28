package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????                 **
	//*?????? 1200012839        **
	//*???2012.12.10              **
	//********************************
	public static int Main()
	{
		int n;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		int x;
	//		int y;
	//		int z;
	//	}
	//	point[n];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct distance
	//	{
	//		int pointa;
	//		int pointb;
	//		double d;
	//	}
	//	dis[4950],temp;
		for (int i = 0; i < n; i++)
		{
			point[i].x = ConsoleInput.readToWhiteSpace(true);
			point[i].y = ConsoleInput.readToWhiteSpace(true);
			point[i].z = ConsoleInput.readToWhiteSpace(true);
		}
		for (int i = 0;i < n - 1;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				dis[k].d = Math.sqrt((point[i].x - point[j].x) * (point[i].x - point[j].x) + (point[i].y - point[j].y) * (point[i].y - point[j].y) + (point[i].z - point[j].z) * (point[i].z - point[j].z));
				dis[k].pointa = i;
				dis[k].pointb = j;
				k++;
			}
		}
		for (int i = 0; i < n * (n - 1) / 2 - 1; i++)
		{
			for (int j = i + 1; j < n * (n - 1) / 2; j++)
			{
				if (dis[i].d < dis[j].d)
				{
					temp = dis[i];
					dis[i] = dis[j];
					dis[j] = temp;
				}
				if (dis[i].d == dis[j].d && (dis[i].pointa > dis[j].pointa || dis[i].pointb > dis[j].pointb))
				{
					temp = dis[i];
					dis[i] = dis[j];
					dis[j] = temp;
				}
			}
		}
		for (int i = 0; i < n * (n - 1) / 2; i++)
		{
			System.out.print("(");
			System.out.print(point[dis[i].pointa].x);
			System.out.print(",");
			System.out.print(point[dis[i].pointa].y);
			System.out.print(",");
			System.out.print(point[dis[i].pointa].z);
			System.out.print(")");
			System.out.print("-");
			System.out.print("(");
			System.out.print(point[dis[i].pointb].x);
			System.out.print(",");
			System.out.print(point[dis[i].pointb].y);
			System.out.print(",");
			System.out.print(point[dis[i].pointb].z);
			System.out.print(")");
			System.out.print("=");
			System.out.printf("%.2f", dis[i].d);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}
}

