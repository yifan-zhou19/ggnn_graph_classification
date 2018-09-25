package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] rn = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int[] pn = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};

		int y;
		int m;
		int d;
		int dday;
		int i;
		int j;

//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *x;
		int x;
		int n = 5;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		x = malloc(15 * (Integer.SIZE / Byte.SIZE));

		for (i = 0; i < n; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x + i * 3 = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				x + i * 3 + 1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				x + i * 3 + 2 = Integer.parseInt(tempVar3);
			}
		}


		for (i = 0; i < n; i++)
		{
			dday = 0;
			y = (x + i * 3);
			m = (x + i * 3 + 1);
			d = (x + i * 3 + 2);
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
			{
				for (j = 0; j < m - 1; j++)
				{
					dday = dday + rn[j];
				}
			}
			else
			{
				for (j = 0; j < m - 1; j++)
				{
					dday = dday + pn[j];
				}
			}
			dday = dday + d;
			System.out.printf("%d\n", dday);
		}

		return 0;
	}

}

