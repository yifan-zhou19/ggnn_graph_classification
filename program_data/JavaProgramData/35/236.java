package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[][] a = new int[8][8];
		int m;
		int n;
		int max;
		int c;
		int b;
		int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
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
			 a[i][j] = Integer.parseInt(tempVar3);
		 }
		}
	 }
	for (i = 0;i < m;i++)
	{
		max = a[i][0];
	c = 0;
	for (j = 0;j < n;j++)
	{
		if (max < a[i][j])
		{
			max = a[i][j];
			c = j;
		}
	}
	for (k = 0;k < m;k++)
	{
		if (max > a[k][c])
		{
			break;
		}
		else if (k == m - 1)
		{
			System.out.printf("%d+%d",i,c);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end;
		}
	}
	}
	System.out.print("No");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		a = Integer.parseInt(tempVar4);
	}
	}

}

