package <missing>;

public class GlobalMembers
{
	public static int[] A = new int[10];
	public static int[] B = new int[10];
	public static int Main()
	{
		int x;
		int y;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pt1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pt2;
		int pt2;
		int number1 = 0;
		int number2 = 0;
		int flag = 0;
		pt1 = A;
		pt2 = B;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		while (x != 0)
		{
			*pt1 = x;
			x = x / 2;
			pt1++;
			number1++;
		}
		while (y != 0)
		{
			pt2 = y;
			y = y / 2;
			pt2++;
			number2++;
		}
		for (pt1 = A;pt1 < A + number1;pt1++)
		{
			for (pt2 = B;pt2 < B + number2;pt2++)
			{
				if (*pt1 == pt2)
				{
					System.out.printf("%d",*pt1);
					flag = 1;
					break;
				}
			}
			if (flag == 1)
			{
				break;
			}
		}
		return 0;
	}

}

