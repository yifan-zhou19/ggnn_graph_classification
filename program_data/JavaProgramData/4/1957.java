package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		(int)(*p)[100];
		int row;
		int col;
		int r;
		int c;
		int j;
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
		p = (int [100])calloc(100,100 * (Integer.SIZE / Byte.SIZE));

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
		for (i = 0;i < col;i++)
		{
			r = 0;
			c = i;
			while (r < row && c >= 0)
			{
				System.out.printf("%d\n",*(*(p + r) + c));
				r++;
				c--;
			}
		}
		for (i = 1;i < row;i++)
		{
			r = i;
			c = col - 1;
			while (r < row && c >= 0)
			{
				System.out.printf("%d\n",*(*(p + r) + c));
				r++;
				c--;
			}
		}

		return 0;
	}
}

