package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i;
	 int j;
	 int k;
	 int[][] p;
	 int col;
	 int row;
	 int sum;
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
	 p = new int[row];
	 for (i = 0;i < row;i++)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		*(p + i) = (int)malloc(col * (Integer.SIZE / Byte.SIZE));
	 }
	 for (i = 0;i < row;i++)
	 {
		for (j = 0;j < col;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				*(p + i) + j = tempVar3;
			}
		}
	 }
		k = row + col;
		for (sum = 0;sum <= k;sum++)
		{
			for (i = 0;i <= sum;i++)
			{
				j = sum - i;
				if (i < row && j < col)
				{
					System.out.printf("\n%d",*(*(p + i) + j));
				}
			}
		}
	}
}

