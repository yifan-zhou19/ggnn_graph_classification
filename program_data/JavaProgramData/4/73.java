package <missing>;

public class GlobalMembers
{
	public static int[] matrix;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *matrix_end;
	public static int matrix_end;
	public static int row;
	public static int col;

//C++ TO JAVA CONVERTER WARNING: Java has no equivalent to methods returning pointers to value types:
//ORIGINAL LINE: int* next(int* p)
	public static int next(tangible.RefObject<Integer> p)
	{
		System.out.printf("%d\n", p.argValue);
		return p.argValue + col - 1;
	}


	public static void Main()
	{
		int i;
		int j;
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
		matrix = new int[row * col];
		matrix_end = matrix + row * col - 1;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					matrix[i * col + j] = Integer.parseInt(tempVar3);
				}
			}
		}

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * iter;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *iter_;
		int iter_;
		iter = matrix;
		for (iter = matrix; iter < matrix + col;iter++)
		{
			int a = iter - matrix + 1;
			if (row < a)
			{
				a = row;
			}
			iter_ = iter;
			while (a-- != 0)
			{
			tangible.RefObject<Integer> tempRef_iter_ = new tangible.RefObject<Integer>(iter_);
				iter_ = next(tempRef_iter_);
				iter_ = tempRef_iter_.argValue;
			}
		}
		for (iter = matrix + 2 * col - 1;iter <= matrix_end;iter = iter + col)
		{
			int a = (matrix_end - iter) / col + 1;
			if (col < a)
			{
				a = col;
			}
			iter_ = iter;
			while (a-- != 0)
			{
			tangible.RefObject<Integer> tempRef_iter_2 = new tangible.RefObject<Integer>(iter_);
				iter_ = next(tempRef_iter_2);
				iter_ = tempRef_iter_2.argValue;
			}
		}
	}




}

