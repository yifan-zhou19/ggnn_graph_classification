package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i;
		 int j;
		 int k;
		 int m;
		 int n;
		 int[] a = new int[50];
		 int[] b = new int[50];
		 float sum = 0F;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }

						m = 0;
						sum = 0F;
						for (j = 0;j < n;j++)
						{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							a[j] = Integer.parseInt(tempVar2);
						}
						}
						for (j = 0;j < n;j++)
						{
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							b[j] = Integer.parseInt(tempVar3);
						}
						}
						for (j = 0;j < n;j++)
						{
							if (b[j] <= 100 && b[j] >= 90)
							{
						sum = sum + (float)a[j] * 4.0;
							}
						if (b[j] <= 89 && b[j] >= 85)
						{
						sum = sum + (float)a[j] * 3.7;
						}
						if (b[j] <= 84 && b[j] >= 82)
						{
						sum = sum + (float)a[j] * 3.3;
						}
						if (b[j] <= 81 && b[j] >= 78)
						{
						sum = sum + (float)a[j] * 3.0;
						}
						if (b[j] <= 77 && b[j] >= 75)
						{
						sum = sum + (float)a[j] * 2.7;
						}
						if (b[j] <= 74 && b[j] >= 72)
						{
						sum = sum + (float)a[j] * 2.3;
						}
						if (b[j] <= 71 && b[j] >= 68)
						{
						sum = sum + (float)a[j] * 2.0;
						}
						if (b[j] <= 67 && b[j] >= 64)
						{
						sum = sum + (float)a[j] * 1.5;
						}
						if (b[j] <= 63 && b[j] >= 60)
						{
						sum = sum + (float)a[j] * 1.0;
						}
						}
						for (j = 0;j < n;j++)
						{
						m = m + a[j];
						}
						sum = (float)sum / m;
						System.out.printf("%.2f\n",sum);

	}



}

