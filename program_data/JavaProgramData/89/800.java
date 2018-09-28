package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		  int p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		  p = (int)calloc(n,(Integer.SIZE / Byte.SIZE));


		  int j;
		  int k;
		  for (;;)
		  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  j = Integer.parseInt(tempVar2);
				  }
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  k = Integer.parseInt(tempVar3);
				  }
				  if (j == 0 && k == 0)
				  {
				  break;
				  }
				  *(p + j) = -1;
				  if (*(p + k) != -1)
				  {
				  *(p + k) = *(p + k) + 1;
				  }
		  }

		  int count = 0;
		  for (int i = 0;i < n - 1;i++)
		  {
				  if (*(p + i) == n - 1)
				  {
								 System.out.printf("%d",i);
								 count = 1;
				  }
		  }
		  if (count == 0)
		  {
		  System.out.print("NOT FOUND");
		  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(p);
	}

}

