package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int n;
		int m;
		int i;
		int j;
		int[] p = new int[1000];
		(int)(*q)[1000];
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int [1000])malloc(row * 1000 * (Integer.SIZE / Byte.SIZE));
		q = p;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					*(q + i) + j = tempVar3;
				}
			}
		}
		q = p;
		for (j = 0;j < col;j++)
		{
			m = j;
			for (i = 0;m >= 0 && i < row;m--, i++)
			{
				System.out.printf("%d\n",*(*(q + i) + m));
			}
		}
		for (i = 1;i < row;i++)
		{
			m = i;
			for (j = col - 1;m < row && j >= 0;j--, m++)
			{
				System.out.printf("%d\n",*(*(q + m) + j));
			}
		}
	}
}

