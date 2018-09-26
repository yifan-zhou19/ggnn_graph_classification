//********************************************************
//*  ???:1.cpp                                        *
//*  ??????    1200012948                          *
//*  ????: 2012 12 09                                *
//*  ????:????                                   *
//********************************************************
public class shuju //????????????????
{
	public int xx;
	public int yy;
	public double dis;
}
public class distance //????????
{
	public int x;
	public int y;
	public int z;
}

package <missing>;

public class GlobalMembers
{
	public static shuju[] sj = tangible.Arrays.initializeWithDefaultshujuInstances(100);
	public static shuju temp = new shuju();
	public static distance[] point = tangible.Arrays.initializeWithDefaultdistanceInstances(10);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			point[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			point[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			point[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1; i < n; i++)
		{
			for (j = i + 1; j <= n; j++)
			{
				k++;
				double m = (point[i].x - point[j].x) * (point[i].x - point[j].x) + (point[i].y - point[j].y) * (point[i].y - point[j].y) + (point[i].z - point[j].z) * (point[i].z - point[j].z);
				sj[k].dis = Math.sqrt(m);
				sj[k].xx = i;
				sj[k].yy = j;
			}
		}
		for (i = 1; i < n * (n - 1) / 2; i++) //??
		{
			for (j = 1; j <= n * (n - 1) / 2 - i; j++)
			{
				if (sj[j].dis < sj[j + 1].dis)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp =sj[j];
					temp.copyFrom(sj[j]);
					sj[j] = sj[j + 1];
					sj[j + 1] = temp;
				}
			}
		}
		for (i = 1; i <= n * (n - 1) / 2; i++)
		{
			System.out.print("(");
			System.out.print(point[sj[i].xx].x);
			System.out.print(",");
			System.out.print(point[sj[i].xx].y);
			System.out.print(",");
			System.out.print(point[sj[i].xx].z);
			System.out.print(")");
			System.out.print("-");
			System.out.print("(");
			System.out.print(point[sj[i].yy].x);
			System.out.print(",");
			System.out.print(point[sj[i].yy].y);
			System.out.print(",");
			System.out.print(point[sj[i].yy].z);
			System.out.print(")");
			System.out.print("=");
			System.out.printf("%.2f", sj[i].dis);
			System.out.printf("%.2f", "\n");
		}
		return 0;

	}

}

