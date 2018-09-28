package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int j;
	int k;
	int n;
	int m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,a[100];
	int p;
	int[] a = new int[100];
	p = a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < n;i++)
	{
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  p + i = Integer.parseInt(tempVar3);
	  }
	}
	for (i = 0;i < m;i++)
	{
	  System.out.printf("%d ",*(p + i + n - m));
	}
	for (i = m;i < n - 1;i++)
	{
	  System.out.printf("%d ",*(p + i - m));
	}
	 System.out.printf("%d",*(p + n - m - 1));

	}
}

