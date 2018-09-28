package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] sz = new int[5][5];
	int n;
	int m;
	int sw = new int(int csz[5][5],int * x,int * y);
	for (int i = 0;i < 5;i++)
	{
		for (int j = 0;j < 5;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sz[i][j] = Integer.parseInt(tempVar);
			}
		}
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
tangible.RefObject<Integer> tempRef_n = new tangible.RefObject<Integer>(n);
tangible.RefObject<Integer> tempRef_m = new tangible.RefObject<Integer>(m);
	if (sw(sz, tempRef_n, tempRef_m) == 1)
	{
		m = tempRef_m.argValue;
		n = tempRef_n.argValue;
		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
			   if (j == 4)
			   {
					  System.out.printf("%d\n",sz[i][j]);
			   }
			   else
			   {
					  System.out.printf("%d ",sz[i][j]);
			   }
			}
		}
	}
	else
	{
		m = tempRef_m.argValue;
		n = tempRef_n.argValue;
		  System.out.print("error");
	}
	return 0;
	}
	public static int sw(int[][] csz, tangible.RefObject<Integer> x, tangible.RefObject<Integer> y)
	{
		int e;
		if (x.argValue >= 0 && x.argValue < 5 && y.argValue >= 0 && y.argValue < 5)
		{
			 for (int k = 0;k < 5;k++)
			 {
				   e = csz[x.argValue][k];
				   csz[x.argValue][k] = csz[y.argValue][k];
				   csz[y.argValue][k] = e;
			 }
			 return 1;
		}
		else
		{
			 return 0;
		}
	}
}

