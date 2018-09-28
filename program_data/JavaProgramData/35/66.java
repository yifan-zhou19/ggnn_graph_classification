package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int h;
		int l;
		int i;
		int j;
		int i0;
		int j0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				for (j0 = 0;j0 < l;j0++)
				{
					if (a[i][j0] > a[i][j])
					{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto loop;
					}
				}
				for (i0 = 0;i0 < h;i0++)
				{
					if (a[i0][j] < a[i][j])
					{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto loop;
					}
				}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto loop2;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	;
			}
		}
	if (true)
	{
		System.out.print("No");
	}
	else
	{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop2:
	System.out.printf("%d+%d",i,j);
	}
	}
}

