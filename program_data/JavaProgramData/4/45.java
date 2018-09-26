package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int[][] p;
		int k;
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
		for (j = 0;j < col;j++)
		{
			i = 0;
			k = j;
			while (k >= 0 && i < row)
			{
				System.out.printf("%d\n",*(*(p + i) + k));
				i++;
				k--;
			}
		}
		for (i = 1;i < row;i++)
		{
			j = col - 1;
			k = i;
			while (k < row && j >= 0)
			{
				System.out.printf("%d\n",*(*(p + k) + j));
				k++;
				j--;
			}
		}
	}

}

