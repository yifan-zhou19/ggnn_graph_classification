package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a,*a0,*b,*p;
		int a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a0;
		int a0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b;
		int b;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int row;
		int col;
		int r;
		int c;
		int t;
		int i;

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


//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		a = (int)calloc(100,100 * (Integer.SIZE / Byte.SIZE));

		a0 = a;

		for (r = 0;r < row;r++)
		{
		 for (c = 0;c < col;c++)
		 {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a + r * col + c = Integer.parseInt(tempVar3);
		   }
		 }
		}



		a = a0;
		for (c = 0;c < row + col - 1;c++)
		{
		 r = 0;
		 t = c;
			 for (i = 0;i < row * col;i++)
			 {
			  if (0 <= r != 0 && r < row && 0 <= t != 0 && t < col)
			  {
			   System.out.printf("%d",*(a + r * col + t));
			   if (r != row - 1 || t != col - 1)
			   {
				   System.out.print("\n");
			   }
			  }
			   r++;
			   t--;
			 }
		}

	}

}

