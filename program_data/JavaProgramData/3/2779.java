package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *num=(int*)malloc(n *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		int num = (int)malloc(n * (Integer.SIZE / Byte.SIZE));

		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num + i = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i <= n / 2;i++)
		{
			for (j = 0;j < n;j++)
			{
			  if (*(num + i) + *(num + j) == k)
			  {
				  System.out.print("yes\n");
				  return 0;
			  }
		  else
		  {
			  continue;
		  }
			}
		}
		  System.out.print("no\n");
		  return 0;


	}

}

