package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		double x;
	//		double y;
	//		double z;
	//	}
	//	point[15];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stru
	//	{
	//		int p,q;
	//		double distance;
	//	}
	//	dis[50],temp;
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			point[i].x = ConsoleInput.readToWhiteSpace(true);
			point[i].y = ConsoleInput.readToWhiteSpace(true);
			point[i].z = ConsoleInput.readToWhiteSpace(true);
		}
		int k = 0;
		for (i = 0;i < n - 1;i++)
		{
		   for (j = i + 1;j < n;j++)
		   {
				dis[k].p = i;
				dis[k].q = j;
				double a;
				double b;
				double c;
				a = (point[i].x - point[j].x) * (point[i].x - point[j].x);
				b = (point[i].y - point[j].y) * (point[i].y - point[j].y);
				c = (point[i].z - point[j].z) * (point[i].z - point[j].z);
				dis[k].distance = Math.sqrt(a + b + c);
				k = k + 1;
		   }
		}
		for (i = 1;i <= k;i++)
		{
			for (j = 0;j < k - i;j++)
			{
				if (dis[j].distance < dis[j + 1].distance)
				{
					temp = dis[j];
					dis[j] = dis[j + 1];
					dis[j + 1] = temp;
				}
			}
		}
		for (i = 0;i <= k - 1;i++)
		{
			System.out.print('(');
			System.out.print(point[dis[i].p].x);
			System.out.print(',');
			System.out.print(point[dis[i].p].y);
			System.out.print(',');
			System.out.print(point[dis[i].p].z);
			System.out.print(')');
			System.out.print("-(");
			System.out.print(point[dis[i].q].x);
			System.out.print(',');
			System.out.print(point[dis[i].q].y);
			System.out.print(',');
			System.out.print(point[dis[i].q].z);
			System.out.print(")=");
			System.out.printf("%.2f\n",dis[i].distance);
		}
		return 0;
	}
}

