package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int[][] a = new int[5][5];
		int m;
		int n;
		int s = 1;
		int b;
		p = b;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					*(a + i) + j = tempVar;
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
		if (m > 4 || m < 0 || n>4 || n < 0)
		{
			s = 0;
			System.out.print("error\n");
		}
		else
		{
			for (j = 0;j < 5;j++)
			{
				p = *(*(a + m) + j);
				*(*(a + m) + j) = *(*(a + n) + j);
				*(*(a + n) + j) = p;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					System.out.printf("%d%c",*(*(a + i) + j),(j == 4)?'\n':' ');
				}
			}
		}
		return s;
	}




}

