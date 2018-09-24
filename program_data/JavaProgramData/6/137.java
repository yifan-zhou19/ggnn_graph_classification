package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int row;
		int q;
		int col;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *num;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		num = (int)malloc(k * (Integer.SIZE / Byte.SIZE));
		for (q = 0;q < k;q++)
		{
			int sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				row = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				col = Integer.parseInt(tempVar3);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			a = (int)malloc(row * col * (Integer.SIZE / Byte.SIZE));
			for (i = 0;i < row;i++)
			{
				for (j = 0;j < col;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a + i * col + j = Integer.parseInt(tempVar4);
					}
					if (i == 0 || j == 0 || i == row - 1 || j == col - 1)
					{
						sum = sum + *(a + i * col + j);
					}
				}
			}
			*(num + q) = sum;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(a);
		}
		for (q = 0;q < k;q++)
		{
			System.out.printf("%d\n",*(num + q));
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(num);
	}





}

