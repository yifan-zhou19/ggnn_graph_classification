package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[][] a = new float[100][9]; //1-3???????4-5??????7???
		float[][] b = new float[20][4];
		float max = 0F;
		int n;
		int i;
		int j;
		int k = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			  for (j = 1;j <= 3;j++)
			  {
			  b[i][j] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			  }
		}

		for (i = 1;i <= n - 1;i++)
		{
			   for (j = i + 1;j <= n;j++)
			   {
				 a[k][1] = b[i][1];
			  a[k][2] = b[i][2];
			  a[k][3] = b[i][3];
			  a[k][4] = b[j][1];
			  a[k][5] = b[j][2];
			  a[k][6] = b[j][3];
			  a[k][7] = Math.sqrt(Math.pow((a[k][1] - a[k][4]),2) + Math.pow((a[k][2] - a[k][5]),2) + Math.pow((a[k][3] - a[k][6]),2));
			  a[k][8] = 0F; //??????
			  k++;
			   }
		}

	   for (i = 1;i <= (n * n - n) / 2;i++)
	   {
	   for (k = 1;k <= (n * n - n) / 2;k++)
	   {
		   if (a[k][7] > max && a[k][8] == 0F)
		   {
		   max = a[k][7];
		   }
	   }
	   for (k = 1;k <= (n * n - n) / 2;k++)
	   {
		   if (max == a[k][7] && a[k][8] == 0F)
		   {
	   System.out.printf("(%.0f,%.0f,%.0f)-(%.0f,%.0f,%.0f)=%.2f\n",a[k][1],a[k][2],a[k][3],a[k][4],a[k][5],a[k][6],a[k][7]);
	   a[k][8] = 1F;
	   max = 0F;
		   }
	   }
	   }
	   return 0;
	}

}

