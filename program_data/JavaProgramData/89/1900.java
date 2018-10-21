package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int b;
		int c;
		int d;
	int[][] a = new int[1000000][2];
	int e;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < 1000000;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i][0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a[i][1] = Integer.parseInt(tempVar3);
		}
	if (0 == a[i][0] && 0 == a[i][1])
	{
		e = i;
	break;
	}
	}
	//printf("%d\n",e);
	for (i = 0;i < n;i++)
	{
	for (j = 0;j <= e;j++)
	{
		if (i == a[j][0])
		{
		b = 0;
	break;
		}
	else
	{
	b = 1;
	}
	}
	//printf("%d %d\n",i,b) ;
	if (1 == b)
	{
		c = i;
	//printf("%d",j);
	break;
	}
	}
	if (n == i)
	{
		System.out.print("NOT FOUND");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	goto end;
	}
	d = 0;
	for (i = 0;i <= e;i++)
	{
		if (c == a[i][1])
		{
	d = d + 1;
		}
	}
	if ((n - 1) == d)
	{
	System.out.printf("%d",c);
	}
	else
	{
	System.out.print("NOT FOUND");
	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
	return 0;
	}

}

