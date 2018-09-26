package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[][] c = new int[10][3];
		int temp = 0;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int a[3];
	//		int b[3];
	//		int flag1;
	//		int flag2;
	//		double distance;
	//	}
	//	dian[46] = {0};
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < 3; j++)
			{
				c[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				temp = 0;
				for (k = 0; k < 3; k++)
				{
					dian[count].a[k] = c[i][k];
					dian[count].b[k] = c[j][k];
					dian[count].flag1 = i;
					dian[count].flag2 = j;
					temp = temp + (c[i][k] - c[j][k]) * (c[i][k] - c[j][k]);
				}
				dian[count].distance = Math.sqrt(temp);
				count++;
			}
		}
		for (i = count - 1; i >= 0; i--)
		{
			for (j = count - 1; j >= 0; j--)
			{
				if ((dian[i].distance > dian[j].distance && i > j) || ((dian[i].distance == dian[j].distance) && ((dian[i].flag1 < dian[j].flag1 && i > j) || (dian[i].flag1 == dian[j].flag1 && dian[i].flag2 < dian[j].flag2 && i > j))))
				{
					dian[45] = dian[i];
					dian[i] = dian[j];
					dian[j] = dian[45];
				}
			}
		}
		for (i = 0; i < count; i++)
		{
			System.out.print("(");
			System.out.print(dian[i].a[0]);
			System.out.print(",");
			System.out.print(dian[i].a[1]);
			System.out.print(",");
			System.out.print(dian[i].a[2]);
			System.out.print(")");
			System.out.print("-");
			System.out.print("(");
			System.out.print(dian[i].b[0]);
			System.out.print(",");
			System.out.print(dian[i].b[1]);
			System.out.print(",");
			System.out.print(dian[i].b[2]);
			System.out.print(")");
			System.out.print("=");
			System.out.printf("%.2f", dian[i].distance);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}
}

