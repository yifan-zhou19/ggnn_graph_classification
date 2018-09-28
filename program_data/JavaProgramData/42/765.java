package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int m;
	   int j;
	   int i;
	   int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   int * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
	   int q;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *head;
	   int head;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	   p = (int)malloc(100000 * (Integer.SIZE / Byte.SIZE));
	   for (i = 0;i < n;i++,p++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   p = Integer.parseInt(tempVar2);
		   }
	   }
	   int k;
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   k = Integer.parseInt(tempVar3);
	   }
	   p = p - n;
	   j = 0;
	   for (i = 0;i < n;i++,p++)
	   {
		   if (*p != k && j != 1)
		   {
			 j = 1;
				System.out.printf("%ld",*p);
		   }

		else if (*p != k)
		{
					   System.out.printf(" %ld",*p);
		}
	   }
	}
}

