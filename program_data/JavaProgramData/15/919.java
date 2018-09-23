package <missing>;

public class GlobalMembers
{
	public static int[][] xiangsu = new int[1000][1000];
	public static int Main()
	{
		int n;

		int head1;
		int head2;
		int end1;
		int end2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int sum;
		int j;
		int i;
		for (i = 0;i < n;i++)
		{
		for (j = 0;j < n;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(xiangsu[i][j]) = Integer.parseInt(tempVar2);
		}
		}
		}

		int f = 1;
		for (i = 0;i < n;i++)
		{
						 for (j = 0;j < n;j++)
						 {
										  if ((xiangsu[i][j] == 0) && (f == 1))
										  {
																	 head1 = i + 1;
																	 head2 = j + 1;
																	 f = 0;
										  }
										  if (xiangsu[i][j] == 0)
										  {
															   end1 = i - 1;
															   end2 = j - 1;
										  }
						 }
		}
		sum = (end1 - head1 + 1) * (end2 - head2 + 1);
		System.out.printf("%d",sum);
		System.in.read();
		System.in.read();
		return 0;
	}

}

