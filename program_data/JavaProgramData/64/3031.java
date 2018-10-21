package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int n;
		 int[] x = new int[20];
		 int[] y = new int[20];
		 int[] z = new int[20];
		 float[][] dis = new float[20][20];
		 float[] a = new float[400];
		 int k = 0;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (int i = 0;i < n;i++)
		 {
			 x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 for (int i = 0;i < n;i++)
		 {
			 for (int j = i + 1;j < n;j++)
			 {
					 a[k] = dis[i][j] = Math.sqrt((float)((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j])));
					k++;
			 }
		 }
		 for (int i = 0;i < k - 1;i++)
		 {
			 for (int j = 0;j < k - i;j++)
			 {
				if (a[j] < a[j + 1])
				{
					 swap(a[j],a[j + 1]);
				}
			 }
		 }

		 for (int g = 0;g < k;g++)
		 {
				 for (int i = 0;i < n;i++)
				 {
					for (int j = i + 1;j < n;j++)
					{
						if (a[g] != a[g + 1] && a[g] == dis[i][j])
						{
							System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",x[i],y[i],z[i],x[j],y[j],z[j],a[g]);
						}
					}
				 }
		 }
	 return 0;
	 }
}

