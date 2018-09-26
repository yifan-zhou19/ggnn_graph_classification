public class Distance
{
	public int p1; //????p1?p2???
	public int p2;
	public double d;
}

package <missing>;

public class GlobalMembers
{
	public static int[][] p = new int[100][3]; //????????n?????
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
				p[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		Distance[] a = tangible.Arrays.initializeWithDefaultDistanceInstances(100 * 100 + 10);
		Distance temp = new Distance();
		int m = 0; //????m
			for (i = 0;i < n;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					double sum = 0;
					for (k = 0;k < 3;k++)
					{
						sum += Math.pow(p[i][k] * 1.0 - p[j][k] * 1.0,2 * 1.0);
					}
					a[m].d = Math.sqrt(sum);
					a[m].p1 = i; //????????????Distance a[m]
					a[m].p2 = j;
					m++;
				}
			}
			for (i = 0;i < m;i++) //????
			{
				for (j = 0;j < m - i;j++)
				{
					if (a[j].d < a[j + 1].d)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=a[j];
						temp.copyFrom(a[j]);
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}
				}
			}
		for (i = 0;i < m;i++)
		{

			System.out.print("(");
			System.out.print(p[a[i].p1][0]);
			System.out.print(",");
			System.out.print(p[a[i].p1][1]);
			System.out.print(",");
			System.out.print(p[a[i].p1][2]);
			System.out.print(")");
			System.out.print("-");
			System.out.print("(");
			System.out.print(p[a[i].p2][0]);
			System.out.print(",");
			System.out.print(p[a[i].p2][1]);
			System.out.print(",");
			System.out.print(p[a[i].p2][2]);
			System.out.print(")");
			System.out.print("=");
			System.out.printf("%.2f", a[i].d);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}

}

