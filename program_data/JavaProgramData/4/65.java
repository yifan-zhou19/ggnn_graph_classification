package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int[][] p;
		int[][] q;
		p = new int[100];
		for (i = 0;i < 100;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
						  *(p + i) = (int)malloc(100 * (Integer.SIZE / Byte.SIZE));
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
						for (j = 0;j < n;j++)
						{
										String tempVar3 = ConsoleInput.scanfRead();
										if (tempVar3 != null)
										{
											(*(p + i) + j) = tempVar3;
										}
						}
		}
		for (i = 0;i < m + n - 1;i++)
		{
							for (j = 0;j <= i;j++)
							{
											if ((j < m) && ((i - j) < n))
											{
											if (i == 0)
											{
													System.out.printf("%d",*(*(p + j) + i - j));
											}
											else
											{
													System.out.printf("\n%d",*(*(p + j) + i - j));
											}
											}
							}
		}
			return 0;
	}
}

