package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,*q;
	 int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
	 int q;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 q = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
	 for (i = 0;i < n;i++)
	 {
	  *(p + i) = 0;
	  *(q + i) = 0;
	 }
					 int a;
					 int b;
					while (true)
					{
					  String tempVar2 = ConsoleInput.scanfRead();
					  if (tempVar2 != null)
					  {
						  a = Integer.parseInt(tempVar2);
					  }
					  String tempVar3 = ConsoleInput.scanfRead(" ");
					  if (tempVar3 != null)
					  {
						  b = Integer.parseInt(tempVar3);
					  }
					  if (a == 0 && b == 0)
					  {
						  break;
					  }
					  else
					  {
					   *(p + a) = *(p + a) + 1;
					   *(q + b) = *(q + b) + 1;
					  }
					}
							   int[] x = new int[2];
							   x[0] = -1;
							   for (i = 0;i < n;i++)
							   {
								if (*(p + i) == 0 && *(q + i) == n - 1)
								{
									x[0] = i;
									System.out.printf("%d",x[0]);
									break;
								}
							   }
											   if (x[0] == -1)
											   {
											   System.out.print("NOT FOUND\n");
											   }

	}

}

