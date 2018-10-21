package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a,i,m,n,k,s=0,*b,j;
	  int a;
	  int i;
	  int m;
	  int n;
	  int k;
	  int s = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b;
	  int b;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  k = Integer.parseInt(tempVar);
	  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
	  b = (int)calloc(k,(Integer.SIZE / Byte.SIZE));
	  for (i = 0;i < k;i++)
	  {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 m = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 n = Integer.parseInt(tempVar3);
		 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		 a = (int)calloc(m * n,(Integer.SIZE / Byte.SIZE));
		 for (j = 0;j < m * n;j++)
		 {
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 a + j = Integer.parseInt(tempVar4);
			 }
		 }
		 for (j = 0;j < m;j++)
		 {
			 s = s + *(a + j * n) + *(a + j * n + n - 1);
		 }
		 for (j = 1;j < n - 1;j++)
		 {
		  s = s + *(a + j) + *(a + (m - 1) * n + j);
		 }

		 *(b + i) = s;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		 free(a);
		 s = 0;
	  }
	  for (i = 0;i < k;i++)
	  {
	  System.out.printf("%d",*(b + i));
	  if (i < k - 1)
	  {
		  System.out.print("\n");
	  }
	  }

	}
}

