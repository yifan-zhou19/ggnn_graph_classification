package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int[] A = new int[50000];
		 int[] B = new int[50000];
		 int b = 0;
		 int i;
		 int a = 50000;
		 int c = 0;
		 int j;
		 double m;
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
							  A[i] = Integer.parseInt(tempVar2);
						  }
						  String tempVar3 = ConsoleInput.scanfRead();
						  if (tempVar3 != null)
						  {
							  B[i] = Integer.parseInt(tempVar3);
						  }
						  if (A[i] < a)
						  {
							  a = A[i];
						  }
						  if (B[i] > b)
						  {
							  b = B[i];
						  }
		 }
						  for (j = a;j < b;j++)
						  {
							  m = j * 1.0 + 0.5;
											   for (i = 0;i < n;i++)
											   {
																if (m > A[i] && m < B[i])
																{
																   c++;
																   break;
																}
											   }
						  }
											   if (c == b - a)
											   {
												   System.out.printf("%d %d",a,b);
											   }
											   else
											   {
												   System.out.print("no");
											   }

											   return 0;
	}

}

