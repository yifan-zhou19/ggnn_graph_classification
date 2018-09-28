package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		double x;
		double y;
		double GPA;
		int[][] a = new int[2][101];
		float[] b = new float[101];
		float[] c = new float[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= 1;i++)
		{

			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
			for (j = 0;j < n;j++)
			{

				if (a[1][j] <= 100 && a[1][j] >= 90)
				{
				b[j] = 4.0F;
				}
				else if (a[1][j] <= 89 && a[1][j] >= 85)
				{
					b[j] = 3.7F;
				}
				else if (a[1][j] <= 84 && a[1][j] >= 82)
				{
						b[j] = 3.3F;
				}
				else if (a[1][j] <= 81 && a[1][j] >= 78)
				{
							b[j] = 3.0F;
				}
				else if (a[1][j] <= 77 && a[1][j] >= 75)
				{
								b[j] = 2.7F;
				}
				else if (a[1][j] <= 74 && a[1][j] >= 72)
				{
									b[j] = 2.3F;
				}
				else if (a[1][j] <= 71 && a[1][j] >= 68)
				{
									b[j] = 2.0F;
				}
				else if (a[1][j] <= 67 && a[1][j] >= 64)
				{
									b[j] = 1.5F;
				}
				else if (a[1][j] <= 63 && a[1][j] >= 60)
				{
									b[j] = 1.0F;
				}
				else
				{
					b[j] = 0F;
				}
			}
				for (j = 0;j < n;j++)
				{

				c[j] = a[0][j] * b[j];
				}
				x = 0;
				y = 0;

			 for (j = 0;j < n;j++)
			 {
				x = x + c[j];
				y = y + a[0][j];
			 }
				  GPA = x / y;
				 System.out.printf("%.2f",GPA);
	}











}

