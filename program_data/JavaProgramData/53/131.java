package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[100];
	int[] b = new int[100];
	int i;
	int j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * pa;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * pb;
	int N;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= n - 1;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	pa = a;
	for (i = 0;i <= n - 1;i++)
	{
			 pb = a[i + 1];
			 for (j = 0;j <= n - 2 - i;j++)
			 {
					 if ((*pb) == (*pa))
					 {
						 (*pb) = 0;
					 }
					 pb++;
			 }
			 pa++;
	}
	pa = a[0];
	pb = b[0];
	N = 0;
	for (i = 0;i <= n - 1;i++)
	{
			 if ((*pa) != 0)
			 {
					 *pb = pa;
					 pb++;
					 N++;
			 }
			 pa++;
	}
	for (i = 0;i <= N - 2;i++)
	{
	System.out.printf("%d,",b[i]);
	}
	System.out.printf("%d\n",b[i]);
	return 0;
	}
}

