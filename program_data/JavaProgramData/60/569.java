package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
	   int a;
	   int c = 0;
	   int t;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
	   a = (int)calloc(n + 1,(Integer.SIZE / Byte.SIZE));
	   for (i = 1;i <= n;i++)
	   {
		*(a + i) = 0;
	   }
	   for (i = 3;i <= n;i += 2)
	   {
		   t = 1;
		  for (j = 2;j * j <= i;j++)
		  {
		   if (i % j == 0)
		   {
		   t = 0;
		   break;
		   }
		  }
		  if (t == 1)
		  {
			  *(a + i) = 1;
		  }
	   }
	   for (i = 3;i < n - 1;i += 2)
	   {
	   if (*(a + i) == 1 && *(a + i + 2) == 1)
	   {
		   c++;
	   }
	   }
	   if (c == 0)
	   {
		   System.out.print("empty");
	   }
	   if (c != 0)
	   {
	   for (i = 3;i < n - 1;i += 2)
	   {
	   if (*(a + i) == 1 && *(a + i + 2) == 1)
	   {
		   System.out.printf("%d %d",i,i + 2);
		  c--;
		  if (c > 0)
		  {
			  System.out.print("\n");
		  }
	   }
	   }
	   }

	}
}

