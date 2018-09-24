/*????  ??*/
public class distance
{
	public int x1;
	public int y1;
	public int z1;
	public int x2;
	public int y2;
	public int z2;
	public double s;
}

package <missing>;

public class GlobalMembers
{
	public static distance[] d = tangible.Arrays.initializeWithDefaultdistanceInstances(45);
	public static distance temp = new distance();

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[][] a = new int[10][3];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		k = 0;
		while (k < n * (n - 1) / 2)
		{
			for (i = 0;i < n;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					d[k].x1 = a[i][0];
					d[k].y1 = a[i][1];
					d[k].z1 = a[i][2];
					d[k].x2 = a[j][0];
					d[k].y2 = a[j][1];
					d[k].z2 = a[j][2];
					d[k].s = Math.sqrt((d[k].x1 - d[k].x2) * (d[k].x1 - d[k].x2) + (d[k].y1 - d[k].y2) * (d[k].y1 - d[k].y2) + (d[k].z1 - d[k].z2) * (d[k].z1 - d[k].z2));
					k++;
				}
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			for (j = 0;j < n * (n - 1) / 2 - 1;j++)
			{
				if (d[j].s < d[j + 1].s)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=d[j];
					temp.copyFrom(d[j]);
					d[j] = d[j + 1];
					d[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			System.out.print("(");
			System.out.print(d[i].x1);
			System.out.print(",");
			System.out.print(d[i].y1);
			System.out.print(",");
			System.out.print(d[i].z1);
			System.out.print(")-(");
			System.out.print(d[i].x2);
			System.out.print(",");
			System.out.print(d[i].y2);
			System.out.print(",");
			System.out.print(d[i].z2);
			System.out.print(")=");
			System.out.printf("%.2f", d[i].s);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}


}

