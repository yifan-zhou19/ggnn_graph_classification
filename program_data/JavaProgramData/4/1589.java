package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *array;
		int array;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int i;
		int j;
		int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		row = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		col = Integer.parseInt(tempVar2);
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
	array = (int)calloc(row,col * (Integer.SIZE / Byte.SIZE));
	for (p = array;p <= array + row * col - 1;p++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		p = Integer.parseInt(tempVar3);
	}
	}
	for (t = 0;t <= row + col - 2;t++)
	{
	 for (i = 0;i <= t;i++)
	 {
		 if (i > row - 1 || t - i > col - 1)
		 {
	 continue;
		 }
		 System.out.printf("%d\n",*(array + i * col + t - i));

	 }
	}







	}




}

