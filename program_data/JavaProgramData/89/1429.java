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
//ORIGINAL LINE: int *p=(int *)malloc(sizeof(int)*n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	   int p = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
	   for (int i = 0;i < n;i++)
	   {
		   *(p + i) = 0;
	   }
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *t=(int *)malloc(sizeof(int)*n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	   int t = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
	   for (int i = 0;i < n;i++)
	   {
		   *(t + i) = 0;
	   }
	   int a;
	   int b;
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
	   while (a != 0 || b != 0)
	   {
		  *(t + a) = *(t + a) + 1;
		  *(p + b) = *(p + b) + 1;
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  a = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ");
		  if (tempVar5 != null)
		  {
			  b = Integer.parseInt(tempVar5);
		  }
	   }
	   int y = 0;
	   for (int i = 0;i < n;i++)
	   {
		  if ((*(p + i) == n - 1) && (*(t + i) == 0))
		  {
			 System.out.printf("%d",i);
			 y = 1;
		  }
	   }
	   if (y == 0)
	   {
		 System.out.print("NOT FOUND");
	   }
	   System.in.read();
	   System.in.read();

	}

}

