package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] x = new int[10][10];
	int a;
	int i;
	int j;
	int a1;
	int a2;
	int b1;
	int b2;
	int s;
	a1 = a2 = b1 = b2 = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= a;i++)
	{
		for (j = 1;j <= a;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i][j] = Integer.parseInt(tempVar2);
			}
		}
	}
	for (i = 1;i <= a;i++)
	{
		for (j = 1;j <= a;j++)
		{
			if (x[i][j] == 0)
			{
				a1 = i;
				b1 = j;

			}

		}



	}
	for (i = a;i >= 1;i--)
	{
		for (j = a;j >= 1;j--)
		{
			if (x[i][j] == 0)
			{
				a2 = i;
				b2 = j;

			}


		}


	}
	int c;
	int d;
	c = a1 - a2 - 1;
	d = b1 - b2 - 1;
	s = c * d;
	System.out.printf("%d",s);
	return 0;

	}
}

