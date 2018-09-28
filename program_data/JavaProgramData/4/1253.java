package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int r;
	int c;
	int i;
	int j;
	int[][] a = new int[101][101];
	int p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		r = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		c = Integer.parseInt(tempVar2);
	}
	for (i = 1;i <= r;i++)
	{
	  for (j = 1;j <= c;j++)
	  {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[i][j] = Integer.parseInt(tempVar3);
	   }
	  }
	}
	for (p = 2;p <= r + c;p++)
	{
	if (p - 1 <= c)
	{
	i = 1;
	j = p - i;
	}
	else
	{
		j = c;
		i = p - j;
	}
	while (i >= 1 && j >= 1 && i <= r != 0 && j <= c)
	{
		System.out.printf("%d\n",a[i][j]);
		i++;
		j--;
	}
	}
	return 0;
	}


}

