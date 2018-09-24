package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int a;
		 int b;
		 int n;
		 int j;
		 int i;
		 int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *hi;
		 int hi;
		 int col;
		 int row;
		 int s;
		 int max;
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
		 s = row * col;

//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=(int*)malloc(10000 *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		int p = (int)malloc(10000 * (Integer.SIZE / Byte.SIZE));
	hi = p;
	if (col > row)
	{
		max = col;
	}
	else
	{
		max = row;
	}
	for (i = 0;i < s;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		p + i = Integer.parseInt(tempVar3);
	}
	}
	for (j = 0;j < col + row;j++)
	{
	 for (k = 0;k <= j;k++)
	 {
	 if (j - k < col && k < row)
	 {
	   System.out.printf("%d\n",*(hi + j - k + col * k));
	 }
	 }
	}
	}
}

