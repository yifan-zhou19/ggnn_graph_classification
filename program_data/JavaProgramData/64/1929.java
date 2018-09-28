public class zuhe
{
	public int[] a = new int[3];
	public int[] b = new int[3];
	public double m;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		zuhe[] z = tangible.Arrays.initializeWithDefaultzuheInstances(50);
		 zuhe b = new zuhe();
		 int l;
		 int i;
		 int j;
		 int n;
		 int m;
		 int k = 0;
		 int[][] s = new int[100][4];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < n;i++)
		 {
			 for (j = 0;j < 3;j++)
			 {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 s[i][j] = Integer.parseInt(tempVar2);
				 }
			 }
		 }
		 for (i = 0;i < n - 1;i++)
		 {
			 for (j = i + 1;j < n;j++)
			 {
				 for (l = 0;l < 3;l++)
				 {
				 z[k].a[l] = s[i][l];
				 z[k].b[l] = s[j][l];
				 }
			   z[k].m = Math.pow((s[i][0] - s[j][0]) * (s[i][0] - s[j][0]) + (s[i][1] - s[j][1]) * (s[i][1] - s[j][1]) + (s[i][2] - s[j][2]) * (s[i][2] - s[j][2]),0.5);
				   k = k + 1;
			 }
		 }
		 for (i = 1;i < n * (n - 1) / 2;i++)
		 {
			 for (j = 0;j < n * (n - 1) / 2 - i;j++)
			 {
				 if (z[j].m < z[j + 1].m)
				 {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: b=z[j];
					 b.copyFrom(z[j]);
					 z[j] = z[j + 1];
					 z[j + 1] = b;
				 }
			 }
		 }
		 for (i = 0;i < n * (n - 1) / 2;i++)
		 {
			 System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",z[i].a[0],z[i].a[1],z[i].a[2],z[i].b[0],z[i].b[1],z[i].b[2],z[i].m);
		 }

		 return 0;
	}
}

