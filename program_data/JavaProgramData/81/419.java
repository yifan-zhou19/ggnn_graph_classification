package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int m;
		int c;
		int b;
		int x;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		for (m = 0;m < 5;m++)
		{
			for (i = 0;i < 4;i++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[m][i] = Integer.parseInt(tempVar);
			}
			}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[m][4] = Integer.parseInt(tempVar2);
		}
		}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		b = Integer.parseInt(tempVar4);
	}
	if (c >= 0 && c <= 4 && b >= 0 && b <= 4)
	{
		for (i = 0;i < 5;i++)
		{
		x = a[c][i];
		a[c][i] = a[b][i];
		a[b][i] = x;
		}
	for (m = 0;m < 5;m++)
	{
			for (i = 0;i < 4;i++)
			{
			System.out.printf("%d ",a[m][i]);
			}
	System.out.printf("%d\n",a[m][4]);
	}
	}
	else
	{
		System.out.print("error");
	}
	}



}

