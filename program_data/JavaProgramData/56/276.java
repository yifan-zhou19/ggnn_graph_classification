package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *x, y;
		int x;
		int y;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		x = malloc(4 * (Integer.SIZE / Byte.SIZE));
		for (i = 0; i < 4; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x + i = Integer.parseInt(tempVar);
			}
		}
		for (i = 0; i < 4; i++)
		{
			y = (x + i);
			while (y != 0)
			{
			System.out.printf("%d", y % 10);
			y = y / 10;
			}
			System.out.print("\n");
		}

		return 0;
	}

}

