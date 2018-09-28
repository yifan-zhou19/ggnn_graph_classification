package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int[] a = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pa;
	 int pa;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pb;
	 int pb;
	 int[] b = new int[300];
	 int i;
	 int j;
	 int k = 1;
	 int m;
	 int n;
	 int t;
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
		 a[i] = Integer.parseInt(tempVar2);
	 }
	 }
	 pb = b;
	 pa = a;
	 b[0] = a[0];
	 for (i = 0;i < n;i++)
	 {
		 m = 0;
	  for (j = 0;j < k;j++)
	  {
		if (*(pa + i) != *(pb + j))
		{
		m = m + 1;
		}
	  }
	  if (m == k)
	  {
		 *(pb + k) = *(pa + i);
		 k++;
	  }
	 }
	 pb = b;
		 for (i = 0;i < k - 1;i++)
		 {
			System.out.printf("%d,",*(pb + i));
		 }
		System.out.printf("%d",*(pb + k - 1));

	}
}

