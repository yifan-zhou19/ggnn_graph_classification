package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
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
		int[] p = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int [100])malloc(row * col * (Integer.SIZE / Byte.SIZE));
		int i;
		int j;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[i] + j = tempVar3;
				}
			}
		}
			int k;
		for (k = 0;k < col;k++)
		{
			for (i = 0, j = k;i < row && j >= 0 ;i++, j--)
			{
				System.out.printf("%d\n",*(p[i] + j));
			}
		}
		for (k = 1;k < row;k++)
		{
			for (i = k, j = col - 1;i < row && j >= 0 ;i++, j--)
			{
				System.out.printf("%d\n",*(p[i] + j));
			}
		}
	}



}

