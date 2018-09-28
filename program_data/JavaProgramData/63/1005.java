package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int x1;
		  int y1;
		  int x2;
		  int y2;
		  int i;
		  int j;
		  int k;
		  int sum;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  x1 = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  y1 = Integer.parseInt(tempVar2);
		  }
		  int[] a = new int[x1 * y1];
		  for (i = 0;i < x1;i++)
		  {
				for (j = 0;j < y1;j++)
				{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i * y1 + j] = Integer.parseInt(tempVar3);
				}
				}
		  }
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  x2 = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ");
		  if (tempVar5 != null)
		  {
			  y2 = Integer.parseInt(tempVar5);
		  }
		  int[] b = new int[x2 * y2];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *c=(int*)malloc(x1 *y2 *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  int c = (int)malloc(x1 * y2 * (Integer.SIZE / Byte.SIZE));
		  for (i = 0;i < x2;i++)
		  {
			   for (j = 0;j < y2;j++)
			   {
			   String tempVar6 = ConsoleInput.scanfRead();
			   if (tempVar6 != null)
			   {
				   b[i * y2 + j] = Integer.parseInt(tempVar6);
			   }
			   }
		  }
		  for (i = 0;i < x1;i++)
		  {
						   for (j = 0;j < y2;j++)
						   {
											sum = 0;
											for (k = 0;k < x2;k++)
											{
											sum = sum + a[i * y1 + k] * b[k * y2 + j];
											}
											c[i * y2 + j] = sum;
											System.out.printf("%d",c[i * y2 + j]);
											if ((j + 1) % y2 != 0)
											{
											System.out.print(" ");
											}
											else
											{
											System.out.print("\n");
											}
						   }
		  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(b);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(c);
		  System.in.read();
		  System.in.read();
	}


}

