package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int c;
	int r;
	int s;
	int[][] a = new int[100][100];
	s = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		r = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		c = Integer.parseInt(tempVar2);
	}
	for (int i = 0;i < r;i++)
	{
			for (int j = 0;j < c;j++)
			{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[i][j] = Integer.parseInt(tempVar3);
					}
			}
	}
	while (c * r >= s)
	{
	for (int i = 0;i < r;i++)
	{
			for (int j = 0;j < c;j++)
			{
			   if (i + j == s)
			   {
						 System.out.printf("%d\n",a[i][j]);
			   }
			}
	}
			s++;
	}
	int hou;
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		hou = Integer.parseInt(tempVar4);
	}
	return 0;
	}

}

