package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int k;
		 double max = 0.0;
		 double dis;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 double[][] a = new double[n][2];
		 for (i = 0;i < n;i++)
		 {
				 a[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				 a[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			 System.out.print("\n");
		 }
		 for (i = 0;i < n;i++)
		 {
			 for (k = i + 1;k < n;k++)
			 {
					   dis = Math.sqrt((a[i][0] - a[k][0]) * (a[i][0] - a[k][0]) + (a[i][1] - a[k][1]) * (a[i][1] - a[k][1]));
					max = (max > dis != 0?max:dis);
			 }
		 }
		 System.out.printf("%.4f\n", max);
		 return 0;
	}

}

