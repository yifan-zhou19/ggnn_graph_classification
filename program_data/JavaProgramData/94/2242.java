package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *data;
	 public static int data;
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	// int InitData();
	 public static void Sort(int[] a, int n)
	 {
		 int i;
		 int j;
		 int k;
		 int t;
		 for (i = 0;i < n;i++)
		 {
			 k = i;
			 for (j = i + 1;j < n;j++)
			 {
				 if (a[j] < a[k])
				 {
					 k = j;
				 }
			 }
			 if (k != i)
			 {
				 t = a[k];
				 a[k] = a[i];
				 a[i] = t;
			 }
		 }
	 }
	 public static void PrintData(int[] a, int n)
	 {
		 int i;
		 for (i = 0;i < n;i++)
		 {
			 if (a[i] % 2 == 1 && i > 0)
			 {
			 System.out.printf(",%d",a[i]);
			 }
		 }
	 }

	 public static int Main()
	 {
		 int[] a = new int[10000];
		 int i;
		 int n;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 (a[i]) = Integer.parseInt(tempVar2);
			 }
		 }
		 Sort(a, n);
		 System.out.printf("%d",a[0]);
		 PrintData(a, n);
		 return 0;
	 }

}

