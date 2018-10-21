package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		  int p;
		  int i;
		  int j;
		  int n;
		  int aaa;
		  int h;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  p = malloc(n * (Integer.SIZE / Byte.SIZE));
		  for (h = 0;h <= n - 1;h++)
		  {
				*(p + h) = 0;
		  }
		  for (h = 0;;h++)
		  {
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					i = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					j = Integer.parseInt(tempVar3);
				}
				if ((i == 0) && (j == 0))
				{
				break;
				}
				*(p + i) = -1;
				if (*(p + j) == -1)
				{
				;
				}
				else
				{
					  *(p + j) += 1;
				}
		  }
		  aaa = 0;
		  for (h = 0;h <= n - 1;h++)
		  {
				if (*(p + h) == n - 1)
				{
					  System.out.printf("%d",h);
					  aaa = 1;
				}
		  }
		  if (aaa == 0)
		  {
				System.out.print("NOT FOUND");
		  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(p);
		  return 0;
	}

}

