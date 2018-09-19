package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[1000][1000];
		int i;
		int j;
		int p;
		int q;
		int num1 = 0;
		int num2 = 0;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
						for (i = 0;i < n;i++)
						{
										String tempVar2 = ConsoleInput.scanfRead();
										if (tempVar2 != null)
										{
											a[j][i] = Integer.parseInt(tempVar2);
										}
						}
		}
		for (j = 0;j < n;j++)
		{
						for (i = 0;i < n;i++)
						{
										if (a[j][i] == 0)
										{
													  num1++;
													  p = j;
													  q = i;
										}
						}
						if (num1 != 0)
						{
								   break;
						}
		}
		for (j = p;a[j][q] == 0;j++)
		{
					 num2++;
		}
		sum = (num1 - 2) * (num2 - 2);
		System.out.printf("%d",sum);
		return 0;
	}

}

