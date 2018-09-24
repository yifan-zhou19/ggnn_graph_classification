package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int a = 0;
	int b = 0;
	int c = 0;
	int[][] y =
	{
		{1, 1},
		{1, 1},
		{1, 1},
		{1, 1},
		{1, 1},
		{1, 1},
		{1, 1},
		{1, 1},
		{1, 1},
		{1, 1}
	};
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= n - 1;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		y[i][1] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		y[i][2] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i <= n - 1;i++)
	{
		 if ((y[i][1] == 0 && y[i][2] == 1) || (y[i][1] == 1 && y[i][2] == 2) || (y[i][1] == 2 && y[i][2] == 0))
		 {
	   a = a + 1;
		 }
	else if (y[i][1] == y[i][2])
	{
	   c = c + 1;
	}
	else
	{
		b = b + 1;
	}
	}
	if (a > b)
	{
		System.out.print("A\n");
	}
	else if (a < b)
	{
		System.out.print("B\n");
	}
	else
	{
		System.out.print("Tie\n");
	}
	}

}

