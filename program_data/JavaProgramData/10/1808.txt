package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int m;
		 int i;
		 int j;
		 int k;
		 int t;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 int[] p = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q=(int *)malloc(n *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 int q = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a=(int *)malloc(n *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 int a = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		 for (i = 0;i < n;i++)
		 {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  p[i] = Integer.parseInt(tempVar2);
				  }
		 }
		 for (i = 0;i < n;i++)
		 {
				  q[i] = 1;
		 }
		 for (i = 1;i < n;i++)
		 {
			 t = 0;
			 for (j = 0;j < n;j++)
			 {
				 a[j] = 0;
			 }
			 for (j = 0;j < i;j++)
			 {
				   if (p[j] >= p[i])
				   {
					   a[j] = q[j];
				   }
				   for (k = 0;k < i;k++)
				   {
					   if (a[k] > t)
					   {
							   t = a[k];
					   }
				   }
			 }
				q[i] = q[i] + t;
		 }
		 t = 0;
		 for (i = 0;i < n;i++)
		 {
			 if (q[i] > t)
			 {
					t = q[i];
			 }
		 }
	System.out.printf("%d",t);
	return 0;
	}
}

