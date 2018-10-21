package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[301];
	  int j;
	  int n;
	  int i;
	  int k;
	  int b;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
	  int p;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  k = Integer.parseInt(tempVar2);
	  }
	  System.out.printf("%d",k);
	  a[0] = k;
	  p = a;
	  b = 1;
	  for (i = 1;i < n;i++)
	  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  k = Integer.parseInt(tempVar3);
		  }
		 for (j = 0;j < b;j++)
		 {
		 if (*(p + j) == k)
		 {
			 break;
		 }
		 }
		if (j == b)
		{
			System.out.printf(",%d",k);
			*(p + b) = k;
			b++;
		}


	  }
	}
}

