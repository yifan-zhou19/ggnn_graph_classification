public class distance
{
	public double d;
	public int dx;
	public int dy;
}
public class point
{
	public int x;
	public int y;
	public int z;
}

package <missing>;

public class GlobalMembers
{
	public static distance[] dis = {0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
	public static distance t = new distance();
	public static point[] poi = {0, null, null, null, null, null, null, null, null, null};
	public static void input(int n)
	{
		int i;
		for (i = 0; i < n; i++)
		{
			poi[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			poi[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			poi[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void calculate(int n)
	{
		int i;
	/*	for(i = 0; i < n * n; i++)
		{
			dis[i].d = sqrt((poi[i/n].x - poi[i%n].x) * (poi[i/n].x - poi[i%n].x)+
				            (poi[i/n].y - poi[i%n].y) * (poi[i/n].y - poi[i%n].y)+
	                        (poi[i/n].z - poi[i%n].z) * (poi[i/n].z - poi[i%n].z));
			dis[i].dx = i / n;
			dis[i].dy = i % n;
		}
	*/
		int x1 = 0;
		int y1 = 1;
		for (i = 0; i < n * (n - 1) / 2; i++)
		{
			dis[i].d = Math.sqrt((poi[x1].x - poi[y1].x) * (poi[x1].x - poi[y1].x) + (poi[x1].y - poi[y1].y) * (poi[x1].y - poi[y1].y) + (poi[x1].z - poi[y1].z) * (poi[x1].z - poi[y1].z));
			dis[i].dx = x1;
			dis[i].dy = y1;
			y1++;
			if (y1 == n)
			{
				x1++;
				y1 = x1 + 1;
			}
		}

		return;
	}
	public static void arrange(int n)
	{
		int i;
		int j;
		for (i = 0; i < n * (n - 1) / 2 - 1; i++)
		{
			for (j = 0; j < n * (n - 1) / 2 - i - 1; j++)
			{
				if (dis[j].d < dis[j + 1].d)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t = dis[j];
					t.copyFrom(dis[j]);
					dis[j] = dis[j + 1];
					dis[j + 1] = t;

				}
			}
		}
		return;
	}
	public static void output(int n)
	{
		int i;
		for (i = 0; i < n * (n - 1) / 2; i++) //(0,0,0)-(1,1,1)=1.73
		{
			System.out.print("(");
			System.out.print(poi[dis[i].dx].x);
			System.out.print(",");
			System.out.print(poi[dis[i].dx].y);
			System.out.print(",");
			System.out.print(poi[dis[i].dx].z);
			System.out.print(")-(");
			System.out.print(poi[dis[i].dy].x);
			System.out.print(",");
			System.out.print(poi[dis[i].dy].y);
			System.out.print(",");
			System.out.print(poi[dis[i].dy].z);
			System.out.print(")=");
			System.out.printf("%.2f", dis[i].d);
			System.out.printf("%.2f", "\n");
		}
		return;


	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		input(n);
		calculate(n);
		arrange(n);
		output(n);
		return 0;
	}




























}

