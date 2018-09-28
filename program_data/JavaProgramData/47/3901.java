package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * array;
	 int array;
	 int n;
	 int i;
	 int buffer;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 array = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  (array + i) = Integer.parseInt(tempVar2);
	  }
	 }
	 for (i = 0;i <= (n - 1) / 2;i++)
	 {
	  buffer =  (array + i);
	  * (array + i) = * (array + (n - i - 1));
	  * (array + (n - i - 1)) = buffer;
	 }
	 int first;
	 first = 1;
	 for (i = 0;i < n;i++)
	 {
	  if (first != 0)
	  {
	   System.out.printf("%d",* (array + i));
	   first = 0;
	  }
	  else
	  {
	   System.out.printf(" %d",* (array + i));
	  }
	 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	 free(array);
	 return 0;
	}



}

