package <missing>;

public class GlobalMembers
{
	public static int Main() //????
	{
		int n; //??????n?????i,j,I???
		int i;
		int j;
		int I;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n < 2)
		{
			return 0;
		}
		else
		{
			double dis = 0; //??????dis?????temp1,temp2,temp3???????
			double temp1;
			double temp2;
			double temp3;
			double[][] a = new double[100][2];
			for (I = 0;I < n;I++)
			{
				a[I][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				a[I][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					temp1 = (a[j][0] - a[i][0]) * (a[j][0] - a[i][0]);
					temp2 = (a[j][1] - a[i][1]) * (a[j][1] - a[i][1]);
					temp3 = Math.sqrt(temp1 + temp2);
					if (dis < temp3)
					{
						dis = temp3; //????????????
					}
				}
			}
				System.out.printf("%.4f\n",dis);
				return 0;
		}
	}
}

