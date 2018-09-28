package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][3];
		int n;
		int i;
		int j;
		int k;
		//double ans[100];
		double[][] ans = new double[10][10];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;++i)
		{
			for (j = 0;j < 3;++j)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 0;i < n;++i)
		{
			for (j = i + 1;j < n;++j)
			{
				ans[i][j] = Math.sqrt(Math.pow((double)a[i][0] - a[j][0],2) + Math.pow((double)a[i][1] - a[j][1],2) + Math.pow((double)a[i][2] - a[j][2],2));
				//cout<<ans[i *n + j]<<" ";	
			}
			//cout<<endl;
		}
		int sum = n * (n - 1) / 2;
		while (sum > 0)
		{
			sum--;
			int maxI = 0;
			int maxJ = 1;
			for (i = 0;i < n;++i)
			{
				for (j = i + 1;j < n;++j)
				{
					if (ans[i][j] > ans[maxI][maxJ])
					{
						maxI = i;
						maxJ = j;
					}
				}
			}
			//(1,1,0)-(1,1,1)=1.00
			System.out.print("(");
			System.out.print(a[maxI][0]);
			System.out.print(",");
			System.out.print(a[maxI][1]);
			System.out.print(",");
			System.out.print(a[maxI][2]);
			System.out.print(")-(");
			System.out.print(a[maxJ][0]);
			System.out.print(",");
			System.out.print(a[maxJ][1]);
			System.out.print(",");
			System.out.print(a[maxJ][2]);
			System.out.print(")=");
			System.out.printf("%.2f", ans[maxI][maxJ]);
			System.out.printf("%.2f", "\n");
			ans[maxI][maxJ] = -9999999;
		}

		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}
}

