package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int row;
		   int col;
		   int i;
		   int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[100];
		   int[] p = new int[100];
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   row = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead(" ");
		   if (tempVar2 != null)
		   {
			   col = Integer.parseInt(tempVar2);
		   }
		   for (i = 0;i < row;i++)
		   {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			 p[i] = (int)malloc((Integer.SIZE / Byte.SIZE) * col);
			 for (j = 0;j < col;j++)
			 {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   p[i] + j = Integer.parseInt(tempVar3);
			   }
			 }
		   }
		   for (i = 0;i < row + col;i++)
		   {
			 for (j = i;j >= 0;j--)
			 {
			   if (i - j >= row != 0 || j >= col)
			   {
				   continue;
			   }
			   else
			   {
				   System.out.printf("%d\n",*(p[i - j] + j));
			   }
			 }
		   }
	}

}

