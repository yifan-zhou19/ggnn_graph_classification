package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[2][10];
		int i;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0][0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a[1][0] = Integer.parseInt(tempVar2);
		}

		for (i = 1;a[0][i] == 0;i++)
		{
			a[0][i] = a[0][i - 1] / 2;
		}

		for (j = 1;a[1][j] == 0;j++)
		{
			a[1][j] = a[1][j - 1] / 2;
		}

		for (i = 0;a[0][i] != 0;i++)
		{
			for (j = 0;a[1][j] != 0;j++)
			{
				if (a[0][i] == a[1][j])
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto k;
				}
			}
		}

//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	   k:
	   System.out.printf("%d",a[1][j]);
	}
}

