package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[100];
		int[] p = new int[100];
		int m;
		int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  for (i = 0;i < m;i++)
	  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  p[i] = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
	  }
	  for (i = 0;i < m;i++)
	  {
		  for (j = 0;j < n;j++)
		  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  p[i] + j = Integer.parseInt(tempVar3);
		  }
		  }
	  }
	  for (j = 0;j < n;j++)
	  {
		  k = j;
		  for (i = 0;i < m;i++)
		  {
			  System.out.printf("%d\n",*(p[i] + k--));
		   if (k < 0)
		   {
			   break;
		   }
		  }
	  }
	  for (i = 1;i < m;i++)
	  {
		  k = i;
		  for (j = n - 1;j >= 0;j--)
		  {
			  System.out.printf("%d\n",*(p[k++] + j));
		   if (k == m)
		   {
			   break;
		   }
		  }
	  }
	}
}

