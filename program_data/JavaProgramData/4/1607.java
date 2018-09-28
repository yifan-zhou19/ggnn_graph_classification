package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int lie;
		  int z;
		  int i;
		  int j;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  lie = Integer.parseInt(tempVar2);
		  }
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[n];
		  int[] p = new int[n];
		  for (i = 0;i < n;i++)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			 p[i] = (int)malloc(lie * (Integer.SIZE / Byte.SIZE));
			 for (j = 0;j < lie;j++)
			 {
							String tempVar3 = ConsoleInput.scanfRead();
							if (tempVar3 != null)
							{
								p[i] + j = Integer.parseInt(tempVar3);
							}
			 }
		  }
		  for (z = 0;z <= n + lie-2;z++)
		  {
								 for (i = 0;i < n;i++)
								 {
												 for (j = 0;j < lie;j++)
												 {
																   if (i + j == z)
																   {
																   System.out.printf("%d\n",*(p[i] + j));
																   }
												 }
								 }
		  }
	}

}

