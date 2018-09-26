package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct Distance
	//	{
	//		int p1[3];
	//		int p2[3];
	//		double length;
	//	}
	//	d[50],temp;
		int n;
		int i;
		int j;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] point = new int[10][3];
		double result;
		for (i = 0;i < n;i++)
		{
			point[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			point[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			point[i][2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d[k].p1[0] = point[i][0];
				d[k].p1[1] = point[i][1];
				d[k].p1[2] = point[i][2];
				d[k].p2[0] = point[j][0];
				d[k].p2[1] = point[j][1];
				d[k].p2[2] = point[j][2];
				result = (point[i][0] - point[j][0]) * (point[i][0] - point[j][0]) + (point[i][1] - point[j][1]) * (point[i][1] - point[j][1]) + (point[i][2] - point[j][2]) * (point[i][2] - point[j][2]);
				d[k].length = Math.sqrt(result * 1.0);
				k++;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			for (j = 0;j < k - 1 - i;j++)
			{
				if (d[j].length < d[j + 1].length)
				{
				temp = d[j];
				d[j] = d[j + 1];
				d[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.print("(");
			System.out.print(d[i].p1[0]);
			System.out.print(",");
			System.out.print(d[i].p1[1]);
			System.out.print(",");
			System.out.print(d[i].p1[2]);
			System.out.print(")");
			System.out.print("-");
			System.out.print("(");
			System.out.print(d[i].p2[0]);
			System.out.print(",");
			System.out.print(d[i].p2[1]);
			System.out.print(",");
			System.out.print(d[i].p2[2]);
			System.out.print(")");
			System.out.print("=");
			System.out.printf("%.2f", d[i].length);
			System.out.printf("%.2f", "\n");
		}

			return 0;


	}


}

