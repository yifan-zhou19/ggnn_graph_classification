package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int geshu;
		geshu = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int xh;
		double[][] a = new double[11][4];
		double[][] b = new double[11][11];
		for (i = 1;i <= geshu;i++)
		{
			a[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			a[i][2] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			a[i][3] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i < geshu;i++)
		{
			for (j = i + 1;j <= geshu;j++)
			{
				double m;
				m = (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]) + (a[i][3] - a[j][3]) * (a[i][3] - a[j][3]);
				b[i][j] = Math.sqrt(m);
			}
		}
		int jiayou;
		jiayou = geshu * (geshu - 1) / 2;
		for (xh = jiayou;xh >= 1;xh--)
		{

		  for (i = 1;i < geshu;i++) //??????b????????,????.?????????????,????t???,T??n*(n-1)/2???????
		  {
			for (j = i + 1;j <= geshu;j++) //??????b[i][j],?????t??xh
			{
				int p;
				int q;
				int t;
				t = 0;
				for (p = 1;p < geshu;p++)
				{
					for (q = p + 1;q <= geshu;q++)
					{
						if (b[i][j] >= b[p][q])
						{
							t++;
						}
					}
				}
				if (t == xh)
				{
					System.out.print("(");
					System.out.print(a[i][1]);
					System.out.print(",");
					System.out.print(a[i][2]);
					System.out.print(",");
					System.out.print(a[i][3]);
					System.out.print(")-(");
					System.out.print(a[j][1]);
					System.out.print(",");
					System.out.print(a[j][2]);
					System.out.print(",");
					System.out.print(a[j][3]);
					System.out.print(")=");
					System.out.printf("%0.2f",b[i][j]);
					System.out.print("\n");
				}



			}
		  }
		}



		return 0;
	}

}

