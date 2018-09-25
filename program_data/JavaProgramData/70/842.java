package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[][] a = new double[1000][2]; //??????????????
		double max = 0;
		double dis;
		double temp;
		int n; //n??????,ijk??
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			a[i][2] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 1;j < n;j++)
		{
			for (k = 0;k < j;k++)
			{
				temp = (a[j][1] - a[k][1]) * (a[j][1] - a[k][1]) + (a[j][2] - a[k][2]) * (a[j][2] - a[k][2]);
				dis = Math.sqrt(temp);
				if (max < dis)
				{
					max = dis;
				}
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}


}

