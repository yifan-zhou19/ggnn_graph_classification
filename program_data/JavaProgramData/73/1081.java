package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int t;
		int[][] a = new int[5][5];
		int k;
	 for (i = 0;i <= 4;i++)
	 {
		 for (j = 0;j <= 4;j++)
		 {
		 a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
	 }
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 int * p;
	 p = a[0][0];
	 n = 0;
	 for (;p < a[0][0] + 25;p++)
	 {
		 m = 0;
	 t = (p - a[0][0]) % 5;
	 k = (p - a[0][0]) / 5;
		 for (i = 0;i <= 4;i++)
		 {
		   if ((*(*(a + i) + t)) < *p)
		   {
			   m++;
		   }
		   if (*(*(a + k) + i) > *p)
		   {
			   m++;
		   }

		 }
		 if (m == 0)
		 {
				   t++;
				   k++;
				   System.out.print(k);
				   System.out.print(" ");
				   System.out.print(t);
				   System.out.print(" ");
				   System.out.print(p);
				   System.out.print("\n");
		   n++;
		 }
	 }
	 if (n == 0)
	 {
		 System.out.print("not found");
	 }
	return 0;
	}
}

