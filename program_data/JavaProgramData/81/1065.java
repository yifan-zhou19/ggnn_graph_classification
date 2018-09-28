package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int m;
		int n;
		int i;
		int j;
		(int)(*p)[5];
		int temp;
		p = a;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					(*(p + i) + j) = tempVar;
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (n > 4 || n < 0 || m>4 || m < 0)
		{
			System.out.print("error\n");
		}
		else
		{
		for (i = 0;i < 5;i++)
		{
			temp = (*(p + m) + i);
			*(*(p + m) + i) = *(*(p + n) + i);
			*(*(p + n) + i) = temp;
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (j == 0)
				{
					System.out.printf("%d",*(*(p + i) + j));
				}
				else
				{
					System.out.printf(" %d",*(*(p + i) + j));
				}
			}
			System.out.print("\n");
		}
		}
		return 0;
	}
}

