package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];
	public static int[][] b = new int[5][5];
	public static int m;
	public static int n;
	public static int[] c = new int[5];
	public static int zhuanhuan(int[][] a, int m, int n)
	{
		int z;
		int i;
		if (n <= 4 && n >= 0 && m <= 4 && m >= 0)
		{
		   z = 1;
			for (i = 0;i < 5;i++)
			{
				c[i] = (a[m] + i);
				*(a[m] + i) = *(a[n] + i);
				*(a[n] + i) = c[i];
			}

		}
		else
		{
			z = 0;
		}
		return (z);
	}
	public static void Main()
	{
		 int i;
		 int j;
		 int fanhui;
		 for (i = 0;i < 5;i++)
		 {
			 for (j = 0;j < 5;j++)
			 {
				 String tempVar = ConsoleInput.scanfRead();
				 if (tempVar != null)
				 {
					 *(a[i] + j) = tempVar;
				 }
			 }
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 m = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 n = Integer.parseInt(tempVar3);
		 }
		 fanhui = zhuanhuan(a, m, n);
		 if (fanhui == 0)
		 {
			 System.out.print("error");
		 }
		 if (fanhui == 1)
		 {
			 for (i = 0;i < 5;i++)
			 {
				 for (j = 0;j < 5;j++)
				 {
					 if (j == 4)
					 {
						 System.out.printf("%d\n",*(a[i] + j));
					 }
					 else
					 {
						 System.out.printf("%d ",*(a[i] + j));
					 }
				 }
			 }
		 }
	}

}

