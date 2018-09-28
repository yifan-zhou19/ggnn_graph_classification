package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int m;
	  int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *num;
	  int num;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  num = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
	  for (i = 0;i < n;i++)
	  {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  num + i = Integer.parseInt(tempVar3);
	  }
	  }
	   System.out.printf("%d",*(num + n - m));
	  for (i = n - m + 1;i < n;i++)
	  {
		System.out.printf(" %d",*(num + i));
	  }
	  for (i = 0;i < n - m;i++)
	  {
	   System.out.printf(" %d",*(num + i));
	  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	  free(num);

		return 0;
	}
}

