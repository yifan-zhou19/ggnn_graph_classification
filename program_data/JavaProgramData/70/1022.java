package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double x;
		double y;
		double s = 0;
		double[][] a = new double[100000][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i][0] = Double.parseDouble(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 a[i][1] = Double.parseDouble(tempVar3);
			 }
			 for (j = 0;j < i;j++)
			 {
					if (s < Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1])))
					{
					s = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]));
					}
			 }
		}
	System.out.printf("%.4f\n", s);
	System.in.read();
	System.in.read();
	System.in.read();
	}

}

