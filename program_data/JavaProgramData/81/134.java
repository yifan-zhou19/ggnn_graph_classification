package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int e;
		int n;
		int m;
		for (int k = 0;k < 5;k++)
		{
		for (int i = 0;i < 5;i++)
		{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[k][i] = Integer.parseInt(tempVar);
				}
		}
		}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	if (n > 4 || m > 4)
	{
	System.out.print("error");
	}
	else
	{
		for (int i = 0;i < 5;i++)
		{
	e = a[n][i];
	a[n][i] = a[m][i];
	a[m][i] = e;
		}
	for (int k = 0;k < 5;k++)
	{

			 for (int i = 0;i < 4;i++)
			 {
				System.out.printf("%d ", a[k][i]);
			 }
	 System.out.printf("%d\n", a[k][4]);

	}

	}
		return 0;
	}

}

