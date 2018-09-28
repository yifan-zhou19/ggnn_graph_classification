package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int[] a = new int[100000];
	 int[] b = new int[100000];
	 int[] A = new int[100000];
	 int[] B = new int[100000];
	 int c = 0;
	 int num = 0;
	 int bp = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (int i = 0;;i++)
	 {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 a[i] = Integer.parseInt(tempVar2);
				 }
				 String tempVar3 = ConsoleInput.scanfRead(" ");
				 if (tempVar3 != null)
				 {
					 b[i] = Integer.parseInt(tempVar3);
				 }
			  if (a[i] == 0 && b[i] == 0)
			  {
				  break;
			  }
			  else
			  {
			  num++;
			  }

	 }
	 for (int i = 0;i < n;i++)
	 {
			 for (int j = 0;j < num;j++)
			 {
				 if (a[j] == i)
				 {
			 A[i]++;
				 }
			 if (b[j] == i)
			 {
			 B[i]++;
			 }
			 }
	 }
	 for (int i = 0;i < n;i++)
	 {

			 if (A[i] == 0 && B[i] == n - 1)
			 {
					System.out.printf("%d",i);
					c++;
			 }

	 }
	 if (c == 0)
	 {
	 System.out.print("NOT FOUND");
	 }
	 System.in.read();
	 System.in.read();
	}
}

