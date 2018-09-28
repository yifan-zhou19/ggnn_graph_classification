package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int[] a = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  int * pa;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pb;
	  int pb;
	  int k = 0;
	  int l;
	  int i = 0;
	  int[] b = new int[300];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (pa = a;pa < a + n;pa++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  pa = Integer.parseInt(tempVar2);
		  }
	  }
	  for (pa = a;pa < a + n;pa++)
	  {
		  l = 0;
		  for (pb = b;pb < b + k;pb++)
		  {
			  if (*pa == pb)
			  {
				  l = 1;
			  }
		  }
		  if (l == 1)
		  {
			  continue;
		  }
		  b[k] = pa;
		  k++;
	  }
	  for (i = 0;i < k;i++)
	  {
			  if (i == 0)
			  {
					System.out.printf("%d",b[i]);
			  }
			  else
			  {
			  System.out.printf(",%d",b[i]);
			  }
	  }
	}
}

