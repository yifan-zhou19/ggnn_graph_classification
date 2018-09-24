package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[300];
		  int n;
		  int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		  int p;
		  p = a;
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
			  p + i = Integer.parseInt(tempVar2);
		  }
		  }
		  for (i = 0;i < n;i++)
		  {
		  *(p + n + 99 - i) = *(p + i);
		  }
		  for (i = 100;i < 100 + n - 1;i++)
		  {
		  System.out.printf("%d ",*(p + i));
		  }
		  System.out.printf("%d",*(p + 100 + n - 1));
	}
}

