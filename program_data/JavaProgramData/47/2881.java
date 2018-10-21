package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int i;
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
		 p = a;
		 for (i = n - 1;i >= 0;i--)
		 {
					 if (i == n - 1)
					 {
					 System.out.printf("%d",*(p + i));
					 }
					 else
					 {
					 System.out.printf(" %d",*(p + i));
					 }
		 }
		  return 0;
	}
}

