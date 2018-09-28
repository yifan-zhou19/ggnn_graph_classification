public class location
{
	public int x;
	public int y;
	public int z;
}
public class dis
{
	public int point1;
	public int point2;
	public double s;
	public int num;
}

package <missing>;

public class GlobalMembers
{
	public static location[] point = tangible.Arrays.initializeWithDefaultlocationInstances(10);
	public static location t = new location();
	public static dis[] len = tangible.Arrays.initializeWithDefaultdisInstances(45);
	public static dis temp = new dis();
	public static int Main()
	{
		int n;
		int i;
		int j;
		int count = 0;
		int p;
		double t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			point[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			point[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			point[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				len[count].point1 = i;
				len[count].point2 = j;
				t = Math.pow((double)(point[i].x - point[j].x), 2) + Math.pow((double)(point[i].y - point[j].y), 2) + Math.pow((double)(point[i].z - point[j].z), 2);
				len[count].s = Math.sqrt(t);
				len[count].num = count;
				++count;
			}
		}
		for (i = 0; i < count - 1; i++)
		{
			p = i;
			for (j = i + 1; j < count; j++)
			{
				if (len[p].s < len[j].s)
				{
					p = j;
				}
				else if (len[p].s == len[j].s && len[p].num > len[j].num)
				{
					p = j;
				}
			}
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp = len[p];
				temp.copyFrom(len[p]);
				len[p] = len[i];
				len[i] = temp;
		}
		}
		for (i = 0; i < count; i++)
		{
			System.out.print("(");
			System.out.print(point[len[i].point1].x);
			System.out.print(",");
			System.out.print(point[len[i].point1].y);
			System.out.print(",");
			System.out.print(point[len[i].point1].z);
			System.out.print(")");
			System.out.print("-");
			System.out.print("(");
			System.out.print(point[len[i].point2].x);
			System.out.print(",");
			System.out.print(point[len[i].point2].y);
			System.out.print(",");
			System.out.print(point[len[i].point2].z);
			System.out.print(")");
			System.out.print("=");
			System.out.printf("%.2f", len[i].s);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}
}

