package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] x = new int[11];
		int[] y = new int[11];
		int i;
		int j;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1,*p2;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y[0] = Integer.parseInt(tempVar2);
		}
		p1 = x[0];
		p2 = y[0];
		if (p1 == p2 || p1 == 1 || p2 == 1)
		{
			System.out.printf("%d", p1);
		}
		else
		{
		for (i = 0;i < 13;i++)
		{
		*(p1 + 1) = p1 / 2;
		p1++;
			if (p1 == 1)
			{
				break;
			}
		}
		for (j = 0;j < 13;j++)
		{
		*(p2 + 1) = p2 / 2;
		p2++;
			if (p2 == 1)
			{
				break;
			}
		}
		for (m = 0;m < 13;m++)
		{
			if (p2 != p1)
			{
		System.out.printf("%d",*(p2 + 1));
		break;
			}
			p1 = p1 - 1;
			p2 = p2 - 1;
		}
		}
	}
}

