package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[200];
	public static int m;
	public static int n;
	 public static void input()
	 {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 m = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 n = Integer.parseInt(tempVar2);
		 }
		 for (int i = 0;i < m;i++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i] = Integer.parseInt(tempVar3);
			 }
		 }
		 for (int j = 0;j < n;j++)
		 {
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 b[j] = Integer.parseInt(tempVar4);
			 }
		 }
	 }
	 public static void sort()
	 {
		 for (int p = 1;p < m;p++)
		 {
			 for (int i = 0;i < (m - p);i++)
			 {
				 if (a[i] > a[i + 1])
				 {
					 int temp;
					 temp = a[i];
					 a[i] = a[i + 1];
					 a[i + 1] = temp;
				 }
			 }
		 }
		 for (int p = 1;p < n;p++)
		 {
			 for (int i = 0;i < (n - p);i++)
			 {
				 if (b[i] > b[i + 1])
				 {
					 int temp;
					 temp = b[i];
					 b[i] = b[i + 1];
					 b[i + 1] = temp;
				 }
			 }
		 }
	 }
	 public static void combine()
	 {
		 for (int i = 0;i < m;i++)
		 {
			 c[i] = a[i];
		 }
		 for (int j = 0;j < n;j++)
		 {
			 c[m + j] = b[j];
		 }
	 }
	 public static void output()
	 {
		 for (int i = 0;i < (m + n);i++)
		 {
			 System.out.printf("%d",c[i]);
			 if (i < (m + n - 1))
			 {
				 System.out.print(" ");
			 }
		 }
	 }
	public static int Main()
	{
	  input();
	  sort();
	  combine();
	  output();
	return 0;
	}



}

